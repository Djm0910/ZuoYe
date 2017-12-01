package demo.example.com.chineseuniversitystudentsonline.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import demo.example.com.chineseuniversitystudentsonline.Entiy.TouTian;
import demo.example.com.chineseuniversitystudentsonline.R;
import demo.example.com.chineseuniversitystudentsonline.adapter.MyRecyAdapter;
import demo.example.com.chineseuniversitystudentsonline.base.BaseFragment;
import demo.example.com.chineseuniversitystudentsonline.net.NetContract;
import demo.example.com.chineseuniversitystudentsonline.net.NetModel;
import demo.example.com.chineseuniversitystudentsonline.net.NetPresenter;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class HomeFragment extends BaseFragment<NetPresenter, NetModel> implements NetContract.View {
    private RecyclerView mRecy;
    private List<TouTian.DataBean> mList = new ArrayList<>();
    private MyRecyAdapter myRecyAdapter;
    private ArrayList<String> mUrl = new ArrayList<>();
    private boolean mBoo = true;
    private int pageIndex = 0;
    private int i = 0;


    @Override
    public void show(String ss) {
        Gson gson = new Gson();
        final TouTian touTian = gson.fromJson(ss, TouTian.class);
        mList = touTian.getData();
        if (mBoo) {
            mUrl.add("http://upload.univs.cn/2017/1126/thumb_640_314_1511675972339.jpg");
            mUrl.add("http://upload.univs.cn/2017/1114/1510638210291.jpg");
            mUrl.add("http://upload.univs.cn/2017/0619/thumb_640_314_1497839124349.jpg");
            mBoo = false;
        }

        myRecyAdapter = new MyRecyAdapter(mList, getActivity(), mUrl);
        mRecy.setAdapter(myRecyAdapter);
        myRecyAdapter.OnItemClick(new MyRecyAdapter.OnItem() {
            @Override
            public void setData(View view, int position) {
                Toast.makeText(getActivity(), "你很菜", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void initData() {
        getDataByPage(pageIndex);
    }

    private void getDataByPage(int pageIndex) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("app", "mobile");
        map.put("type", "mobile");
        map.put("catid",pageIndex );
        map.put("controller", "content");
        map.put("action", "index");
        map.put("page", 1);
        map.put("time", "0");
        presenter.getDataFromModel("http://mapi.univs.cn/mobile/index.php", map);
    }

    @Override
    protected void initView(View view) {
        mRecy = view.findViewById(R.id.Recy);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mRecy.setLayoutManager(linearLayoutManager);
        Bundle arguments = getArguments();
        pageIndex = arguments.getInt("index");

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

}
