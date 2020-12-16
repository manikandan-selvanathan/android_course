package com.saimobileapps.learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewCustomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_custom);
        RecyclerView recyclerView=findViewById(R.id.recycler_view);

        ArrayList<BikeViewModel> listOfBikes=new ArrayList<>();
        //Get it from API or DB.
        //Dummy Objects
        BikeViewModel bikeViewModel1=new BikeViewModel();
        bikeViewModel1.BikeImageId=R.drawable.pic_002;
        bikeViewModel1.BikeName="Yamaha FZS";
        bikeViewModel1.BikeDescription="Description Yamaha FZS";
        listOfBikes.add(bikeViewModel1);

        BikeViewModel bikeViewModel2=new BikeViewModel();
        bikeViewModel2.BikeImageId=R.drawable.pic_003;
        bikeViewModel2.BikeName="Yamaha R1";
        bikeViewModel2.BikeDescription="Description Yamaha R1";
        listOfBikes.add(bikeViewModel2);

        BikeViewModel bikeViewModel3=new BikeViewModel();
        bikeViewModel3.BikeImageId=R.drawable.pic_004;
        bikeViewModel3.BikeName="Yamaha R3";
        bikeViewModel3.BikeDescription="Description Yamaha R3";
        listOfBikes.add(bikeViewModel3);

        BikeViewModel bikeViewModel4=new BikeViewModel();
        bikeViewModel4.BikeImageId=R.drawable.pic_005;
        bikeViewModel4.BikeName="Yamaha R6";
        bikeViewModel4.BikeDescription="Description Yamaha R6";
        listOfBikes.add(bikeViewModel4);

        BikeViewModel bikeViewModel5=new BikeViewModel();
        bikeViewModel5.BikeImageId=R.drawable.pic_006;
        bikeViewModel5.BikeName="Yamaha R15";
        bikeViewModel5.BikeDescription="Description Yamaha R15";
        listOfBikes.add(bikeViewModel5);

        RecyclerViewSampleAdapter recyclerViewSampleAdapter=new RecyclerViewSampleAdapter(this,listOfBikes);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewSampleAdapter);
    }

}

