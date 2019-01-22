package com.facebook.www;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListViewSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_sample);
        RecyclerView recycler_view=findViewById(R.id.recycler_view);
        ArrayList<String> listofCities=new ArrayList<>();
        listofCities.add("Chennai");
        listofCities.add("Madhurai");
        listofCities.add("Thirunelveli");
        listofCities.add("Thuthukudi");
        listofCities.add("Pollachi");
        listofCities.add("Bangalore");
        listofCities.add("Kochi");
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recycler_view.setLayoutManager(layoutManager);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(this,listofCities);
        recycler_view.setAdapter(recyclerViewAdapter);
    }
}

