package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginscreen.R.id;

public class Sign_Up extends AppCompatActivity {

    EditText userName, password, email;
    Button signupButton;
    TextView login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        userName = findViewById(R.id.first_name);
        email = findViewById(R.id.email_signup);
        password = findViewById(R.id.password);
        signupButton = findViewById(R.id.signupButton);
        login = findViewById(R.id.lgn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_Up.this, MainActivity.class);
                startActivity(intent);
            }
        });



        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Sign_Up.this, "Sign Up Successful", Toast.LENGTH_SHORT).show();

            }
        });


    }
}