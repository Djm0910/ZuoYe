package demo.example.com.chineseuniversitystudentsonline.Entiy;

/**
 * Created by 丁军明 on 2017/12/5.
 */

public class MyData {
    private String name;
    private String url;
    private String Banner1;
    private String Banner2;
    private String Banner3;

    public MyData(String name, String url, String banner1, String banner2, String banner3) {
        this.name = name;
        this.url = url;
        Banner1 = banner1;
        Banner2 = banner2;
        Banner3 = banner3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBanner1() {
        return Banner1;
    }

    public void setBanner1(String banner1) {
        Banner1 = banner1;
    }

    public String getBanner2() {
        return Banner2;
    }

    public void setBanner2(String banner2) {
        Banner2 = banner2;
    }

    public String getBanner3() {
        return Banner3;
    }

    public void setBanner3(String banner3) {
        Banner3 = banner3;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", Banner1='" + Banner1 + '\'' +
                ", Banner2='" + Banner2 + '\'' +
                ", Banner3='" + Banner3 + '\'' +
                '}';
    }
}
