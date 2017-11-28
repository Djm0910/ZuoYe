package demo.example.com.chineseuniversitystudentsonline.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import demo.example.com.chineseuniversitystudentsonline.Entiy.JiuYe;
import demo.example.com.chineseuniversitystudentsonline.R;
import demo.example.com.chineseuniversitystudentsonline.adapter.MyRecyAdapter2;
import demo.example.com.chineseuniversitystudentsonline.base.BaseFragment;
import demo.example.com.chineseuniversitystudentsonline.net.NetContract;
import demo.example.com.chineseuniversitystudentsonline.net.NetModel;
import demo.example.com.chineseuniversitystudentsonline.net.NetPresenter;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class ObtainFragment extends BaseFragment<NetPresenter, NetModel> implements NetContract.View {
    private RecyclerView mRecy;
    private List<JiuYe.DataBean> mList = new ArrayList<>();
    private MyRecyAdapter2 myRecyAdapter;
    private ArrayList<String> mUrl = new ArrayList<>();
    private boolean mBoo = true;

    @Override
    public void show(String ss) {
        Gson gson = new Gson();
        JiuYe jiuYe = gson.fromJson(ss, JiuYe.class);
        mList = jiuYe.getData();
        if (mBoo) {
            mUrl.add("http://upload.univs.cn/2017/0424/1493040123828.jpg");
            mUrl.add("http://upload.univs.cn/2017/0424/thumb_640_314_1493022268406.jpg");
            mUrl.add("http://upload.univs.cn/2017/0417/thumb_640_314_1492433907753.png");
            mBoo = false;
        }
        myRecyAdapter = new MyRecyAdapter2(getActivity(), mList, mUrl);
        mRecy.setAdapter(myRecyAdapter);
        myRecyAdapter.OnItemClick(new MyRecyAdapter2.OnItem() {
            @Override
            public void setData(View view, int position) {
                Toast.makeText(getActivity(), "你很菜", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void initData() {
        presenter.getDataFromModel("http://mapi.univs.cn/mobile/index.php?app=mobile&type=mobile&catid=5&controller=content&action=index&page=1&time=0");
    }

    @Override
    protected void initView(View view) {
        mRecy = view.findViewById(R.id.Recy);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mRecy.setLayoutManager(linearLayoutManager);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fargment_obtain;
    }
}
