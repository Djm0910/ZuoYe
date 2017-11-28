package demo.example.com.chineseuniversitystudentsonline.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.example.com.chineseuniversitystudentsonline.app.App;
import demo.example.com.chineseuniversitystudentsonline.utils.TUtils;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public abstract class BaseActivity<P extends BasePresenter,M extends BaseModel> extends AppCompatActivity {
    private int layoutId;
    public P mPresenter;
    public M mModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        App.mActivity=this;
        mPresenter = TUtils.getT(this,0);
        mModel = TUtils.getT(this,1);

        if (this instanceof BaseView ) {
            mPresenter.setVM(mModel,this);
        }
        initView();
        initData();


    }

    protected abstract void initData();


    protected abstract void initView();

    public abstract int getLayoutId();
}

