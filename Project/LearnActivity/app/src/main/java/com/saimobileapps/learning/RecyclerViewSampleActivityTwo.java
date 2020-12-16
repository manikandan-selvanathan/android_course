package com.saimobileapps.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewSampleActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_sample_two);

        //Create recycler view object
        //Create Adapter object
        //Create LayoutMangaer object
        //SetLayoutManager.
        //SetAdapter

        RecyclerView recyclerView=findViewById(R.id.recycler_view);

        //Custom Class
        ArrayList<ChatViewModel> collectionofChats=new ArrayList<>(); //Collection
        ChatViewModel chatViewModel1=new ChatViewModel();
        chatViewModel1.ContactName="David";
        chatViewModel1.ChatTitle="Class Timing";
        chatViewModel1.ChatBody="When?";
        chatViewModel1.ContactImage=R.drawable.pic_004;
        collectionofChats.add(chatViewModel1);


        ChatViewModel chatViewModel2=new ChatViewModel();
        chatViewModel2.ContactName="RajaDurai";
        chatViewModel2.ChatTitle="Webview";
        chatViewModel2.ChatBody="Why?";
        chatViewModel2.ContactImage=R.drawable.pic_004;
        collectionofChats.add(chatViewModel2);


        ChatViewModel chatViewModel3=new ChatViewModel();
        chatViewModel3.ContactName="Senguttuvan";
        chatViewModel3.ChatTitle="Concepts";
        chatViewModel3.ChatBody="What?";
        chatViewModel3.ContactImage=R.drawable.pic_004;
        collectionofChats.add(chatViewModel3);


        ChatListRecyclerViewAdapter chatListRecyclerViewAdapter=new ChatListRecyclerViewAdapter(RecyclerViewSampleActivityTwo.this,collectionofChats);
        RecyclerView.LayoutManager layoutManagerobj=new LinearLayoutManager(RecyclerViewSampleActivityTwo.this);
        recyclerView.setLayoutManager(layoutManagerobj);
        recyclerView.setAdapter(chatListRecyclerViewAdapter);
    }
}
