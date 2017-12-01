package demo.example.com.chineseuniversitystudentsonline.Entiy;

import java.util.List;

/**
 * Created by 丁军明 on 2017/11/30.
 */

public class TuiSong {

    /**
     * state : true
     * more : true
     * time : 0
     * data : [{"contentid":11052,"modelid":1,"title":"【网文·展播】网文作品征集优秀作品展","thumb":"http://upload.univs.cn/2017/1016/thumb_160_120_1508144060247.jpg","description":"第二届全国大学生网络文化节网文作品征集优秀作品展","comments":0,"sorttime":1508144062},{"contentid":11047,"modelid":1,"title":"【推选·网络文章】第二届全国高校网络宣传思想教育优秀网络文章","thumb":"http://upload.univs.cn/2017/1017/thumb_160_120_1508202973214.png","description":"第二届全国高校网络宣传思想教育优秀网络文章作品推选展示","comments":0,"sorttime":1508135914},{"contentid":11044,"modelid":1,"title":"【推选·工作案例】第二届全国高校网络宣传思想教育优秀工作案例","thumb":"http://upload.univs.cn/2017/1017/thumb_160_120_1508202877818.jpg","description":"第二届全国高校网络宣传思想教育优秀工作案例作品推选展示","comments":0,"sorttime":1508133681},{"contentid":11043,"modelid":1,"title":"【推选·微作品】第二届全国高校网络宣传思想教育优秀微视频展示","thumb":"http://upload.univs.cn/2017/1016/thumb_160_120_1508133041622.jpg","description":"第二届全国高校网络宣传思想教育优秀微视频作品推选展示","comments":0,"sorttime":1508133047},{"contentid":11029,"modelid":1,"title":"【公益·展播】公益广告作品征集(视频类)优秀作品展","thumb":"http://upload.univs.cn/2017/1012/1507795355652.jpg","description":"第二届全国大学生网络文化节公益广告作品征集（视频类）优秀作品展","comments":0,"sorttime":1507795392},{"contentid":11028,"modelid":1,"title":"【摄影·展播】摄影作品征集优秀作品展","thumb":"http://upload.univs.cn/2017/1012/1507793730975.jpg","description":"第二届全国大学生网络文化节摄影作品征集优秀作品展","comments":0,"sorttime":1507793136},{"contentid":11027,"modelid":1,"title":"【公益·展播】公益广告作品征集(平面类)优秀作品展","thumb":"http://upload.univs.cn/2017/1012/1507792506872.jpg","description":"第二届全国大学生网络文化节公益广告作品征集（平面类）优秀作品展","comments":0,"sorttime":1507788917},{"contentid":11025,"modelid":1,"title":"【公益·对话】\u201c我想把普通的东西做的不一样\u2014\u2014对话刘敏\u201d","thumb":"http://upload.univs.cn/2017/1013/thumb_160_120_1507862501374.jpg","description":"2017第三届全国平面公益广告大赛暨全国大学生公益广告作品征集活动人物专访","comments":0,"sorttime":1507784674}]
     */

    private boolean state;
    private boolean more;
    private int time;
    private List<DataBean> data;

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * contentid : 11052
         * modelid : 1
         * title : 【网文·展播】网文作品征集优秀作品展
         * thumb : http://upload.univs.cn/2017/1016/thumb_160_120_1508144060247.jpg
         * description : 第二届全国大学生网络文化节网文作品征集优秀作品展
         * comments : 0
         * sorttime : 1508144062
         */

        private int contentid;
        private int modelid;
        private String title;
        private String thumb;
        private String description;
        private int comments;
        private int sorttime;

        public int getContentid() {
            return contentid;
        }

        public void setContentid(int contentid) {
            this.contentid = contentid;
        }

        public int getModelid() {
            return modelid;
        }

        public void setModelid(int modelid) {
            this.modelid = modelid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }

        public int getSorttime() {
            return sorttime;
        }

        public void setSorttime(int sorttime) {
            this.sorttime = sorttime;
        }
    }
}
