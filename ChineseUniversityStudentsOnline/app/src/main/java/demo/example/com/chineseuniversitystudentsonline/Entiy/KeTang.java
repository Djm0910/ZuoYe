package demo.example.com.chineseuniversitystudentsonline.Entiy;

import java.util.List;

/**
 * Created by 丁军明 on 2017/11/28.
 */

public class KeTang {
    /**
     * state : true
     * more : true
     * time : 1511851253
     * data : [{"contentid":11510,"modelid":1,"title":"悦读悦青春：阅读马拉松向北大120校庆日开\u201c跑\u201d","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511749651337.jpg","description":"近日，北京大学\u201c校庆阅读年计划\u201d暨阅读马拉松活动第一期线下读书沙龙举行。","comments":0,"sorttime":1511850996},{"contentid":11521,"modelid":1,"title":"【传统文化】 第6期 丝绸文化3","thumb":"http://upload.univs.cn/2017/1128/thumb_160_120_1511849118728.jpg","description":"丝绸是中华民族古代文明的瑰宝，劳动人民的智慧；它象征着历史的昌盛、兴荣。真丝彩缎文明史。灿烂辉煌世界知。","comments":0,"sorttime":1511849219},{"contentid":11520,"modelid":1,"title":"首届清华新百年教学成就奖获得者曾攀教授","thumb":"http://upload.univs.cn/2017/1128/thumb_160_120_1511833095559.jpg","description":"曾攀，清华大学机械工程系教授、博士生导师、长江学者，国家杰出青年基金获得者。","comments":0,"sorttime":1511833283},{"contentid":11519,"modelid":1,"title":"青年作家文珍谈阅读与创作：重新定义自我和世界","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511750533288.jpg","description":"11月19日上午，青年作家，第五届老舍文学奖、第十三届华语文学传媒最具潜力新人奖得主文珍应邀做客中国海洋大学文学与新闻传播学院。","comments":0,"sorttime":1511764548},{"contentid":11490,"modelid":1,"title":"好莱坞特效大师Sebastian Carrillo讲述艺术创新","thumb":"http://upload.univs.cn/2017/1127/thumb_160_120_1511745837893.jpg","description":"美国\u201c艾美奖\u201d视觉特效奖获得者、蓝马国际艺术流派创始人做客成电讲坛","comments":0,"sorttime":1511746523},{"contentid":11482,"modelid":1,"title":"当数字技术遇上甲骨文\u2014\u2014清华美术学院陈楠设计汉仪陈体甲骨文","thumb":"http://upload.univs.cn/2017/1124/thumb_160_120_1511489146107.jpg","description":"两条弧线构成的\u201c方舟\u201d上，载着象、狗、羊、龟等各种动物，写实与象征意味并存，艺术的美感中蕴含着童稚的趣味。细细看去，画面中的每一个形象都是一个原始的文字，这就是陈楠设计的\u201c数字化甲","comments":0,"sorttime":1511489190},{"contentid":11474,"modelid":2,"title":"【畅想家读书会】《红楼梦》中的女性人物对应哪些花？","thumb":"http://upload.univs.cn/2017/1123/thumb_160_120_1511425944184.jpg","description":"《红楼梦》构思精巧，从人物名字到形象性格，从判词预警到尘埃落定，层层铺垫，环环相扣。其中六十三回，怡红夜宴，将花与酒结合寓于诗，单看诗，就已经不禁让人赞叹作者的文笔和情趣，然而要是","comments":0,"sorttime":1511488453},{"contentid":11481,"modelid":1,"title":"苗军：在传统教学中探索\u201c微型演示\u201d","thumb":"http://upload.univs.cn/2017/1124/thumb_160_120_1511484543337.jpg","description":"\u201c思想插上艺术的翅膀才能飞得更高、更远。\u201d前段时间，广西民族大学文学院苗军教授因在课堂上\u201c一秒换装\u201d而迅速走红网络，受到了广大媒体网友的关注，一时间\u201c文化史老师换造型\u201d的报道迅速抢","comments":0,"sorttime":1511488452},{"contentid":11463,"modelid":1,"title":"【海洋世界的小主人】第一期 翻车鱼和它的那些传说","thumb":"http://upload.univs.cn/2017/1123/thumb_160_120_1511400306188.jpg","description":"翻车鱼真的会翻车吗？它真的很脆弱吗？","comments":0,"sorttime":1511415351},{"contentid":11429,"modelid":1,"title":"【花说】第十六期之孤芳暗赏 说说那些阴生花","thumb":"http://upload.univs.cn/2017/1121/thumb_160_120_1511226575473.png","description":"植物的光强度类型在自然界中，不同植物需要光的程度不同。阴生植物是指在弱光条件下比强光条件下生长良好的植物。说说那些阴生花。","comments":0,"sorttime":1511415350}]
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
         * contentid : 11510
         * modelid : 1
         * title : 悦读悦青春：阅读马拉松向北大120校庆日开“跑”
         * thumb : http://upload.univs.cn/2017/1127/thumb_160_120_1511749651337.jpg
         * description : 近日，北京大学“校庆阅读年计划”暨阅读马拉松活动第一期线下读书沙龙举行。
         * comments : 0
         * sorttime : 1511850996
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
