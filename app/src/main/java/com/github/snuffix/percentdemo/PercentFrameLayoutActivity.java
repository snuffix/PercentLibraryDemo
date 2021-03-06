package com.github.snuffix.percentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PercentFrameLayoutActivity extends Activity {

    @Bind(R.id.title)
    TextView titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percent_frame_layout);
        ButterKnife.bind(this);
        titleView.setText("Percent frame layout case");
    }
}
