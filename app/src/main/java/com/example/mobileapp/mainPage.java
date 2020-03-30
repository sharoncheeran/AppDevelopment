package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        Button button = findViewById(R.id.CarDetail); //button function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateAcc(); //creating the function to run when clicked
            }
        });

        button = findViewById(R.id.ConnectDev); //button function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openConnectDevice(); //creating the function to run when clicked
            }
        });

        button = findViewById(R.id.carStat); //button function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCarStatus(); //creating the function to run when clicked
            }
        });

        button = findViewById(R.id.carOp); //button function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCarOperations(); //creating the function to run when clicked
            }
        });

        button = findViewById(R.id.UserPro); //button function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserProfile(); //creating the function to run when clicked
            }
        });
    }

    private void openUserProfile()
    {
        Intent intent = new Intent(this, userProfile.class);
        startActivity(intent);
    }

    private void openCarOperations()
    {
        Intent intent = new Intent(this, carOperation.class);
        startActivity(intent);
    }

    private void openCarStatus()
    {
        Intent intent = new Intent(this, carStatus.class);
        startActivity(intent);
    }

    private void openConnectDevice()
    {
        Intent intent = new Intent(this, connectDevice.class);
        startActivity(intent);
    }

    public void openCreateAcc() //the page that opens when the button is clicked
    {
        Intent intent = new Intent(this, carDetails.class);
        startActivity(intent);
    }
}

