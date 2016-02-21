package com.sbv_tech.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sbv_tech.remindme.R;

/**
 * Created by sergey.bondarenok on 2/21/16.
 */
public class BirthdaysFragment extends AbstructTabFragment {

    private static final int LAYOUT = R.layout.fragment_example;
//    private String title;
//    private Context context;
//    private View view;

    public static BirthdaysFragment getInstance(Context context){

        Bundle args = new Bundle();
        BirthdaysFragment fragment = new BirthdaysFragment();
        fragment.setContext(context);
        fragment.setArguments(args);
        fragment.setTitle(context.getString(R.string.tab_item_birthdays));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public void setContext(Context context) {
        this.context = context;
    }

//    public String getTitle() {
//        return title;
//    }
}
