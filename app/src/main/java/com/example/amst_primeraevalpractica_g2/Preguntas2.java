package com.example.amst_primeraevalpractica_g2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Preguntas2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas2);
        Button btnCorrecto = findViewById(R.id.btnCorrecto2);
    }
    public void onClick(View v) {
        if(v.getId() == R.id.btnCorrecto2){
            Intent intent = new Intent(this, Preguntas3.class);
            startActivity(intent);
        }else if(v.getId() == R.id.btnCorrecto2) {
            Intent intent = new Intent(this, Derrota.class);
            startActivity(intent);
            int contador = 1;
        }
    }
}
