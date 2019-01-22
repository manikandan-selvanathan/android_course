package com.facebook.www;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewPagerFragmentThree extends Fragment {


    public ViewPagerFragmentThree() {
        ArrayList<String> list=new ArrayList<>();

    }

    public static ViewPagerFragmentThree newInstance()
    {
     return  new ViewPagerFragmentThree();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager_fragment_three, container, false);
    }

}
