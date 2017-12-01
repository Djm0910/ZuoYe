package demo.example.com.chineseuniversitystudentsonline.Entiy;

import java.util.List;

/**
 * Created by 丁军明 on 2017/12/1.
 */

public class Tab {

    /**
     * state : true
     * data : [{"catid":"11","catname":"头条","iconurl":"http://upload.univs.cn/2014/1126/1416971438513.jpg","sort":"2","name":"头条","url":"http://m.univs.cn/category/11"},{"catid":"2","catname":"校园","iconurl":"http://upload.univs.cn/2014/0901/thumb_360_270_1409533092441.jpg","sort":"3","name":"校园","url":"http://m.univs.cn/category/2"},{"catid":"5","catname":"就业","iconurl":"http://upload.univs.cn/2014/0918/1411002774251.png","sort":"4","name":"就业","url":"http://m.univs.cn/category/5"},{"catid":"3","catname":"课堂","iconurl":"http://upload.univs.cn/2014/0901/thumb_360_270_1409533092441.jpg","sort":"5","name":"课堂","url":"http://m.univs.cn/category/3"},{"catid":"12","catname":"活动","iconurl":"http://upload.univs.cn/2014/0918/1411002774251.png","sort":"8","name":"活动","url":"http://m.univs.cn/category/12"},{"catid":"14","catname":"一节一推选","iconurl":"http://upload.univs.cn/2017/1012/1507777558167.jpg","sort":"10","name":"一节一推选","url":"http://m.univs.cn/category/14"}]
     */

    private boolean state;
    private List<DataBean> data;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * catid : 11
         * catname : 头条
         * iconurl : http://upload.univs.cn/2014/1126/1416971438513.jpg
         * sort : 2
         * name : 头条
         * url : http://m.univs.cn/category/11
         */

        private String catid;
        private String catname;
        private String iconurl;
        private String sort;
        private String name;
        private String url;

        public String getCatid() {
            return catid;
        }

        public void setCatid(String catid) {
            this.catid = catid;
        }

        public String getCatname() {
            return catname;
        }

        public void setCatname(String catname) {
            this.catname = catname;
        }

        public String getIconurl() {
            return iconurl;
        }

        public void setIconurl(String iconurl) {
            this.iconurl = iconurl;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
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
    }
}
