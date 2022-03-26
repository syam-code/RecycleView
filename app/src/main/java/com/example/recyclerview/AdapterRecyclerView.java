package com.example.recyclerview;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {
//  tahap 1
    private ArrayList<ItemModel> dataItem;

//  tahap 2
    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {
//  tahap 1
        TextView textTitle;
        TextView textType;
        ImageView imageIcon;
//  tahap 2
        LinearLayout linearLayoutItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

//  tahap 1
            textTitle = itemView.findViewById(R.id.text_title);
            textType = itemView.findViewById(R.id.text_type);
            imageIcon = itemView.findViewById(R.id.image_list);
//  tahap 2
            linearLayoutItem = itemView.findViewById(R.id.linearlayout_item);
        }
    }

//  tahap 1 "AdapterRecyclerView(ArrayList<ItemModel> dataItem)"
//  tahap 2 ""
    AdapterRecyclerView(Context context, ArrayList<ItemModel> dataItem){
//  tahap 2
        this.context = context;
//  tahap 1
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {
//  tahap 1
        TextView textTitle = holder.textTitle;
        TextView textType = holder.textType;
        ImageView imageIcon = holder.imageIcon;

        textTitle.setText(dataItem.get(position).getTitle());
        textType.setText(dataItem.get(position).getType());
        imageIcon.setImageResource(dataItem.get(position).getImage());
//  tahap 2
        holder.linearLayoutItem.setOnClickListener(view -> {
            Toast.makeText(context, dataItem.get(position).getTitle(), Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

}
