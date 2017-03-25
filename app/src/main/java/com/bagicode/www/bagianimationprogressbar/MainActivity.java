package com.bagicode.www.bagianimationprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar bar_tot = (ProgressBar) findViewById(R.id.bar_tot);

        ProgressBarAnimation mProgressAnimationTot = new ProgressBarAnimation(bar_tot, 3000);
        mProgressAnimationTot.setProgress(50);
    }
}
