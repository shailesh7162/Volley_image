package com.example.volley_image;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class Adapter_image extends RecyclerView.Adapter<Adapter_image.User_holder>
{
    MainActivity mainActivity;
    ArrayList<Data_modal> datalist;
    public Adapter_image(MainActivity mainActivity,  ArrayList<Data_modal> datalist)
    {
        this.mainActivity=mainActivity;
        this.datalist=datalist;
    }

    @NonNull
    @Override
    public User_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.image_iteam,parent,false);
        User_holder holder=new User_holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_image.User_holder holder, int position)
    {
        String url=datalist.get(position).getUrl();
        Glide.with(mainActivity).load(url).into(holder.imageView);
    }


    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class User_holder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        public User_holder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageview);
        }
    }
}
