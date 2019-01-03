package com.saimobileapps.www.sampleappdec26;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecyclerViewCustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    ArrayList<RecyclerViewCustomModel> listOfBikes;
    Activity activity;

    public RecyclerViewCustomAdapter(Activity activity, ArrayList<RecyclerViewCustomModel> listOfBikes)
    {
        this.activity=activity;
        this.listOfBikes=listOfBikes;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=activity.getLayoutInflater().inflate(R.layout.recycler_view_child,viewGroup,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i)
    {
        customViewHolder.bikeName.setText(listOfBikes.get(i).BikeName);
        customViewHolder.bikeDescription.setText(listOfBikes.get(i).BikeDescription);
        customViewHolder.bikeImage.setImageResource(listOfBikes.get(i).BikeImage);
    }

    @Override
    public int getItemCount() {
        return listOfBikes.size();
    }
}
