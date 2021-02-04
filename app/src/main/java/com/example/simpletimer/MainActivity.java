package com.example.simpletimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button startB;
    private MyCountDownTimer countDownTimer;
    private long timerElapsed;
    private boolean timerHasStarted = false;
    private TextView text;
    private TextView timeElapsedView;
    private final long startTime = 50 * 1000;
    private final long interval = 1 * 1000;

    private  Button testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startB = this.findViewById(R.id.button);
        startB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!timerHasStarted) {
                    countDownTimer.start();
                    timerHasStarted = true;
                    String startString = getString(R.string.startLabel);
                    startB.setText(startString);
                }
                else {
                    countDownTimer.cancel();
                    timerHasStarted = false;
                    startB.setText(getText(R.string.resetLabel));
                }
            }
        });

        /*testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This Button does this stuff, second Button
            }
        });
        */
    }


    public class MyCountDownTimer extends CountDownTimer {

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {

        }

        @Override
        public void onFinish() {

        }
    }
}