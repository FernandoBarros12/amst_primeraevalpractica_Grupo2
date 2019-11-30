package com.example.amst_primeraevalpractica_g2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Preguntas5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas5);
        Button btnCorrecto = findViewById(R.id.btnCorrecto5);
    }
    public void onClick(View v) {
        int contador;
        if(v.getId() == R.id.btnCorrecto5){
            Intent intent = new Intent(this, premio.class);
            startActivity(intent);
            contador = 5;
        }else if(v.getId() == R.id.btnCorrecto5) {
            Intent intent = new Intent(this, Derrota.class);
            startActivity(intent);
            contador = 4;
        }
    }
}
