package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class createAcc extends AppCompatActivity {
    private Button button;
    private EditText fName, lName, eAddress, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createacc);

        fName = findViewById(R.id.FirstName);
        lName = findViewById(R.id.LastName);
        eAddress = findViewById(R.id.EmailCA);
        pass = findViewById(R.id.PasswordCA);
        button = findViewById(R.id.BackRE); //finding button

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theloginPage(); //creating the function to run when clicked
            }
        });

        button = findViewById(R.id.SubmitRE); //button function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 createAcc(fName.getText().toString(), lName.getText().toString(), eAddress.getText().toString(), pass.getText().toString()); //creating the function to run when clicked
            }
        });
    }

    public void theloginPage() //the page that opens when the button is clicked
    {
        Intent intent = new Intent(this, loginPage.class);
        startActivity(intent);
    }

    public void createAcc(String fName, String lName, String eAddress, String pass) //the page that opens when the button is clicked
    {

        //Store it in file, then start activity.
        Intent intent = new Intent(this, loginPage.class);
        startActivity(intent);

        Toast.makeText(this, "Thank you for registering!", Toast.LENGTH_SHORT).show();
    }

}
