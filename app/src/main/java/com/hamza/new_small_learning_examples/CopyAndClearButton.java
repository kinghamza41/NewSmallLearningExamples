package com.hamza.new_small_learning_examples;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CopyAndClearButton extends AppCompatActivity {
EditText editText;
Button copy,clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copy_and_clear_button);

        editText=(EditText)findViewById(R.id.edt1);
        copy=(Button)findViewById(R.id.btncopy);
        clear=(Button)findViewById(R.id.btnclear);

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String copyData=editText.getText().toString();
                ClipboardManager clipboardManager=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData=ClipData.newPlainText("Data",copyData);
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"Data is Copied",Toast.LENGTH_SHORT).show();
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clearData=editText.getText().toString();
                editText.setText("");
            }
        });
    }

}
