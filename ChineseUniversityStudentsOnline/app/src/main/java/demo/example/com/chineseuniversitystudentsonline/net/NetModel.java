package demo.example.com.chineseuniversitystudentsonline.net;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import demo.example.com.chineseuniversitystudentsonline.app.App;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by TMVPHelper on 2017/11/27
 */
public class NetModel implements NetContract.Model {
    private static NetModel NetModel;
    private Set<String> keySet;
    private String urls;

    private OkHttpClient client;


    public static NetModel getInstance() {
        if (NetModel == null) {
            synchronized (NetModel.class) {
                NetModel = new NetModel();
            }
        }
        return NetModel;
    }

    public NetModel() {
        client = new OkHttpClient();
    }


    @Override
    public void getDataFromNet(String url, Map<String, Object> map, final CallBacks callBacks) {
        StringBuffer stb = new StringBuffer(url);
        String urls = "";
        if (map != null && map.size() > 0) {
            stb.append("?");
            keySet = map.keySet();

            for (String key : keySet) {
                Object o = map.get(key);
                stb.append(key).append("=").append(o).append("&");
            }

            urls  = (stb.deleteCharAt(stb.length() - 1)).toString();
        }
        Request request = new Request.Builder().url(urls).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String ss = response.body().string();

                App.mActivity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        callBacks.succ(ss);
                    }
                });

            }
        });
    }
}