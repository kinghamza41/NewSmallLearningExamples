package com.hamza.new_small_learning_examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;

public class Analog_Digital_Clock_Example extends AppCompatActivity {
AnalogClock analogClock;
DigitalClock digitalClock;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analog__digital__clock__example);
        analogClock=(AnalogClock)findViewById(R.id.analog_clock);
        digitalClock=(DigitalClock)findViewById(R.id.digital_clock);
        button=(Button)findViewById(R.id.btn_swap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (digitalClock.getVisibility()==DigitalClock.GONE){
                    digitalClock.setVisibility(DigitalClock.VISIBLE);
                    analogClock.setVisibility(AnalogClock.GONE);

                }
                else{
                    analogClock.setVisibility(AnalogClock.VISIBLE);
                    digitalClock.setVisibility(DigitalClock.GONE);
                }
            }
        });
    }
}
