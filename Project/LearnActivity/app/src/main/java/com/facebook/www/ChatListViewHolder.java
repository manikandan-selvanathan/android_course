package com.facebook.www;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ChatListViewHolder extends RecyclerView.ViewHolder
{
    public TextView contact_tv;
    public TextView title_tv;
    public TextView body_tv;
    public ImageView imageview;
    public ChatListViewHolder(@NonNull View itemView) {
        super(itemView);
        contact_tv=itemView.findViewById(R.id.contact_name_tv);
        title_tv=itemView.findViewById(R.id.chat_tile_tv);
        body_tv=itemView.findViewById(R.id.chat_body_tv);
        imageview=itemView.findViewById(R.id.imageview);
    }
}
