package com.example.annadhaba;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
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
       int address = holder.getAdapterPosition();
        holder.foodItem.setText(arrayList.get(position).name);
        holder.halfPrice.setText(arrayList.get(position).half);
        holder.fullPrice.setText(arrayList.get(position).full);
        holder.itemImage.setImageResource(arrayList.get(position).img);
        holder.addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView kartItemTextView,addItemhalfTextView,addItemFullTextView;
                AppCompatButton btnclos;
                Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.add_to_kart_dialogue);
                kartItemTextView = dialog.findViewById(R.id.kartItemTextView);
                addItemhalfTextView = dialog.findViewById(R.id.addItemhalfTextView);
                addItemFullTextView =dialog.findViewById(R.id.addItemFullTextView);
                btnclos = dialog.findViewById(R.id.btnclose);
                kartItemTextView.setText(arrayList.get(address).name);
                addItemhalfTextView.setText(arrayList.get(address).half);
                addItemFullTextView.setText(arrayList.get(address).full);
                btnclos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();


            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView foodItem,halfPrice,fullPrice;
        ImageView itemImage;
        AppCompatButton addItemHalfbtn,addItemFullbtn;
        LinearLayout fullLinearRow;
        Button addItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodItem =itemView.findViewById(R.id.foodItem);
            halfPrice =itemView.findViewById(R.id.halfPrice);
           fullPrice =itemView.findViewById(R.id.fullPrice);
           itemImage =itemView.findViewById(R.id.itemImage);
           fullLinearRow =itemView.findViewById(R.id.fullLinearRow);
           addItem =itemView.findViewById(R.id.addItem);



        }

    }
}