//////////////////////////////////////////
// Author: Sharon Joseph Cheeran
// File name: userProfile.java
// Module: Computing project UFC4-45-3
// Purpose: Mobile application prototype
/////////////////////////////////////////

package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class userProfile extends AppCompatActivity {
    private static final String FILE_NAME = "RUser.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        EditText FName = findViewById(R.id.FirstNameUP);

        FileInputStream fis = null;
        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;

            while ((text = br.readLine()) != null)
            {
                sb.append(text).append("\n");
            }

            FName.setText(sb.toString());
            Toast.makeText(this, "Done", Toast.LENGTH_LONG).show();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally
        {
            if (fis != null)
            {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

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
