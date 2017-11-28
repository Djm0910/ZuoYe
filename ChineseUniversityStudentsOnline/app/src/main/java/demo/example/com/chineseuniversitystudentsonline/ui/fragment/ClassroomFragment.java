package demo.example.com.chineseuniversitystudentsonline.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import demo.example.com.chineseuniversitystudentsonline.Entiy.KeTang;
import demo.example.com.chineseuniversitystudentsonline.R;
import demo.example.com.chineseuniversitystudentsonline.adapter.MyRecyAdapter;
import demo.example.com.chineseuniversitystudentsonline.adapter.MyRecyAdapter3;
import demo.example.com.chineseuniversitystudentsonline.base.BaseFragment;
import demo.example.com.chineseuniversitystudentsonline.net.NetContract;
import demo.example.com.chineseuniversitystudentsonline.net.NetModel;
import demo.example.com.chineseuniversitystudentsonline.net.NetPresenter;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class ClassroomFragment extends BaseFragment<NetPresenter,NetModel> implements NetContract.View  {
    private RecyclerView mRecy;
    private List<KeTang.DataBean> mList = new ArrayList<>();
    private MyRecyAdapter3 myRecyAdapter;
    private ArrayList<String> mUrl = new ArrayList<>();
    private boolean mBoo = true;


    @Override
    public void show(String ss) {
        Gson gson = new Gson();
        KeTang keTang = gson.fromJson(ss, KeTang.class);
        mList = keTang.getData();
        if (mBoo){
            mUrl.add("http://upload.univs.cn/2017/0807/1502069949830.png");
            mUrl.add("http://upload.univs.cn/2016/1122/1479797095206.png");
            mUrl.add("http://upload.univs.cn/2016/1114/thumb_640_314_1479103823901.jpg");
            mBoo = false;
        }

        myRecyAdapter = new MyRecyAdapter3(mList, mUrl, getActivity());
        mRecy.setAdapter(myRecyAdapter);
        myRecyAdapter.OnItemClick(new MyRecyAdapter3.OnItem() {
            @Override
            public void setData(View view, int position) {
                Toast.makeText(getActivity(), "你很菜", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void initData() {
        presenter.getDataFromModel("http://mapi.univs.cn/mobile/index.php?app=mobile&type=mobile&catid=3&controller=content&action=index&page=1&time=0");
    }

    @Override
    protected void initView(View view) {
        mRecy = view.findViewById(R.id.Recy);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mRecy.setLayoutManager(linearLayoutManager);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_classroom;
    }
}
