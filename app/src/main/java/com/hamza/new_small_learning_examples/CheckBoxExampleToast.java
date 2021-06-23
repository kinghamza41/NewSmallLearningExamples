package com.hamza.new_small_learning_examples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CheckBoxExampleToast extends AppCompatActivity {
private CheckBox checkBox1,checkBox2,checkBox3;
private Button save_btn;
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_example_toast);
        addClickOnListener();
        checkBoxClickListener();
    }
    public void checkBoxClickListener(){
        checkBox1=(CheckBox)findViewById(R.id.cb1);
        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked()){
                    Toast.makeText(getApplicationContext(),"Cat is Selected",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void addClickOnListener(){
        checkBox1=(CheckBox)findViewById(R.id.cb1);
        checkBox2=(CheckBox)findViewById(R.id.cb2);
        checkBox3=(CheckBox)findViewById(R.id.cb3);
        editText=(EditText)findViewById(R.id.pass);
        save_btn=(Button)findViewById(R.id.btn_save);

        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer stringBuffer=new StringBuffer();
                stringBuffer.append("Cow : ").append(checkBox1.isChecked());
                stringBuffer.append("\n Dog : ").append(checkBox2.isChecked());
                stringBuffer.append("\n Cat : ").append(checkBox3.isChecked());

                Toast.makeText(getApplicationContext(),editText.getText(),Toast.LENGTH_SHORT).show();
                Toast.makeText(CheckBoxExampleToast.this,stringBuffer.toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

}
