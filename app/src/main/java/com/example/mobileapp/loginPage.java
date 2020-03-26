package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginPage extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        button = (Button)findViewById(R.id.createacc); //identifying the button to be used
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //creating the function to be used when clicked
                openCreateAcc();
            }
        });

        button = (Button)findViewById(R.id.signin); //identifying the button to be used
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //creating the function to be used when clicked
                openMainpage();
            }
        });

        button = (Button)findViewById(R.id.forgotPawd); //identifying the button to be used
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //creating the function to be used when clicked
                openForgotPage();
            }
        });
    }

    public void openCreateAcc() //the page that opens when clicked
    {
        Intent intent = new Intent(this, createAcc.class);
        startActivity(intent);
    }

    public void openMainpage() //the page that opens when clicked
    {
        Intent intent = new Intent(this, mainPage.class);
        startActivity(intent);
    }

    public void openForgotPage() //the page that opens when clicked
    {
        Intent intent = new Intent(this, ForgotPage.class);
        startActivity(intent);
    }
}
