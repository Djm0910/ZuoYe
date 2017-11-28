package demo.example.com.chineseuniversitystudentsonline.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import demo.example.com.chineseuniversitystudentsonline.R;
import demo.example.com.chineseuniversitystudentsonline.adapter.MyViewAdapter;
import demo.example.com.chineseuniversitystudentsonline.base.BaseActivity;
import demo.example.com.chineseuniversitystudentsonline.net.NetContract;
import demo.example.com.chineseuniversitystudentsonline.net.NetModel;
import demo.example.com.chineseuniversitystudentsonline.net.NetPresenter;
import demo.example.com.chineseuniversitystudentsonline.ui.fragment.AddFragment;
import demo.example.com.chineseuniversitystudentsonline.ui.fragment.CampaignFragment;
import demo.example.com.chineseuniversitystudentsonline.ui.fragment.CampusFragment;
import demo.example.com.chineseuniversitystudentsonline.ui.fragment.ClassroomFragment;
import demo.example.com.chineseuniversitystudentsonline.ui.fragment.HomeFragment;
import demo.example.com.chineseuniversitystudentsonline.ui.fragment.ObtainFragment;
import demo.example.com.chineseuniversitystudentsonline.utils.FragmentBuilder;

public class MainActivity extends BaseActivity<NetPresenter, NetModel> implements NetContract.View {

    private TabLayout mTabLayout;
    private ArrayList<Fragment> mList = new ArrayList<>();
    private ArrayList<String> mTitle = new ArrayList<>();
    private HomeFragment mHomeFragment;
    private CampaignFragment mCampaignFragment;
    private CampusFragment mCampusFragment;
    private ClassroomFragment mClassroomFragment;
    private ObtainFragment mObtainFragment;
    private ViewPager mViewPager;
    private MyViewAdapter myAdapter;
    private Button mAdd;


    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        initTab();
        initViewPager();
        myAdapter = new MyViewAdapter(getSupportFragmentManager(), mList, mTitle);
        mViewPager.setAdapter(myAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mAdd = (Button) findViewById(R.id.Btn_add);
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LoadMoreActivity.class);
                startActivity(intent);
            }
        });

    }

    private void initViewPager() {
        mViewPager = (ViewPager) findViewById(R.id.ViewPager);
        mHomeFragment = new HomeFragment();
        mCampaignFragment = new CampaignFragment();
        mCampusFragment = new CampusFragment();
        mClassroomFragment = new ClassroomFragment();
        mObtainFragment = new ObtainFragment();
        mList.add(mHomeFragment);
        mList.add(mCampaignFragment);
        mList.add(mCampusFragment);
        mList.add(mClassroomFragment);
        mList.add(mObtainFragment);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    private void initTab() {
        mTabLayout = (TabLayout) findViewById(R.id.TabLayout);
        mTitle.add("头条");
        mTitle.add("校园");
        mTitle.add("就业");
        mTitle.add("课堂");
        mTitle.add("活动");
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void show(String ss) {

    }
}
