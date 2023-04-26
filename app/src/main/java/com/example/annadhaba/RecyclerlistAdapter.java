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

        //getting the positon on an integer variable
       int address = holder.getAdapterPosition();

       //setting the data in their respective recyclerView Position
        holder.foodItem.setText(arrayList.get(position).name);
        holder.halfPrice.setText(arrayList.get(position).half);
        holder.fullPrice.setText(arrayList.get(position).full);
        holder.itemImage.setImageResource(arrayList.get(position).img);
        holder.addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    //initializing the views
                    TextView kartItemTextView, addItemHalfTextView, addItemFullTextView,addCountHalfTextView,addCountFullTextView;
                    AppCompatButton btnClose, addHalfItemBtn, addFullItemBtn,btnsave,removeItemHalfBtn,removeItemFullBtn;

                    Dialog dialog = new Dialog(context);
                    dialog.setContentView(R.layout.add_to_kart_dialogue);
                    dialog.show();
                    //finding id of the dialog box view


                    kartItemTextView = dialog.findViewById(R.id.kartItemTextView);
                    addItemHalfTextView = dialog.findViewById(R.id.addItemhalfTextView);
                    addItemFullTextView = dialog.findViewById(R.id.addItemFullTextView);
                    addCountHalfTextView = dialog.findViewById(R.id.itemCountHalfTextView);
                    addCountFullTextView = dialog.findViewById(R.id.itemCountFullTextView);
                    removeItemHalfBtn = dialog.findViewById(R.id.removeitemhalfbtn);
                    addHalfItemBtn = dialog.findViewById(R.id.addHalfItembtn);
                    removeItemFullBtn = dialog.findViewById(R.id.removeitemFullbtn);
                    addFullItemBtn = dialog.findViewById(R.id.addFullItembtn);


                    btnClose = dialog.findViewById(R.id.btnclose);
                    btnsave = dialog.findViewById(R.id.btnsave);

                    //Set actions on the respective views
                    kartItemTextView.setText(arrayList.get(address).name);
                    addItemHalfTextView.setText(arrayList.get(address).half);
                    addItemFullTextView.setText(arrayList.get(address).full);


                //performing close dialog operation on the click of the close button
                    btnClose.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            dialog.dismiss();
                        }
                    });
                //performing Save dialog operation on the click of the Save button
                    btnsave.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });


            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //Initializing the views of the list item views
        TextView foodItem,halfPrice,fullPrice;
        ImageView itemImage;
        LinearLayout fullLinearRow;
        Button addItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //finding the id's of the respective Views
            foodItem =itemView.findViewById(R.id.foodItem);
            halfPrice =itemView.findViewById(R.id.halfPrice);
            fullPrice =itemView.findViewById(R.id.fullPrice);
            itemImage =itemView.findViewById(R.id.itemImage);
            fullLinearRow =itemView.findViewById(R.id.fullLinearRow);
            addItem =itemView.findViewById(R.id.addItem);



        }

    }
}