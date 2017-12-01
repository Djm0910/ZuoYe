package demo.example.com.chineseuniversitystudentsonline.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import demo.example.com.chineseuniversitystudentsonline.Entiy.Tab;
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
import demo.example.com.chineseuniversitystudentsonline.ui.fragment.TuiSongFragment;
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
    private TuiSongFragment mTuiSongFragment;
    private ViewPager mViewPager;
    private MyViewAdapter myAdapter;
    private Button mAdd;


    @Override
    protected void initData() {
        mPresenter.getDataFromModel("http://mapi.univs.cn/mobile/index.php?app=mobile&type=mobile&controller=content&action=category");

    }

    @Override
    protected void initView() {
        initTab();
        initViewPager();


    }

    private void initViewPager() {
        mViewPager = (ViewPager) findViewById(R.id.ViewPager);
        mHomeFragment = new HomeFragment();
        mCampaignFragment = new CampaignFragment();
        mCampusFragment = new CampusFragment();
        mClassroomFragment = new ClassroomFragment();
        mObtainFragment = new ObtainFragment();
        mTuiSongFragment = new TuiSongFragment();
        mList.add(mHomeFragment);
        mList.add(mObtainFragment);
        mList.add(mCampusFragment);
        mList.add(mClassroomFragment);
        mList.add(mCampaignFragment);
        mList.add(mTuiSongFragment);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    private void initTab() {
        mTabLayout = (TabLayout) findViewById(R.id.TabLayout);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void show(String ss) {
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
        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LoadMoreActivity.class);
                startActivity(intent);
            }
        });

    }
}
