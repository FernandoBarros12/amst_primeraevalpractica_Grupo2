package com.example.amst_primeraevalpractica_g2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Preguntas4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas4);
        Button btnCorrecto = findViewById(R.id.btnCorrecto4);
    }
    public void onClick(View v) {
        if(v.getId() == R.id.btnCorrecto4){
            Intent intent = new Intent(this, Preguntas5.class);
            startActivity(intent);
        }else if(v.getId() == R.id.btnCorrecto4) {
            Intent intent = new Intent(this, Derrota.class);
            startActivity(intent);
            int contador = 3;
        }
    }
}
