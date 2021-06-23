package com.hamza.new_small_learning_examples;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Toggle_Button extends AppCompatActivity {
ToggleButton toggleButton,toggleButton2;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle__button);
        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        toggleButton2=(ToggleButton)findViewById(R.id.togglButton2);
        button=(Button)findViewById(R.id.toggle_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder builder=new StringBuilder();
                builder.append("Toggle : \n").append(toggleButton.getText());
                builder.append("Toggle : ").append(toggleButton2.getText());
                Toast.makeText(Toggle_Button.this, builder.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
