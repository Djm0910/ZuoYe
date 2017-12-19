package demo.example.com.chineseuniversitystudentsonline.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import demo.example.com.chineseuniversitystudentsonline.app.App;
import demo.example.com.chineseuniversitystudentsonline.base.BaseFragment;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class FragmentBuilder {
    private static  volatile FragmentBuilder fragmentBuilder;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private Fragment fragment;
    private BaseFragment instance;

    public FragmentBuilder() {

    }

    public static FragmentBuilder getInstance() {
        if (fragmentBuilder == null) {
            synchronized (FragmentBuilder.class){
                fragmentBuilder=new FragmentBuilder();
            }
        }
        return fragmentBuilder;
    }


    public FragmentBuilder init(){
        manager = App.mActivity.getSupportFragmentManager();
        transaction = manager.beginTransaction();
        return this;
    }


    public FragmentBuilder add(int containerId,Class<? extends BaseFragment> fragmentClass,boolean childFragment){

        //使用Fragment名字设置一个tag值
        String tag=fragmentClass.getSimpleName();
        //使用tag值来判断当前的Fragment是否实例化了
        fragment = (BaseFragment) manager.findFragmentByTag(tag);

        //判断拿到的
        if (fragment == null) {
            try {
                //使用单利方法来创建一个Fragmengt对象
                fragment = fragmentClass.newInstance();
                //然后调用add方法添加到容器里面
                transaction.add(containerId,fragment,tag);
                //调用添加回退栈方法添加到栈管理里面

                transaction.addToBackStack(tag);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace() ;
            }

        }

        if (!childFragment){
            if (App.mLastFragment != null) {
                transaction.hide(App.mLastFragment);
            }
        }


        //调用show方法显示当前的fragment

        transaction.show(fragment);


        return this;
    }


    public void Builder(){

        App.mLastFragment= (BaseFragment) fragment;

        transaction.commit();
    }

}
