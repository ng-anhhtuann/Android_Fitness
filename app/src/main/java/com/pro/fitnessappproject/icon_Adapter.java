package com.pro.fitnessappproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class icon_Adapter extends RecyclerView.Adapter<icon_Adapter.iconViewHolder> {
    private Context mContext;
    private List<icon> mList;

    public icon_Adapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(List<icon> list){
        this.mList = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public iconViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.level_recyclerview,parent,false);
        return new iconViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull iconViewHolder holder, int position) {
        icon icon = mList.get(position);
        if (icon == null){
            return;
        }
        holder.icon.setImageResource(icon.getResource());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public  class iconViewHolder extends RecyclerView.ViewHolder{
        private ImageView icon;

        public iconViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.icon);
        }
    }
}
