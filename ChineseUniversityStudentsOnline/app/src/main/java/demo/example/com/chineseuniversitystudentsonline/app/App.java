package demo.example.com.chineseuniversitystudentsonline.app;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.umeng.analytics.MobclickAgent;
import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

import demo.example.com.chineseuniversitystudentsonline.DaoMaster;
import demo.example.com.chineseuniversitystudentsonline.DaoSession;
import demo.example.com.chineseuniversitystudentsonline.base.BaseActivity;
import demo.example.com.chineseuniversitystudentsonline.base.BaseFragment;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class App extends Application {
    public static BaseActivity mActivity;
    public static BaseFragment mLastFragment;
    public static App app;
    private DaoSession mDaoSe;

    {
        PlatformConfig.setWeixin("wx967daebe835fbeac", "5bb696d9ccd75a38c8a0bfe0675559b3");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad", "http://sns.whalecloud.com");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        createData();
        Log.e("TAG", "Application:onCreate");
        //SDK初始化
        UMShareAPI.get(this);
        //数据统计
        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_NORMAL);
        //打开友盟的日志
        Config.DEBUG = true;
    }

    public static App getApp() {
        return app;
    }

    private void createData() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(app, "car.db");
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDatabase());
        mDaoSe = daoMaster.newSession();
    }

    public DaoSession getSession() {
        return mDaoSe;
    }
}
