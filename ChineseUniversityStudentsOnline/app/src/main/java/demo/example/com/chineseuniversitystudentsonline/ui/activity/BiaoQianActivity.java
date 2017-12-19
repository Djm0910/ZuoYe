package demo.example.com.chineseuniversitystudentsonline.ui.activity;


import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import co.lujun.androidtagview.TagContainerLayout;
import co.lujun.androidtagview.TagView;
import demo.example.com.chineseuniversitystudentsonline.Entiy.MyTab;
import demo.example.com.chineseuniversitystudentsonline.MyTabDao;
import demo.example.com.chineseuniversitystudentsonline.R;
import demo.example.com.chineseuniversitystudentsonline.app.App;
import demo.example.com.chineseuniversitystudentsonline.base.BaseActivity;
import demo.example.com.chineseuniversitystudentsonline.net.NetModel;
import demo.example.com.chineseuniversitystudentsonline.net.NetPresenter;


public class BiaoQianActivity extends BaseActivity<NetPresenter, NetModel> {
    private TagContainerLayout mtag;
    private TagContainerLayout mtagOne;
    private List<String> list = new ArrayList<>();
    private List<String> list1 = new ArrayList<>();
    private Toolbar toolbar;
    private MyTabDao myTabDao;


    @Override
    public int getLayoutId() {
        return R.layout.biaoqian_activity;
    }

    @Override
    protected void initData() {

    }

    @Override
    public void initView() {
        myTabDao = App.getApp().getSession().getMyTabDao();
        mtag = (TagContainerLayout) findViewById(R.id.tagConTaierlayout);
        mtagOne = (TagContainerLayout) findViewById(R.id.tagConTaierlayoutone);
        toolbar = (Toolbar) findViewById(R.id.toobal_two);
        toolbar.setNavigationIcon(R.drawable.back);

        initList();
        mtag.setTags(list);
        mtagOne.setTags(list1);


        mtag.setOnTagClickListener(new TagView.OnTagClickListener() {
            @Override
            public void onTagClick(int position, String text) {
                if (list.size() > 1) {
                    switch (position) {
                        case 0:
                            list1.add(text);
                            mtagOne.setTags(list1);
                            mtag.removeTag(position);
                            list.remove(position);
                            break;
                        case 1:

                            list1.add(text);
                            mtagOne.setTags(list1);
                            mtag.removeTag(position);
                            list.remove(position);
                            break;
                        case 2:

                            list1.add(text);
                            mtagOne.setTags(list1);
                            mtag.removeTag(position);
                            list.remove(position);
                            break;
                        case 3:

                            list1.add(text);
                            mtagOne.setTags(list1);
                            mtag.removeTag(position);
                            list.remove(position);
                            break;
                        case 4:

                            list1.add(text);
                            mtagOne.setTags(list1);
                            mtag.removeTag(position);
                            list.remove(position);
                            break;
                        case 5:
                            list1.add(text);
                            mtagOne.setTags(list1);
                            mtag.removeTag(position);
                            list.remove(position);
                            break;

                    }
                } else {
                    Toast.makeText(BiaoQianActivity.this, "您必须留一个", Toast.LENGTH_SHORT).show();
                }
            }


            @Override
            public void onTagLongClick(int position, String text) {
            }


        });

        mtagOne.setOnTagClickListener(new TagView.OnTagClickListener() {
            @Override
            public void onTagClick(int position, String text) {
                switch (position) {
                    case 0:

                        list.add(text);
                        mtag.setTags(list);
                        mtagOne.removeTag(position);
                        list1.remove(position);
                        break;
                    case 1:

                        list.add(text);
                        mtag.setTags(list);
                        mtagOne.removeTag(position);
                        list1.remove(position);
                        break;
                    case 2:

                        list.add(text);
                        mtag.setTags(list);
                        mtagOne.removeTag(position);
                        list1.remove(position);
                        break;
                    case 3:

                        list.add(text);
                        mtag.setTags(list);
                        mtagOne.removeTag(position);
                        list1.remove(position);
                        break;
                    case 4:

                        list.add(text);
                        mtag.setTags(list);
                        mtagOne.removeTag(position);
                        list1.remove(position);
                        break;
                    case 5:

                        list.add(text);
                        mtag.setTags(list);
                        mtagOne.removeTag(position);
                        list1.remove(position);
                        break;
                }

            }

            @Override
            public void onTagLongClick(int position, String text) {

            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                for (int i = 0; i < list.size(); i++) {
//                    MyTab myTab = new MyTab();
//                    myTab.setName(list.get(i));
//                    myTabDao.insert(myTab);
//                }
                finish();
            }
        });


    }

    private void initList() {
        list.add("校园");
        list.add("头条");
        list.add("一节一推选");
        list.add("活动");
        list.add("就业");
        list.add("课堂");
    }


}
