package demo.example.com.chineseuniversitystudentsonline.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import demo.example.com.chineseuniversitystudentsonline.Entiy.XiaoYuan;
import demo.example.com.chineseuniversitystudentsonline.R;
import demo.example.com.chineseuniversitystudentsonline.adapter.MyRecyAdapter1;
import demo.example.com.chineseuniversitystudentsonline.base.BaseFragment;
import demo.example.com.chineseuniversitystudentsonline.net.NetContract;
import demo.example.com.chineseuniversitystudentsonline.net.NetModel;
import demo.example.com.chineseuniversitystudentsonline.net.NetPresenter;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class CampusFragment  extends BaseFragment<NetPresenter,NetModel> implements NetContract.View {
    private RecyclerView mRecy;
    private List<XiaoYuan.DataBean> mList = new ArrayList<>();
    private MyRecyAdapter1 myRecyAdapter;
    private ArrayList<String> mUrl = new ArrayList<>();
    private boolean mBoo = true;


    @Override
    public void show(String ss) {
        Gson gson = new Gson();
        XiaoYuan xiaoYuan = gson.fromJson(ss, XiaoYuan.class);
        mList = xiaoYuan.getData();
        if (mBoo){
            mUrl.add("http://upload.univs.cn/2017/1127/thumb_640_314_1511748883720.jpg");
            mUrl.add("http://upload.univs.cn/2017/0927/1506480713100.png");
            mUrl.add("http://upload.univs.cn/2017/0927/thumb_640_314_1506480759630.jpg");
            mBoo = false;
        }

        myRecyAdapter = new MyRecyAdapter1(mList, getActivity(), mUrl);
        mRecy.setAdapter(myRecyAdapter);
        myRecyAdapter.OnItemClick(new MyRecyAdapter1.OnItem() {
            @Override
            public void setData(View view, int position) {
                Toast.makeText(getActivity(), "你很菜", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void initData() {
        presenter.getDataFromModel("http://mapi.univs.cn/mobile/index.php?app=mobile&type=mobile&catid=2&controller=content&action=index&page=1&time=0");
    }

    @Override
    protected void initView(View view) {
        mRecy = view.findViewById(R.id.Recy);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mRecy.setLayoutManager(linearLayoutManager);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_campus;
    }
}
