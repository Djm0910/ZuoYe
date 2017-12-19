package demo.example.com.chineseuniversitystudentsonline.ui.activity;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import demo.example.com.chineseuniversitystudentsonline.R;
import demo.example.com.chineseuniversitystudentsonline.base.BaseActivity;
import demo.example.com.chineseuniversitystudentsonline.net.NetContract;
import demo.example.com.chineseuniversitystudentsonline.net.NetModel;
import demo.example.com.chineseuniversitystudentsonline.net.NetPresenter;
import demo.example.com.chineseuniversitystudentsonline.ui.fragment.HomeFragment;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class LoadMoreActivity extends BaseActivity<NetPresenter, NetModel> implements NetContract.View {
    private WebView mWebView;
    private Toolbar mToolbar;
    private int index = 0;
    @Override
    public void show(String ss) {

    }

    @Override
    protected void initData() {
        mWebView.loadUrl("http://m.univs.cn/article/" + index);

        mWebView.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
    }

    @Override
    protected void initView() {
        mWebView = (WebView) findViewById(R.id.WebView);
        mToolbar = (Toolbar) findViewById(R.id.ToolBar);
        mToolbar.setNavigationIcon(R.drawable.back);
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        new HomeFragment().setData(new HomeFragment.setResult() {
            @Override
            public void setResult(int str) {
                index = str;
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_laodmore;
    }
}
