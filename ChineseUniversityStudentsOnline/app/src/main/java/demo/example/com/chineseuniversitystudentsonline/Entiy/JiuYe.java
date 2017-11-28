package demo.example.com.chineseuniversitystudentsonline.Entiy;

import java.util.List;

/**
 * Created by 丁军明 on 2017/11/28.
 */

public class JiuYe {

    /**
     * state : true
     * more : true
     * time : 1511850936
     * data : [{"contentid":11540,"modelid":1,"title":"职场中的\u201c低薪大坑\u201d，为何总是你在填？","thumb":"http://upload.univs.cn/2017/1128/thumb_160_120_1511850810943.jpeg","description":"我们在找工作或换工作的时候，都会怀着无限美好的憧憬，希望通过跳槽改善目前微薄的薪水，但通常情况是，薪水并没有因为你的跳槽而得到显著改善。","comments":0,"sorttime":1511850936},{"contentid":11539,"modelid":1,"title":"下一个十年，你会是谁？","thumb":"http://upload.univs.cn/2017/1128/thumb_160_120_1511850186980.jpg","description":"下一个十年，你会成为怎样的人，是否拥有了自己想要的生活？十年后的那个你，都是由现在的你决定。","comments":0,"sorttime":1511850919},{"contentid":11538,"modelid":1,"title":"面试时，怎样向HR提问能为你加分？","thumb":"http://upload.univs.cn/2017/1128/thumb_160_120_1511850379412.jpg","description":"面试时，怎样向HR提问能为你加分？ ","comments":0,"sorttime":1511850919},{"contentid":11501,"modelid":1,"title":"哪些履历能助你\u201c杀出重围\u201d，53.2%受访在校生认为是实习经历","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511748991972.jpg","description":"就业并非是短短几个月的秋招就能解决的，而是大学四年甚至更长时间不断积累的结果。想清楚自己将来想做什么工作，再根据这份工作的用人标准去培养自己、积累经验，真正到了招聘季，自然水到渠成","comments":0,"sorttime":1511749034},{"contentid":11493,"modelid":1,"title":"网络催生新职业 年轻人就业时面临更多样化选择","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511747581691.jpg","description":"私人旅行线路定制师、度假房产咨询师、电竞游戏指导、运动治疗师、时尚买手、共享单车运维员、网络营销专员、网络媒体高级编辑\u2026\u2026随着全球互联网的大发展，各种新兴职业蓬勃兴起。年轻人就业时","comments":0,"sorttime":1511747606},{"contentid":11492,"modelid":1,"title":"如何选择适合自己的工作？","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511747330583.jpg","description":"人生很多时候没有所谓正确的选择，但却有合适的选择，比如选择适合自己的工作。 ","comments":0,"sorttime":1511747406},{"contentid":11491,"modelid":1,"title":"4万份招聘告诉你，哪些工作热门又高薪","thumb":"http://upload.univs.cn/2017/1120/thumb_160_120_1511158922412.jpg","description":"智联招聘近日出炉了2017年秋季招聘报告，报告显示，竞争最为激烈的行业为网络游戏业，平均一个岗位有50份简历投递，而这份榜单的前三甲均处于互联网行业中。","comments":0,"sorttime":1511747388},{"contentid":11469,"modelid":1,"title":"\u201c最抢手\u201d高校毕业生排名出炉！","thumb":"http://upload.univs.cn/2017/1123/thumb_160_120_1511411028799.png","description":"近日，英国《泰晤士报高等教育》发布2017年全球大学毕业生就业竞争力排行榜。哪些高校毕业生最具竞争力？哪些专业最具竞争力？又有哪些职业月收入增长较慢？ ","comments":0,"sorttime":1511411369},{"contentid":11468,"modelid":1,"title":"巧用宣讲会，助力求职路","thumb":"http://upload.univs.cn/2017/1123/thumb_160_120_1511410418310.png","description":"通过宣讲会，用人单位传播理念文化，应届生们了解行业资讯，进而获得工作机会。","comments":0,"sorttime":1511410835},{"contentid":11464,"modelid":1,"title":"2018年央企校园招聘来了，两万多岗位\u201c职\u201d等你来！","thumb":"http://upload.univs.cn/2017/1123/thumb_160_120_1511400821114.jpg","description":"2018就业季，央企率先进入招聘黄金期，纷纷发布招聘公告。","comments":0,"sorttime":1511401129}]
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
         * contentid : 11540
         * modelid : 1
         * title : 职场中的“低薪大坑”，为何总是你在填？
         * thumb : http://upload.univs.cn/2017/1128/thumb_160_120_1511850810943.jpeg
         * description : 我们在找工作或换工作的时候，都会怀着无限美好的憧憬，希望通过跳槽改善目前微薄的薪水，但通常情况是，薪水并没有因为你的跳槽而得到显著改善。
         * comments : 0
         * sorttime : 1511850936
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
