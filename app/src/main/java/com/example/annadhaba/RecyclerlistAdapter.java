package com.example.annadhaba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerlistAdapter extends RecyclerView.Adapter<RecyclerlistAdapter.ViewHolder>  {
    Context context;
    ArrayList<itemModelRecycler> arrayList;
    RecyclerlistAdapter(Context context, ArrayList<itemModelRecycler> arrayList){
        this.context =context;
        this.arrayList =arrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_items_view, parent, false);
        ViewHolder viewHolder =new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.foodItem.setText(arrayList.get(position).name);
        holder.halfPrice.setText(arrayList.get(position).half);
        holder.fullPrice.setText(arrayList.get(position).full);
        holder.itemImage.setImageResource(arrayList.get(position).img);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView foodItem,halfPrice,fullPrice;
        ImageView itemImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodItem =itemView.findViewById(R.id.foodItem);
            halfPrice =itemView.findViewById(R.id.halfPrice);
           fullPrice =itemView.findViewById(R.id.fullPrice);
           itemImage =itemView.findViewById(R.id.itemImage);
        }

    }
}