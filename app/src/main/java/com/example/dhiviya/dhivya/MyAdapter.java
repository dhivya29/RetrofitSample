package com.example.dhiviya.dhivya;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    List<MyJson.Data> DataList = new ArrayList<>();
    // List<MyJson.Content> DataList = new ArrayList<>();

    public MyAdapter(Context context, List<MyJson.Data> dataList) {
        DataList = dataList;
        this.context = context;
    }
//    public MyAdapter(Context context, List<MyJson.Content> dataList) {
//        DataList = dataList;
//        this.context = context;
//    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflate_news_item, parent, false);
        viewHolder = new MyViewHolder(context, view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MyViewHolder) {
            MyViewHolder mholder = (MyViewHolder) holder;
            mholder.OnBind(DataList, position);
        }

    }

    @Override
    public int getItemCount() {
        return DataList.size();
    }
}
