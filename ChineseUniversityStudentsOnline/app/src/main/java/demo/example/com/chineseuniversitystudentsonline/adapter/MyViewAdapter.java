package demo.example.com.chineseuniversitystudentsonline.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 丁军明 on 2017/11/27.
 */

public class MyViewAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> mList;
    private List<String> mTitle;

    public MyViewAdapter(FragmentManager fm, ArrayList<Fragment> mList, List<String> mTitle) {
        super(fm);
        this.mList = mList;
        this.mTitle = mTitle;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return  mList.isEmpty() ? 0 : mList.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }
}
