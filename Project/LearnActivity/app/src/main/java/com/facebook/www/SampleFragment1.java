package com.facebook.www;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SampleFragment1 extends Fragment {


    public SampleFragment1() {
        // Required empty public constructor
    }

    public static SampleFragment1 newInstance()
    {
        return new SampleFragment1();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sample_fragment1, container, false);
    }

}
