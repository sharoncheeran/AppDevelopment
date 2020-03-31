package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class userProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        Button button = findViewById(R.id.BackUP); //button function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToHompage(); //creating the function to run when clicked
            }
        });

    }

    private void backToHompage()
    {
        Intent intent = new Intent(this, mainPage.class);
        startActivity(intent);
    }
}
