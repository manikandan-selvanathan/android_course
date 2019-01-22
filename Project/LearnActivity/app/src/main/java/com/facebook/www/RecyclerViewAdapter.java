package com.facebook.www;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private ArrayList<String> mDataset;

    Activity activity;
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public MyViewHolder(View view) {
            super(view);
            mTextView=view.findViewById(R.id.text);
        }
    }

    public RecyclerViewAdapter(Activity activity, ArrayList<String> myDataset) {
        mDataset = myDataset;
        this.activity=activity;
    }

    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.citites_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if(position==1)
        {
            holder.mTextView.setTextColor(ContextCompat.getColor(activity,android.R.color.holo_red_dark));
        }
        holder.mTextView.setText("City: "+mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

