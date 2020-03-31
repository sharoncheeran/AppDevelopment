package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class carStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_status);

        Button button = findViewById(R.id.BackFS); //button function
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
