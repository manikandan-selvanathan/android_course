package com.saimobileapps.www.sampleappdec26;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomViewHolder extends RecyclerView.ViewHolder
{
    public ImageView bikeImage;
    public TextView bikeName;
    public TextView bikeDescription;
    public CustomViewHolder(@NonNull View itemView)
    {
        super(itemView);
        bikeImage=itemView.findViewById(R.id.bike_imageview);
        bikeName=itemView.findViewById(R.id.bike_name);
        bikeDescription=itemView.findViewById(R.id.bike_description);
    }
}
