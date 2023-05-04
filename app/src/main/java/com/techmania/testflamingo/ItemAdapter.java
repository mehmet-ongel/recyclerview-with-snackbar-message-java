package com.techmania.testflamingo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    ArrayList<String> myList;
    ConstraintLayout constraintLayout;

    public ItemAdapter(ArrayList<String> myList, ConstraintLayout constraintLayout){

        this.myList = myList;
        this.constraintLayout = constraintLayout;

    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        String title = myList.get(position);
        holder.textView.setText(title);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar.make(constraintLayout,"You selected " + title,Snackbar.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder{

        TextView textView;
        LinearLayout linearLayout;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            linearLayout = itemView.findViewById(R.id.itemLinearLayout);

        }
    }

}
