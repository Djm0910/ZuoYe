package demo.example.com.chineseuniversitystudentsonline.testcount;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.umeng.analytics.MobclickAgent;

import demo.example.com.chineseuniversitystudentsonline.R;


/**
 * Created by lvxinxin on 2017/10/29.
 */

public class TestCountActivity extends Activity {
    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("sdf","dsfsfd");
        MobclickAgent.onPageStart("TestCountActivity");
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        Log.e("onPause","onPause");
        super.onPause();
        MobclickAgent.onPause(this);
    }
}
