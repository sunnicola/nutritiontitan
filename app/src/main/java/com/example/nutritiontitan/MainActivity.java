package com.example.nutritiontitan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Signin;
   // private TextView tvRetry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.etName);
        Password = findViewById(R.id.etPassword);
        Signin = findViewById(R.id.btnSignin);

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });

    }


    private void validate(String userName, String userPassword){
        if((userName.equals("Titan")) && (userPassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this, Dashboard.class);
            startActivity(intent);
        }else{
            //login failure, let user try again
            System.out.println("TRY AGAIN");
        }
    }
}
