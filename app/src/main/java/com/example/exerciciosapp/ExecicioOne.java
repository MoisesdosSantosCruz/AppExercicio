package com.example.exerciciosapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExecicioOne extends AppCompatActivity {

    private EditText txtvl1;
    private EditText txtvl2;
    private TextView txtresult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_execicio_one);
        txtvl1 = findViewById(R.id.txtvl1);
        txtvl2 = findViewById(R.id.txtvl2);
        txtresult = findViewById(R.id.txtresult);
    }

    public void Apresentar(View view) {

       String guess = txtvl1.getText().toString();
       String guess2 =txtvl2.getText().toString();
       int theguess = Integer.parseInt(guess);
       int theguess2 =Integer.parseInt(guess2);
       int txtvl1 = (theguess%theguess2);
       if(txtvl1 == 0){
           txtresult.setText("Seu número é múltiplo");

       }
        else if(txtvl1 == 1){
            txtresult.setText("Seu número não é multiplo");

       }

        int x = 5;

        for (int i = 1; i <= 100; i++) {
            System.out.println(" ");
            if (i % 2 == 0) {
                System.out.println("Número par : " + i);
                for (int j = 3; j < 5; j++) {
                    if (i % j == 0) {
                        System.out.println("Múltiplo de : " + j);
                        if (i % x == 0) {
                            for (int k = i; k == 0; k--) {
                                System.out.println(" Multiplos de 5 : " + k);
                                System.out.print(" ");
                            }
                        }
                    }
                }
            } else {
                System.out.println("Número ímpar: " + i);
                for (int j = 3; j < 5; j++) {
                    if (i % j == 0) {
                        System.out.println("Múltiplo de : " + j);
                        if (i % x == 0) {
                            for (int k = i; k == 0; k--) {
                                System.out.println("Multiplos de 5: " + k);
                            }
                        }
                    }
                }
            }
        }
    }

}