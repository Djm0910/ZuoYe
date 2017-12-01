package demo.example.com.chineseuniversitystudentsonline.net;

import java.util.Map;

/**
 * Created by TMVPHelper on 2017/11/27
 */
public class NetPresenter extends NetContract.Presenter {

    @Override
    public void getDataFromModel(String url, Map<String, Object> map) {
        baseModel.getDataFromNet(url, map, new CallBacks() {
            @Override
            public void succ(String result) {
                baseView.show(result);
            }
        });
    }
}