package com.example.bestproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class adaptem_food_one extends RecyclerView.Adapter{

    ArrayList<food_one> farry ;
    Context context;

    public adaptem_food_one(ArrayList<food_one> farry, Context context) {
        this.farry = farry;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list,parent,false);
    ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).img.setImageResource(farry.get(position).getImage());
        ((ViewHolder)holder).time.setText(farry.get(position).getName());
        ((ViewHolder)holder).name.setText(farry.get(position).getName());
        ((ViewHolder)holder).timer.setText(farry.get(position).getTimer());

    }

    @Override
    public int getItemCount() {
        return farry.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView timer ;
        public ImageView img ;
        public TextView name ;
        public  TextView time ;
        public View view ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView ;
            img = itemView.findViewById(R.id.imageView4);
            name = itemView.findViewById(R.id.textView);
            time = itemView.findViewById(R.id.textView3);
            timer = itemView.findViewById(R.id.textView2);


        }
    }
}
