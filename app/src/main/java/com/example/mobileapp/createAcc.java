package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.Arrays;

public class createAcc extends AppCompatActivity {
    private EditText FName, LName, EAddress, Pass;
    private static final String FILE_NAME = "RUser.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createacc);

        FName = findViewById(R.id.FirstName);
        LName = findViewById(R.id.LastName);
        EAddress = findViewById(R.id.EmailCA);
        Pass = findViewById(R.id.PasswordCA);
        Button button = findViewById(R.id.BackRE); //finding button

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
                 createAcc(FName.getText().toString(), LName.getText().toString(), EAddress.getText().toString(), Pass.getText().toString()); //creating the function to run when clicked
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
        String space = "\n";
        String FN = "First Name: ";
        String LN = "Last Name: ";
        String EA = "Email Address: ";
        String PA = "Password: ";

        FileOutputStream fos = null;

        try {
            fos = openFileOutput(FILE_NAME, MODE_APPEND);

            fos.write(FN.getBytes());
            fos.write(fName.getBytes());
            fos.write(space.getBytes());
            fos.write(LN.getBytes());
            fos.write(lName.getBytes());
            fos.write(space.getBytes());
            fos.write(EA.getBytes());
            fos.write(eAddress.getBytes());
            fos.write(space.getBytes());
            fos.write(PA.getBytes());
            fos.write(pass.getBytes());
            fos.write(space.getBytes());

            //Toast.makeText(this, "Saved to " + getFilesDir() + "/" + FILE_NAME, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null)
            {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //Store it in file, then start activity.
        Intent intent = new Intent(this, loginPage.class);
        startActivity(intent);

        Toast.makeText(this, "Thank you for registering!", Toast.LENGTH_SHORT).show();
    }

}
