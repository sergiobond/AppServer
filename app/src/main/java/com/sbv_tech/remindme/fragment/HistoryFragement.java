package com.sbv_tech.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sbv_tech.remindme.R;
import com.sbv_tech.remindme.adapter.RemindListAdapter;
import com.sbv_tech.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergey.bondarenok on 2/21/16.
 */
public class HistoryFragement extends AbstructTabFragment {
    private static final int LAYOUT = R.layout.fragment_history;
//    private String title;
//    private Context context;
//    private View view;

    public static HistoryFragement getInstance(Context context){
        Bundle args = new Bundle();
        HistoryFragement fragment = new HistoryFragement();
        fragment.setContext(context);
        fragment.setArguments(args);
        fragment.setTitle(context.getString(R.string.tab_item_history));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);


        RecyclerView rv =(RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()));

        return this.view;
//        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("title 1"));
        data.add(new RemindDTO("title 2"));
        data.add(new RemindDTO("title 3"));
        data.add(new RemindDTO("title 4"));
        data.add(new RemindDTO("title 5"));
        data.add(new RemindDTO("title 6"));
        data.add(new RemindDTO("title 7"));
        data.add(new RemindDTO("title 8"));

        return data;
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
