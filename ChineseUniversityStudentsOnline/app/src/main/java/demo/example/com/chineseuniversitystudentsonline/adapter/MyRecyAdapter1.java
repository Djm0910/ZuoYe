package demo.example.com.chineseuniversitystudentsonline.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;
;
import demo.example.com.chineseuniversitystudentsonline.Entiy.XiaoYuan;
import demo.example.com.chineseuniversitystudentsonline.R;

/**
 * Created by 丁军明 on 2017/11/28.
 */

public class MyRecyAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements View.OnClickListener {
    private List<XiaoYuan.DataBean> mList;
    private Context mContext;
    private ArrayList<String> mUrl;
    public static final int ONE_ITEM = 1;
    public static final int TWO_ITEM = 2;

    public MyRecyAdapter1(List<XiaoYuan.DataBean> mList, Context mContext, ArrayList<String> mUrl) {
        this.mList = mList;
        this.mContext = mContext;
        this.mUrl = mUrl;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RecyclerView.ViewHolder holder;
        if (ONE_ITEM == viewType) {
            View inflate = inflater.inflate(R.layout.recy_banner, parent, false);
            inflate.setOnClickListener(this);
            holder = new MyRecyAdapter1.ViewHolderOne(inflate);
        } else {
            View inflate = inflater.inflate(R.layout.recy_item, parent, false);
            inflate.setOnClickListener(this);
            holder = new MyRecyAdapter1.ViewHolderTwo(inflate);
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        XiaoYuan.DataBean dataBean = mList.get(position);
        if (holder instanceof ViewHolderOne) {
            (((MyRecyAdapter1.ViewHolderOne) holder).mBanner).setImages(mUrl)//添加图片集合或图片url集合
                    .isAutoPlay(true)//设置轮播时间
                    .setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
                    .setImageLoader(new MyRecyAdapter1.GlideImage())//加载图片
                    .setIndicatorGravity(BannerConfig.CENTER)//设置指示器位置
                    .start();
            holder.itemView.setTag(position);
        } else {
            String thumb = dataBean.getThumb();
            Glide.with(mContext).load(thumb).into(((MyRecyAdapter1.ViewHolderTwo) holder).mImg);
            ((MyRecyAdapter1.ViewHolderTwo) holder).mTitle.setText(dataBean.getTitle() + "");
            ((MyRecyAdapter1.ViewHolderTwo) holder).mContent.setText(dataBean.getDescription() + "");
            holder.itemView.setTag(position);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return ONE_ITEM;
        } else {
            return TWO_ITEM;
        }
    }

    @Override
    public int getItemCount() {
        return mList.isEmpty() ? 0 : mList.size();
    }

    public class GlideImage extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context.getApplicationContext()).load(path).into(imageView);
        }

    }

    class ViewHolderOne extends RecyclerView.ViewHolder {
        private Banner mBanner;

        public ViewHolderOne(View itemView) {
            super(itemView);
            mBanner = itemView.findViewById(R.id.Banner);
        }
    }

    class ViewHolderTwo extends RecyclerView.ViewHolder {

        private ImageView mImg;
        private TextView mTitle, mContent;

        public ViewHolderTwo(View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.Recy_Img);
            mTitle = itemView.findViewById(R.id.Recy_Title);
            mContent = itemView.findViewById(R.id.Recy_Content);
        }
    }

    public interface OnItem {
        void setData(View view, int position);
    }

    private MyRecyAdapter1.OnItem onItem = null;

    @Override
    public void onClick(View v) {
        if (onItem != null) {
            onItem.setData(v, (int) v.getTag());
        }
    }

    public void OnItemClick(MyRecyAdapter1.OnItem onItem) {
        this.onItem = onItem;
    }
}
