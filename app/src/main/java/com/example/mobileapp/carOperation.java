//////////////////////////////////////////
// Author: Sharon Joseph Cheeran
// File name: carOperation.java
// Module: Computing project UFC4-45-3
// Purpose: Mobile application prototype
/////////////////////////////////////////

package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class carOperation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_operation);

        Button button = findViewById(R.id.BackCO); //button function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backTohomepage(); //creating the function to run when clicked
            }
        });
    }

    private void backTohomepage()
    {
        Intent intent = new Intent(this, mainPage.class);
        startActivity(intent);
    }
}
