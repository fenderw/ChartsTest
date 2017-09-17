package com.fenderw.chartstest;


import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Fender on 9/17/2017.
 */

abstract class MDataSet<E extends Entry> {

    /**
     * Map the float input map into a list of entries
     *
     * @param data
     * @return
     */
    List<E> convertData(TreeMap<Float, Float> data) {
        final ArrayList<E> entries = new ArrayList<>();
        for (Map.Entry<Float, Float> entry : data.entrySet())
            entries.add(getEntry(entry.getKey(), entry.getValue()));
        return entries;
    }

    /**
     * Provides an entry for the set
     *
     * @param key
     * @param value
     * @return
     */
    protected abstract E getEntry(Float key, Float value);

    /**
     * Returns a data set
     *
     * @return
     */
    abstract DataSet<E> get();

    abstract void setColors(int color);

    /**
     * Set up the rest of necessary parameters for the set
     *
     */
    abstract void setUp();

}
