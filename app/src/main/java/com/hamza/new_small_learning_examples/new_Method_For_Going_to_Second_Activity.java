package com.hamza.new_small_learning_examples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class new_Method_For_Going_to_Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__method__for__going_to__second_);
        Button button=(Button)findViewById(R.id.clickfornewactivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(new_Method_For_Going_to_Second_Activity.this,Rating_Bar_Example.class);
                startActivity(intent);
            }
        });
    }
}
