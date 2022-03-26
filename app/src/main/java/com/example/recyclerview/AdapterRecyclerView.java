package com.example.recyclerview;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private ArrayList<ItemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textTitle;
        TextView textType;
        ImageView imageIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textTitle = itemView.findViewById(R.id.text_title);
            textType = itemView.findViewById(R.id.text_type);
            imageIcon = itemView.findViewById(R.id.image_list);

        }
    }

    AdapterRecyclerView(ArrayList<ItemModel> dataItem){
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
        TextView textTitle = holder.textTitle;
        TextView textType = holder.textType;
        ImageView imageIcon = holder.imageIcon;

        textTitle.setText(dataItem.get(position).getTitle());
        textType.setText(dataItem.get(position).getType());
        imageIcon.setImageResource(dataItem.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

}
