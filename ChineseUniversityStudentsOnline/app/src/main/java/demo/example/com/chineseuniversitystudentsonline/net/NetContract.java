package demo.example.com.chineseuniversitystudentsonline.net;

import java.util.Map;

import demo.example.com.chineseuniversitystudentsonline.base.BaseModel;
import demo.example.com.chineseuniversitystudentsonline.base.BasePresenter;
import demo.example.com.chineseuniversitystudentsonline.base.BaseView;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class NetContract {

    public interface View extends BaseView {
        void show(String ss);
    }

    interface Model extends BaseModel {
        void getDataFromNet(String url, Map<String, Object> map, CallBacks callBacks);
    }

    abstract static class Presenter extends BasePresenter<Model, View> {

        @Override
        public void onStart() {

        }

        public abstract void getDataFromModel(String url, Map<String, Object> map);
    }
}