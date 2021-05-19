package com.example.trial4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class FragmentHome extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Stations> lstStations;
    //empty constructor
    public FragmentHome() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       v=inflater.inflate(R.layout.home_fragment,container,false);
       myrecyclerview = (RecyclerView) v.findViewById(R.id.home_recycler);
       RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstStations);
       myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
       myrecyclerview.setAdapter(recyclerViewAdapter);
       return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstStations = new ArrayList<>();
        lstStations.add(new Stations("karura" ,"255",R.drawable.addicon));
        lstStations.add(new Stations("karura" ,"255",R.drawable.addicon));
        lstStations.add(new Stations("karura" ,"255",R.drawable.addicon));
        lstStations.add(new Stations("karura" ,"255",R.drawable.addicon));
        lstStations.add(new Stations("karura" ,"255",R.drawable.addicon));
        lstStations.add(new Stations("karura" ,"255",R.drawable.addicon));
        lstStations.add(new Stations("karura" ,"255",R.drawable.addicon));
        lstStations.add(new Stations("karura" ,"255",R.drawable.addicon));
        lstStations.add(new Stations("karura" ,"255",R.drawable.addicon));
        lstStations.add(new Stations("karura" ,"255",R.drawable.addicon));

    }

}
