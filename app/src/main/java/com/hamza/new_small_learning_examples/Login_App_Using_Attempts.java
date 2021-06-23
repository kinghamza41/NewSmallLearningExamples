package com.hamza.new_small_learning_examples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_App_Using_Attempts extends AppCompatActivity {
EditText user,pass;
TextView textView;
Button button;
int attempts_counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__app__using__attempts);
        user=(EditText)findViewById(R.id.enter_user);
        pass=(EditText)findViewById(R.id.enter_pass);
        textView=(TextView)findViewById(R.id.attempts_view);
        button=(Button)findViewById(R.id.login_info_btn);
        textView.setText(Integer.toString(attempts_counter));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("user")&& pass.getText().toString().equals("pass")){
                    Toast.makeText(Login_App_Using_Attempts.this, "You have successfully login", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getApplicationContext(),Login_App_Welcome_Actvity.class);
                }
                else{
                    Toast.makeText(Login_App_Using_Attempts.this, "User or Password is incorrect", Toast.LENGTH_SHORT).show();
                    attempts_counter--;
                    textView.setText(Integer.toString(attempts_counter));
                    if (attempts_counter==0)
                       button.setEnabled(false);
                    
                }
            }
        });
    }
}
