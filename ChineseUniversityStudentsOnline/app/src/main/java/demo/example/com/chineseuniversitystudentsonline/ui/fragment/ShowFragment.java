package demo.example.com.chineseuniversitystudentsonline.ui.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.HashMap;
import java.util.Map;

import demo.example.com.chineseuniversitystudentsonline.R;
import demo.example.com.chineseuniversitystudentsonline.base.BaseFragment;
import demo.example.com.chineseuniversitystudentsonline.net.NetContract;
import demo.example.com.chineseuniversitystudentsonline.net.NetModel;
import demo.example.com.chineseuniversitystudentsonline.net.NetPresenter;

/**
 * Created by 丁军明 on 2017/12/1.
 */

public class ShowFragment extends BaseFragment<NetPresenter, NetModel> implements NetContract.View {
    private WebView mWebView;
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
    protected void initView(View view) {
        mWebView = view.findViewById(R.id.WebView);
        new HomeFragment().setData(new HomeFragment.setResult() {
            @Override
            public void setResult(int str) {
                index = str;
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_show;
    }


}
