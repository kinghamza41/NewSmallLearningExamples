package com.hamza.new_small_learning_examples;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AutoCompleteTextView1 extends AppCompatActivity {
TextView textView;
AutoCompleteTextView autoCompleteTextView;
String[] names={"Hamza","Huusnain","Suleman","Aslam","Ali","Shahzaib"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        textView=(TextView)findViewById(R.id.tv1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, names);
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.actv2);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setTextColor(Color.RED);
    }
}
