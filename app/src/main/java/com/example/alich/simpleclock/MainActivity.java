package com.example.alich.simpleclock;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button stopWatch;
    Button countDown;

    StopWatchFrag stopWatchFrag = new StopWatchFrag();
    CountDownFrag countDownFrag = new CountDownFrag();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        configure();



    }

    private void configure() {
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.main_frame ,stopWatchFrag)
//                .commit();


        stopWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_frame ,stopWatchFrag)
                        .commit();
//
            }
        });
        countDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_frame ,countDownFrag)
                        .commit();

            }
        });

    }

    private void findViews(){
        stopWatch = (Button) findViewById(R.id.stop_watch_button);
        countDown = (Button) findViewById(R.id.count_down_button);

    }
}
