package com.saimobileapps.learning;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ChatListRecyclerViewAdapter extends RecyclerView.Adapter<ChatListViewHolder> {

    Context context;
    ArrayList<ChatViewModel> chats;
    public ChatListRecyclerViewAdapter(Context context, ArrayList<ChatViewModel> chats)
    {
        this.context=context;
        this.chats=chats;
    }

    @NonNull
    @Override
    public ChatListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.chat_layout,null);
        ChatListViewHolder chatListViewHolder=new ChatListViewHolder(view);
        return chatListViewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ChatListViewHolder chatListViewHolder, int i) {

        chatListViewHolder.contact_tv.setText(chats.get(i).ContactName);
        chatListViewHolder.body_tv.setText(chats.get(i).ChatBody);
        chatListViewHolder.title_tv.setText(chats.get(i).ChatTitle);
        chatListViewHolder.imageview.setImageResource(chats.get(i).ContactImage);

    }

    @Override
    public int getItemCount() {

        //Set Collection of items count
        return chats.size();
    }
}
