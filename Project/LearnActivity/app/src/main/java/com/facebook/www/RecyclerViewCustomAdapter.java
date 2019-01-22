package com.facebook.www;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.security.PublicKey;
import java.util.ArrayList;

public class RecyclerViewCustomAdapter extends RecyclerView.Adapter<RecyclerViewCustomAdapter.MyViewHolder>
{
    Activity activity;
    ArrayList<BikeViewModel> bikes;

    public RecyclerViewCustomAdapter(Activity _activity,ArrayList<BikeViewModel> bikes)
    {
        this.activity=_activity;
        this.bikes=bikes;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView _imageView;
        public TextView _textView;
        public TextView _textView2;
        public MyViewHolder(View view)
        {
            super(view);
            _imageView=(ImageView)view.findViewById(R.id.imageview);
            _textView=(TextView)view.findViewById(R.id.textview1);
            _textView2=(TextView)view.findViewById(R.id.textview2);
        }
    }

    @NonNull
    @Override
    public RecyclerViewCustomAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view=LayoutInflater.from(activity).inflate(R.layout.activity_recycler_view_custom, viewGroup, false);
        return new RecyclerViewCustomAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i)
    {
        myViewHolder._imageView.setImageResource(bikes.get(i).BikeImageId);

    }

    @Override
    public int getItemCount() {
        return bikes.size();
    }
}
