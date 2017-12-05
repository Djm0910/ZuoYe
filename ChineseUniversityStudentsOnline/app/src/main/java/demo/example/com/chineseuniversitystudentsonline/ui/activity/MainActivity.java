package demo.example.com.chineseuniversitystudentsonline.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import demo.example.com.chineseuniversitystudentsonline.Entiy.Tab;
import demo.example.com.chineseuniversitystudentsonline.R;
import demo.example.com.chineseuniversitystudentsonline.adapter.MyViewAdapter;
import demo.example.com.chineseuniversitystudentsonline.base.BaseActivity;
import demo.example.com.chineseuniversitystudentsonline.net.NetContract;
import demo.example.com.chineseuniversitystudentsonline.net.NetModel;
import demo.example.com.chineseuniversitystudentsonline.net.NetPresenter;
import demo.example.com.chineseuniversitystudentsonline.ui.fragment.HomeFragment;

public class MainActivity extends BaseActivity<NetPresenter, NetModel> implements NetContract.View, View.OnClickListener {

    private TabLayout mTabLayout;
    private Toolbar mToolbar;
    private ArrayList<Fragment> mList = new ArrayList<>();
    private ArrayList<String> mTitle = new ArrayList<>();
    private HomeFragment mHomeFragment;

    private ViewPager mViewPager;
    private MyViewAdapter myAdapter;
    private Button mAdd, mNight,mDay;
    private int i = 1;
    private int pageIndex = 1;
    private UMAuthListener umAuthListener = new UMAuthListener() {

        @Override
        public void onStart(SHARE_MEDIA share_media) {

        }

        @Override
        public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {

        }

        @Override
        public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {

        }

        @Override
        public void onCancel(SHARE_MEDIA share_media, int i) {

        }
    };

    private UMShareListener umShareListener = new UMShareListener() {

        @Override
        public void onStart(SHARE_MEDIA share_media) {

        }

        @Override
        public void onResult(SHARE_MEDIA share_media) {

        }

        @Override
        public void onError(SHARE_MEDIA share_media, Throwable throwable) {

        }

        @Override
        public void onCancel(SHARE_MEDIA share_media) {

        }
    };


    @Override
    protected void initData() {
        getDataByPage(0);

    }

    private void getDataByPage(int pageIndex) {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("app", "mobile");
        map.put("type", "mobile");
        map.put("controller", "content");
        map.put("action", "category");
        mPresenter.getDataFromModel("http://mapi.univs.cn/mobile/index.php", map);

    }

    @Override
    protected void initView() {
        initTab();
        getData(i);
        mNight = (Button) findViewById(R.id.Btn_Night);
        mNight.setOnClickListener(this);
        mDay = (Button) findViewById(R.id.Btn_Day);
        mDay.setOnClickListener(this);
    }


    private void getData(int i) {
        mHomeFragment = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("index", pageIndex);
        mHomeFragment.setArguments(bundle);
        mList.add(mHomeFragment);
        pageIndex++;
    }

    private void initTab() {
        mTabLayout = (TabLayout) findViewById(R.id.TabLayout);
        mViewPager = (ViewPager) findViewById(R.id.ViewPager);
        mToolbar = (Toolbar) findViewById(R.id.ToolBar);
        mToolbar.setNavigationIcon(R.drawable.back);
        setSupportActionBar(mToolbar);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Options_One:
                new ShareAction(MainActivity.this)
                        .withText("hello")
                        .setDisplayList(SHARE_MEDIA.SINA, SHARE_MEDIA.QQ)
                        .setCallback(umShareListener)
                        .open();

                break;
            case R.id.Options_Two:
                UMShareAPI mShareAPI = UMShareAPI.get(this);
                mShareAPI.doOauthVerify(MainActivity.this, SHARE_MEDIA.QQ, umAuthListener);
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void show(String ss) {
        Log.e("url", ss);
        Gson gson = new Gson();
        Tab tab = gson.fromJson(ss, Tab.class);
        List<Tab.DataBean> data = tab.getData();
        for (int i = 0; i < data.size(); i++) {
            mTitle.add(data.get(i).getName());
        }
        myAdapter = new MyViewAdapter(getSupportFragmentManager(), mList, mTitle);
        mViewPager.setAdapter(myAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mAdd = (Button) findViewById(R.id.Btn_add);
        mAdd.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Btn_add:
                if (i < mTitle.size()) {
                    i++;
                    getData(i);
                    myAdapter.notifyDataSetChanged();
                }
                break;
            case R.id.Btn_Night:
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);//切换夜间模式
                recreate();//重新启动当前activity
                break;
            case R.id.Btn_Day:
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);//切换日间模式
                recreate();//重新启动当前activity
        }
    }
}
