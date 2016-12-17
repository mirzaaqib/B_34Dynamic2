package com.pallefire.b_34dynamic2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragment1, container, false);
        TextView textView= (TextView) v.findViewById(R.id.tv1);
        Bundle bundle=getArguments();
        String city=bundle.getString("city");
        textView.setText(city);
        return v;
    }

}
