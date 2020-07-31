package com.srv.recyclerviewdemo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.NewsViewHolder>{

    private Context context;
    private List<News> list;
    private boolean isDark = false;

    public RecyclerViewAdapter(Context context, List<News> list) {
        this.context = context;
        this.list = list;
    }

    public RecyclerViewAdapter(Context context, List<News> list, boolean isDark) {
        this.context = context;
        this.list = list;
        this.isDark = isDark;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Create recycler_view_item view
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_item, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {

        //Set Animation to image, item_card
        holder.itemCard.setAnimation(AnimationUtils.loadAnimation(context, R.anim.item_card_animation));
        holder.image.setAnimation(AnimationUtils.loadAnimation(context, R.anim.image_animation));

        //Bind data to item's views
        holder.title.setText(list.get(position).getTitle());
        holder.content.setText(list.get(position).getContent());
        holder.image.setImageResource(list.get(position).getImageRes());




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{

        RelativeLayout itemCard;
        TextView title, content;
        ImageView image;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);

            //Init item's views
            itemCard = (RelativeLayout)itemView.findViewById(R.id.item_card);
            title = (TextView)itemView.findViewById(R.id.news_title);
            content = (TextView)itemView.findViewById(R.id.news_content);
            image = (ImageView)itemView.findViewById(R.id.news_image);

            //Handle dark/light feature here
            if(isDark){
                //Handle dark
                itemCard.setBackgroundResource(R.drawable.bg02);
                content.setTextColor(ContextCompat.getColor(context, R.color.white));
            }
        }
    }
}
