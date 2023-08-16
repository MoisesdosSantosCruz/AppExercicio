package com.example.exerciciosapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public EditText txtvl1;

    private EditText txtvlA;
    private EditText txtvlB;

    private EditText txtvlC;

    private TextView txtresultado;
    private TextView txtresultA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtvl1 = findViewById(R.id.txtvalor);
        txtresultado = findViewById(R.id.txtresultado);
        txtresultA = findViewById(R.id.txtresultA);
        txtvlA = findViewById(R.id.txtvlA);
        txtvlB = findViewById(R.id.txtvlB);
        txtvlC = findViewById(R.id.txtvlC);
    }


    public void verificar(View view) {

        int i =  Integer.parseInt(txtvl1.getText().toString());
        int a =  Integer.parseInt(txtvlA.getText().toString());
        int b =  Integer.parseInt(txtvlB.getText().toString());
        int c =  Integer.parseInt(txtvlC.getText().toString());




        if (i == 1 || i==3 || i==5 || i==7) {
            int count = 1;

            txtresultado.setText(String.valueOf(i+a+b+c));

            count++;
            txtresultA.setText(String.valueOf("A,B,C= " + count + count + count));

        }

            else if (i > 10) {

            int count = -1;

             txtresultado.setText(String.valueOf(i-a-b-c));

             count--;
             txtresultA.setText(String.valueOf("A,B,C = "+ count + count + count));

        }



    }


}