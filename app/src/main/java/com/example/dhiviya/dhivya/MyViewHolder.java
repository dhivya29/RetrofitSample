package com.example.dhiviya.dhivya;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView description;
    TextView userid;
    TextView category;
    TextView postdate;
    TextView status;
    ImageView image;
    CardView cardView;
    Context context;

    public MyViewHolder(final Context context, View view) {
        super(view);
        this.context=context;
        title=(TextView) view.findViewById(R.id.title);
        description=(TextView) view.findViewById(R.id.description);
        userid=(TextView) view.findViewById(R.id.userid);
        status=(TextView) view.findViewById(R.id.status);
        category=(TextView) view.findViewById(R.id.category);
        postdate=(TextView) view.findViewById(R.id.postdate);
        image=(ImageView)view.findViewById(R.id.image);
        cardView=(CardView)view.findViewById(R.id.cardNews);
        cardView.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
        Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show();
               }
        }
        );


    }

    public void OnBind(List<MyJson.Data> dataList, int position) {
//        if(dataList!=null){
//            title.setText(dataList.get(position).Name);
//            // image.(Uri.parse(dataList.get(position).videoThumb.get(0).url));
//            if (dataList.get(position).URL.length()>0)
//                Glide.with(context).load(dataList.get(position).URL).into(image);
//         else {
//             image.setImageResource(R.drawable.ic_launcher);
//         }
//           }
            title.setText(dataList.get(position).title);
            description.setText(dataList.get(position).description);
            postdate.setText(dataList.get(position).post_date);
            userid.setText(dataList.get(position).user_id);
            status.setText(dataList.get(position).userrespondstatus);
            category.setText(dataList.get(position).category.get(0).name);
             if (dataList.get(position).images.size() > 0) {
             Glide.with(context).load(dataList.get(position).images.get(0).url).into(image);
            // image.(Uri.parse(dataList.get(position).videoThumb.get(0).url));
         }
         else {
             image.setImageResource(R.drawable.ic_launcher);
         }
           }
    }

