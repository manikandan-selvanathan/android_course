package com.saimobileapps.learning;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewSampleAdapter extends RecyclerView.Adapter<RecyclerViewSampleAdapter.MyViewHolder>
{
    Activity _activity;
    ArrayList<BikeViewModel> listOfBikes;
    public RecyclerViewSampleAdapter(Activity activity,ArrayList<BikeViewModel> bikes)
    {
        _activity=activity;
        listOfBikes=bikes;

    }

    //Create ViewHolder Class
    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        public ImageView imageView;
        public TextView textView;
        public TextView textView2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.imageview);
            textView= itemView.findViewById(R.id.textview1);
            textView2= itemView.findViewById(R.id.textview2);
        }
    }

    @NonNull
    @Override
    public RecyclerViewSampleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //Define and assign UI.
        View view=LayoutInflater.from(_activity).inflate(R.layout.recyclerviewcustom_child_view,null);
        return new RecyclerViewSampleAdapter.MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerViewSampleAdapter.MyViewHolder myViewHolder, int i) {

        //Set Values to UI.
        myViewHolder.imageView.setImageDrawable(ContextCompat.getDrawable(_activity,listOfBikes.get(i).BikeImageId));
        myViewHolder.textView.setText(listOfBikes.get(i).BikeName);
        myViewHolder.textView2.setText(listOfBikes.get(i).BikeDescription);
    }

    @Override
    public int getItemCount() {
        return listOfBikes.size();
        //Return count of items.
    }
}

