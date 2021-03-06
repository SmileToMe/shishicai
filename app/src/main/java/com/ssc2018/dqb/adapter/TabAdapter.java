package com.ssc2018.dqb.adapter;

/**
 * 作者：MrXu on 2017/12/27 11:03
 * 邮箱：17610872621@163.com
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 选项卡适配器
 */
public class TabAdapter extends FragmentPagerAdapter {
    private List<Fragment> list_fragment;                         //fragment列表
    private List<String> list_Title;                              //tab名的列表
    public TabAdapter(FragmentManager fm, List<Fragment> list_fragment, List<String> list_title) {
        super(fm);
        this.list_fragment = list_fragment;
        this.list_Title = list_title;
    }

    @Override
    public Fragment getItem(int position) {
        return list_fragment.get(position);
    }

    @Override
    public int getCount() {
        return  list_Title.size();
    }
    //此方法用来显示tab上的名字
    @Override
    public CharSequence getPageTitle(int position) {

        return list_Title.get(position % list_Title.size());
    }
}
