package com.facebook.www;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.MyViewHolder> {
    private ArrayList<String> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public MyViewHolder(View view) {
            super(view);
            mTextView=view.findViewById(R.id.text);
        }
    }

    public RecylerViewAdapter(ArrayList<String> myDataset) {
        mDataset = myDataset;
    }

    @Override
    public RecylerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.citites_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mDataset.get(position));

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
