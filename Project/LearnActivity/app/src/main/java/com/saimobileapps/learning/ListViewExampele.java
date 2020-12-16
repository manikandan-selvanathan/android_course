package com.saimobileapps.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ListViewExampele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_exampele);
        RecyclerView recycler_view=findViewById(R.id.recycler_view);
        ArrayList<String> citites=new ArrayList<String >();
        citites.add("Chennai");
        citites.add("Madhurai");
        citites.add("Vellore");
        citites.add("Coimbature");
        citites.add("Pollachi");
        citites.add("Tanjavur");
        citites.add("Thirunelveli");
        ArrayAdapter<String> listOfCities=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,citites);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recycler_view.setLayoutManager(layoutManager);
        recycler_view.setAdapter(new RecylerViewAdapter(citites));
    }
}
