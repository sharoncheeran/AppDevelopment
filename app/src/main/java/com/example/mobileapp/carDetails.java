package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class carDetails extends AppCompatActivity {
    private EditText carMake, carModel, yearMake, regCar;
    private static final String FILE_NAME = "RUser.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        carMake = findViewById(R.id.carMake);
        carModel = findViewById(R.id.carModel);
        yearMake = findViewById(R.id.yearMake);
        regCar = findViewById(R.id.regCar);
        
        Button button = findViewById(R.id.BackCD); //button function
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCreateAcc(); //creating the function to run when clicked
            }
        });
        
        button = findViewById(R.id.SubmitCD);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitDetails(carMake.getText().toString(), carModel.getText().toString(), yearMake.getText().toString(), regCar.getText().toString()); //creating the function to run when clicked
            }
        });
    }

    private void submitDetails(String CMa, String CMo, String YM, String RC)
    {
        String space = "\n";
        String FN = "Car make: ";
        String LN = "Car model: ";
        String EA = "Year: ";
        String PA = "Reg number: ";
        String line = "--------------------------------------------------------";

        FileOutputStream fos = null;

        try {
            fos = openFileOutput(FILE_NAME, MODE_APPEND);

            fos.write(FN.getBytes());
            fos.write(CMa.getBytes());
            fos.write(space.getBytes());
            fos.write(LN.getBytes());
            fos.write(CMo.getBytes());
            fos.write(space.getBytes());
            fos.write(EA.getBytes());
            fos.write(YM.getBytes());
            fos.write(space.getBytes());
            fos.write(PA.getBytes());
            fos.write(RC.getBytes());
            fos.write(space.getBytes());
            fos.write(line.getBytes());
            fos.write(space.getBytes());

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
        Toast.makeText(this, "Thank you!", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, mainPage.class);
        startActivity(intent);
    }

    public void openCreateAcc() //the page that opens when the button is clicked
    {
        Intent intent = new Intent(this, mainPage.class);
        startActivity(intent);
    }
}

