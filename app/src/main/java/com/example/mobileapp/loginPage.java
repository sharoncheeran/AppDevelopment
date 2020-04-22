//////////////////////////////////////////
// Author: Sharon Joseph Cheeran
// File name: bloginPage.java
// Module: Computing project UFC4-45-3
// Purpose: Mobile application prototype
/////////////////////////////////////////

package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginPage extends AppCompatActivity {
    private EditText Name;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        Name = findViewById(R.id.etEmail);
        Password = findViewById(R.id.etPassword);
        Button login = findViewById(R.id.btnLogin);

        Button button = findViewById(R.id.createacc); //identifying the button to be used
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //creating the function to be used when clicked
                openCreateAcc();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //creating the function to be used when clicked
                Validate(Name.getText().toString(), Password.getText().toString());
            }
        });

        button = findViewById(R.id.forgotPawd); //identifying the button to be used
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //creating the function to be used when clicked
                openForgotPage();
            }
        });
    }

    public void Validate(String userEmail, String userPassword)
    {
        /*background bg = new background(this);
        bg.execute(userEmail, userPassword);*/

        if(userEmail.equals("Admin@mail.com") && userPassword.equals("1234")) //logging into the application
        {
            Intent intent = new Intent(loginPage.this, mainPage.class);
            startActivity(intent);
            Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Incorrect username or password!", Toast.LENGTH_SHORT).show();
        }
    }

    public void openCreateAcc() //the page that opens when clicked
    {
        Intent intent = new Intent(this, createAcc.class);
        startActivity(intent);
    }

    public void openForgotPage() //the page that opens when clicked
    {
        Intent intent = new Intent(this, ForgotPage.class);
        startActivity(intent);
    }
}
