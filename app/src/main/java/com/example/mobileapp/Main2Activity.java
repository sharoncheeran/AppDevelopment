package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button = (Button)findViewById(R.id.BackRE); //button function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateAcc(); //creating the function to run when clicked
            }
        });
    }

    public void openCreateAcc() //the page that opens when the button is clicked
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
