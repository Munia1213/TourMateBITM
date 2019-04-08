package com.example.shakil.tourmateproject.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shakil.tourmateproject.R;
import com.example.shakil.tourmateproject.WeatherInfo;

/**
 * Created by Shakil on 2/13/2018.
 */

public class RecyclerViewFragment extends Fragment {
    public RecyclerViewFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = this.getArguments();
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        WeatherInfo weatherInfo = (WeatherInfo) getActivity();
        recyclerView.setAdapter(weatherInfo.getAdapter(bundle.getInt("day")));
        return view;
    }
}
