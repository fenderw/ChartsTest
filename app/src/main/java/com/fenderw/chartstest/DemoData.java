package com.fenderw.chartstest;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Fender on 9/17/2017.
 */

public class DemoData {

    public TreeMap<Float, Float> get() {
        TreeMap<Float, Float> map = new TreeMap<>();
        map.put(1f, 5f);
        map.put(2f, 4f);
        map.put(3f, 7f);
        map.put(4f, 15f);
        map.put(5f, 25f);
        map.put(6f, 50f);
        map.put(7f, 30f);
        return map;
    }

}
