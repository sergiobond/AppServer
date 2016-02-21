package com.sbv_tech.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sbv_tech.remindme.fragment.AbstructTabFragment;
import com.sbv_tech.remindme.fragment.BirthdaysFragment;
import com.sbv_tech.remindme.fragment.HistoryFragement;
import com.sbv_tech.remindme.fragment.IdeasFragment;
import com.sbv_tech.remindme.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sergey.bondarenok on 2/21/16.
 */
public class TabFragmentAdapter extends FragmentPagerAdapter{

//    private String[] tabs;
    private Map<Integer, AbstructTabFragment> tabs;
    private Context context;

    public TabFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);

        this.context = context;

//        tabs.put(0, context.getString(R.string.tab_item_history));
//        tabs.put(1, context.getString(R.string.tab_item_ideas));
//        tabs.put(2, context.getString(R.string.tab_item_todo));
//        tabs.put(3, context.getString(R.string.tab_item_birthdays));

        initTabsMap(context);
//        tabs = new String[]{
//                "HI",
//                "Reminder",
//                "tab 2"
//        };
    }

    @Override
    public CharSequence getPageTitle(int position){

        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
//        switch (position){
//            case 0:
//
//                return TodoFragment.getInstance();
//            case 1:
//                return TodoFragment.getInstance();
//
//            case 2:
//                return TodoFragment.getInstance();
//
//        }
        return tabs.get(position);

//        return null;
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragement.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
