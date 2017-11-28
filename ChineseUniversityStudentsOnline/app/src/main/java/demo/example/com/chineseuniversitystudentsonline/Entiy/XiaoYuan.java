package demo.example.com.chineseuniversitystudentsonline.Entiy;

import java.util.List;

/**
 * Created by 丁军明 on 2017/11/28.
 */

public class XiaoYuan {
    /**
     * state : true
     * more : true
     * time : 1511853208
     * data : [{"contentid":11541,"modelid":1,"title":"刘惠荣：中国高校第一位登上南北极的社科女学者","thumb":"http://upload.univs.cn/2017/1128/thumb_160_120_1511853129851.jpg","description":"中国海洋大学刘惠荣教授参加2013年中国北极黄河站科考，2017年中国南极长城站科考，是中国高校中社会科学领域第一个登上南北极的女学者。","comments":0,"sorttime":1511853208},{"contentid":11537,"modelid":1,"title":"为什么大学里的你，不甘平凡却又不愿努力？","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511776117746.jpg","description":"不甘平凡说明你还有上进心，你现在无依无靠，你只能全凭自己。","comments":0,"sorttime":1511850855},{"contentid":11536,"modelid":1,"title":"眼光有多远，前程就有多美好","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511776559457.png","description":"这个世界上多的是短平快、付出马上就有回报的立竿见影的事，也多的是需要长期投入、靠矢志不渝的坚持才能有大成的事。","comments":0,"sorttime":1511850855},{"contentid":11535,"modelid":1,"title":"大城市离不开打工者，但他们的家到底该在何处安放？","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511776706955.jpg","description":"根据这个规律来找到一种，既能够让城市服务业健康发展，不管这个市民从事什么行业，都能够有一个社会的分工。人和工种不存在高和低，只存在合理的比例关系。一个城市的经济发展和社会健康发展，","comments":0,"sorttime":1511850855},{"contentid":11534,"modelid":1,"title":"最美的诗篇，都写在工大的叶上","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511776841340.jpg","description":"结束了一天的课程，在校园里，走走停停，拾起一片落叶，瞧，上面写满了关于工大的诗句~","comments":0,"sorttime":1511850855},{"contentid":11533,"modelid":1,"title":"你一定没见过iPhone X里的中航大","thumb":"http://upload.univs.cn/2017/1127/1511776985247.gif","description":"中航大的24个小时","comments":0,"sorttime":1511850855},{"contentid":11532,"modelid":1,"title":"为什么大学里的你，不甘平凡却又不愿努力？","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511776117746.jpg","description":"不甘平凡说明你还有上进心，你现在无依无靠，你只能全凭自己。","comments":0,"sorttime":1511850838},{"contentid":11531,"modelid":1,"title":"眼光有多远，前程就有多美好","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511776559457.png","description":"这个世界上多的是短平快、付出马上就有回报的立竿见影的事，也多的是需要长期投入、靠矢志不渝的坚持才能有大成的事。","comments":0,"sorttime":1511850838},{"contentid":11530,"modelid":1,"title":"人生没有如果，愿你勇往直前","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511775861596.jpg","description":"既然选择了远方，便只顾风雨兼程。没有人能回到过去，唯有勇敢面对往后的人生，才是给予当初那个义无反顾的自己最好的礼物。\n","comments":0,"sorttime":1511850813},{"contentid":11529,"modelid":1,"title":"你做了那么多计划，最后完成了多少？","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511775893309.jpg","description":"为了摆脱一直缠着我们、让我们过不好生活的拖延症，我们就必须养成良好的习惯，努力做到自律，以行动唤醒自己的梦想。","comments":0,"sorttime":1511850813}]
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
         * contentid : 11541
         * modelid : 1
         * title : 刘惠荣：中国高校第一位登上南北极的社科女学者
         * thumb : http://upload.univs.cn/2017/1128/thumb_160_120_1511853129851.jpg
         * description : 中国海洋大学刘惠荣教授参加2013年中国北极黄河站科考，2017年中国南极长城站科考，是中国高校中社会科学领域第一个登上南北极的女学者。
         * comments : 0
         * sorttime : 1511853208
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
