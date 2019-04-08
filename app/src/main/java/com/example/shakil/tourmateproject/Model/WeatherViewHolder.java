package com.example.shakil.tourmateproject.Model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.shakil.tourmateproject.R;

/**
 * Created by Shakil on 2/13/2018.
 */

public class WeatherViewHolder extends RecyclerView.ViewHolder {

    public TextView itemDate;
    public TextView itemTemperature;
    public TextView itemDescription;
    public TextView itemWind;
    public TextView itemPressure;
    public TextView itemHumidity;
    public TextView itemIcon;
    public View lineView;

    public WeatherViewHolder(View view) {
        super(view);
        this.itemDate = (TextView) view.findViewById(R.id.itemDate);
        this.itemTemperature = (TextView) view.findViewById(R.id.itemTemperature);
        this.itemDescription = (TextView) view.findViewById(R.id.itemDescription);
        this.itemWind = (TextView) view.findViewById(R.id.itemWind);
        this.itemPressure = (TextView) view.findViewById(R.id.itemPressure);
        this.itemHumidity = (TextView) view.findViewById(R.id.itemHumidity);
        this.itemIcon = (TextView) view.findViewById(R.id.itemIcon);
        this.lineView = view.findViewById(R.id.lineView);
    }
}
