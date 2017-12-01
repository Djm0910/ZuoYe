package demo.example.com.chineseuniversitystudentsonline.ui.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.androidkun.PullToRefreshRecyclerView;
import com.androidkun.callback.PullToRefreshListener;
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
import demo.example.com.chineseuniversitystudentsonline.utils.FragmentBuilder;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class HomeFragment extends BaseFragment<NetPresenter, NetModel> implements NetContract.View {
    private PullToRefreshRecyclerView mRecy;
    private List<TouTian.DataBean> mList = new ArrayList<>();
    private MyRecyAdapter myRecyAdapter;
    private ArrayList<String> mUrl = new ArrayList<>();
    private boolean mBoo = true;
    private int pageIndex = 0;
    private FrameLayout frameLayout;
    private TouTian touTian;
    private Handler handler = new Handler();
    private static int contentid;

    @Override
    public void show(String ss) {
        Gson gson = new Gson();
        touTian = gson.fromJson(ss, TouTian.class);
        mList = touTian.getData();
        if (mBoo) {
            mUrl.add("http://upload.univs.cn/2017/1126/thumb_640_314_1511675972339.jpg");
            mUrl.add("http://upload.univs.cn/2017/1114/1510638210291.jpg");
            mUrl.add("http://upload.univs.cn/2017/0619/thumb_640_314_1497839124349.jpg");
            mBoo = false;
        }
        mRecy.setRefreshComplete();

        myRecyAdapter = new MyRecyAdapter(mList, getActivity(), mUrl);
        mRecy.setAdapter(myRecyAdapter);
        myRecyAdapter.OnItemClick(new MyRecyAdapter.OnItem() {
            @Override
            public void setData(View view, int position) {
                Toast.makeText(getActivity(), "hello", Toast.LENGTH_SHORT).show();
                contentid = mList.get(position).getContentid();
                FragmentBuilder.getInstance().init().add(R.id.Fragment, ShowFragment.class, true).Builder();
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
        map.put("catid", pageIndex);
        map.put("controller", "content");
        map.put("action", "index");
        map.put("page", 1);
        map.put("time", "0");
        presenter.getDataFromModel("http://mapi.univs.cn/mobile/index.php", map);
    }

    @Override
    protected void initView(final View view) {
        mRecy = view.findViewById(R.id.Recy);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecy.setLayoutManager(linearLayoutManager);
        Bundle arguments = getArguments();
        pageIndex = arguments.getInt("index");

        mRecy.setPullRefreshEnabled(true);
        mRecy.setLoadingMoreEnabled(true);
        mRecy.displayLastRefreshTime(true);
        mRecy.setPullToRefreshListener(new PullToRefreshListener() {
            @Override
            public void onRefresh() {

                //模拟没有数据的情况
                //data.clear();
                mRecy = (PullToRefreshRecyclerView) view.findViewById(R.id.Recy);
                myRecyAdapter = new MyRecyAdapter(mList, getActivity(), mUrl);
                LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext());

                mRecy.setLayoutManager(manager);
                getDataByPage(pageIndex);
                myRecyAdapter.notifyDataSetChanged();
            }

            @Override
            public void onLoadMore() {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRecy.setLoadMoreComplete();
                        //模拟加载数据的情况
                        mList.addAll(touTian.getData());
                        myRecyAdapter.notifyDataSetChanged();
                    }
                }, 2000);

            }
        });

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    public void setData(setResult inter) {
        inter.setResult(contentid);
    }

    public interface setResult {
        void setResult(int str);
    }
    
}
