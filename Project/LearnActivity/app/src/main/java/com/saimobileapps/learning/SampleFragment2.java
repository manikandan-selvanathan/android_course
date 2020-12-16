package com.saimobileapps.learning;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SampleFragment2 extends Fragment {


    public SampleFragment2() {
        // Required empty public constructor
    }

    public static SampleFragment2 newInstance()
    {
        return new SampleFragment2();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sample_fragment2, container, false);
    }

}
