package com.fenderw.chartstest;

import android.content.Context;
import android.graphics.Color;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.TreeMap;

/**
 * Created by Fender on 9/17/2017.
 */

public class MChart {

    public static final int LINE_CHART = 1;
    public static final int BAR_CHART = 2;

    private MDataSet dataSet;
    private int type;
    private final int lineColor = Color.GREEN;

    public MChart(int type) {
       this.type = type;
    }

    public Chart create(Context context, TreeMap<Float, Float> data) {
        Chart chart = null;
        switch (type) {
            case LINE_CHART:
                chart = new LineChart(context);
                dataSet = new MLineDataSet(data, lineColor);
                chart.setData(new LineData((LineDataSet)dataSet.get()));
                break;
            case BAR_CHART:
                chart = new BarChart(context);
                dataSet = new MBarDataSet(data, lineColor);
                chart.setData(new BarData((BarDataSet)dataSet.get()));
                break;
            default: throw new IllegalArgumentException("Wrong chart type");
        }
        return chart;
    }

}
