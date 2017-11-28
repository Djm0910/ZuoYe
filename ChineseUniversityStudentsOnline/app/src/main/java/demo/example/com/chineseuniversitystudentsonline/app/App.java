package demo.example.com.chineseuniversitystudentsonline.app;

import android.app.Application;

import demo.example.com.chineseuniversitystudentsonline.base.BaseActivity;
import demo.example.com.chineseuniversitystudentsonline.base.BaseFragment;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class App extends Application {
    public static BaseActivity mActivity;
    public static BaseFragment mLastFragment;
}
