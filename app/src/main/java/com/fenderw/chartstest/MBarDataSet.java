package com.fenderw.chartstest;


import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.DataSet;

import java.util.TreeMap;

/**
 * Created by Fender on 9/17/2017.
 */

public class MBarDataSet extends MDataSet<BarEntry> {

    private BarDataSet dataSet;

    public MBarDataSet(TreeMap<Float, Float> data, int color) {
        dataSet = new BarDataSet(convertData(data), null);
        setColors(color);
    }

    @Override
    protected BarEntry getEntry(Float key, Float value) {
        return new BarEntry(key, value);
    }

    @Override
    DataSet<BarEntry> get() {
        return dataSet;
    }

    @Override
    void setColors(int color) {
        dataSet.setColor(color);
    }

    @Override
    void setUp() {
        // the rest of the setup
    }
}
