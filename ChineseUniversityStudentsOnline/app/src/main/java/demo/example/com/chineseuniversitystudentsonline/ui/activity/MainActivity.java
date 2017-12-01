package demo.example.com.chineseuniversitystudentsonline.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

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

public class MainActivity extends BaseActivity<NetPresenter, NetModel> implements NetContract.View {

    private TabLayout mTabLayout;
    private ArrayList<Fragment> mList = new ArrayList<>();
    private ArrayList<String> mTitle = new ArrayList<>();
    private HomeFragment mHomeFragment;

    private ViewPager mViewPager;
    private MyViewAdapter myAdapter;
    private Button mAdd;
    private int i = 1;
    private int pageIndex = 1;


    @Override
    protected void initData() {
        getDataByPage(0);

    }
    private void getDataByPage(int pageIndex) {
        Map<String,Object> map=new HashMap<String, Object>();

        map.put("app","mobile");
        map.put("type","mobile");
        map.put("controller","content");
        map.put("action","category");
        mPresenter.getDataFromModel("http://mapi.univs.cn/mobile/index.php",map);

    }

    @Override
    protected void initView() {
        initTab();
        getData(i);
    }


    private void getData(int i) {
        mHomeFragment = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("index",pageIndex);
        mHomeFragment.setArguments(bundle);
        mList.add(mHomeFragment);
        pageIndex++;
    }

    private void initTab() {
        mTabLayout = (TabLayout) findViewById(R.id.TabLayout);
        mViewPager = (ViewPager) findViewById(R.id.ViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void show(String ss) {
        Log.e("url",ss);
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
                if (i < mTitle.size()) {
                    i++;
                    getData(i);
                    myAdapter.notifyDataSetChanged();
                }
            }
        });

    }
}
