package com.example.waleedazhar.madass2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frontfrag extends Fragment {


    public Frontfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_frontfrag, container, false);
        RecyclerView recyclerView=(RecyclerView)v.findViewById(R.id.recycler);
        RecyclerAdopter listAdapter=new RecyclerAdopter() ;
        recyclerView.setAdapter(listAdapter);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        return v;
    }

}
