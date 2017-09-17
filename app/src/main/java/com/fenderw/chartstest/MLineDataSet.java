package com.fenderw.chartstest;


import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.TreeMap;

/**
 * Created by Fender on 9/17/2017.
 */

public class MLineDataSet extends MDataSet<Entry> {

    private LineDataSet dataSet;

    public MLineDataSet(TreeMap<Float, Float> data, int color) {
        dataSet = new LineDataSet(convertData(data), null);
        setColors(color);
    }

    @Override
    protected Entry getEntry(Float key, Float value) {
        return new Entry(key, value);
    }

    @Override
    DataSet<Entry> get() {
        return dataSet;
    }

    @Override
    void setColors(int color) {
        dataSet.setColor(color);
        dataSet.setCircleColor(color);
    }

    @Override
    void setUp() {
        // the rest of the setup
    }
}
