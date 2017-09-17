package com.fenderw.chartstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerImage;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout container = (LinearLayout) findViewById(R.id.container);
        final Chart chart = new MChart(1).create(this, new DemoData().get());
        LinearLayout.LayoutParams LPL = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        container.addView(chart, LPL);
        chart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, Highlight h) {
                Toast.makeText(getBaseContext(), "click " + e.toString(), Toast.LENGTH_SHORT).show();
                chart.setMarker(new MarkerImage(getBaseContext(), R.mipmap.ic_launcher));
            }

            @Override
            public void onNothingSelected() {
                Toast.makeText(getBaseContext(), "nothing", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
