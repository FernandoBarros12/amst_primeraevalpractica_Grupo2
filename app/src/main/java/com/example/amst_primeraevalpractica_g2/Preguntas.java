package com.example.amst_primeraevalpractica_g2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Preguntas extends AppCompatActivity {
    //Button btnCorrecto ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        Button btnCorrecto = findViewById(R.id.btnCorrecto);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.btnCorrecto){
            Intent intent = new Intent(this, Preguntas2.class);
            startActivity(intent);
        }else if(v.getId() == R.id.btnCorrecto) {
            int contador = 0;
            Intent intent = new Intent(this, Derrota.class);
            startActivity(intent);
        }
    }
}
