package com.hamza.new_small_learning_examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButtonExample extends AppCompatActivity {
RadioGroup radioGroup;
Button button;
RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_example);

        radioGroup=(RadioGroup)findViewById(R.id.radio_g);
        button=(Button)findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int seleted_checkBox = radioGroup.getCheckedRadioButtonId();
                radioButton=(RadioButton)findViewById(seleted_checkBox);
                Toast.makeText(RadioButtonExample.this, radioButton.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
