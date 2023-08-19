package com.example.exerciciosapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText vlC;
    private EditText vlR;
    private EditText vlS;
    private TextView vlTotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vlC = findViewById(R.id.vlC);
        vlR = findViewById(R.id.vlR);
        vlS = findViewById(R.id.vlS);
        vlTotal = findViewById(R.id.txttotal);

    }


    @SuppressLint("SetTextI18n")
    public void verificar(View view) {

        int C =  Integer.parseInt(vlC.getText().toString());
        int R =  Integer.parseInt(vlR.getText().toString());
        int S =  Integer.parseInt(vlS.getText().toString());


        vlTotal.setText(String.valueOf(C*2.00+R*2.50+S*1.50));

        if(vlC == null || vlR == null || vlS == null){


            String texto = "Coloque os valores";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(this,texto,duration);
            toast.show();
        }


    }





}