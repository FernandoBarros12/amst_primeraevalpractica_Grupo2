package com.example.amst_primeraevalpractica_g2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Preguntas extends AppCompatActivity {
    private ArrayList<Pregunta> preguntas = MainActivity.preguntas;
    private ArrayList<Integer> orden = MainActivity.orden;
    private static int contadorPreguntas =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        final Pregunta preguntaAct = preguntas.get(orden.get(contadorPreguntas));
        if (contadorPreguntas ==5)
        {
            Toast.makeText(this, "Procesando tu premio...", Toast.LENGTH_SHORT).show();
        }
        else
        {
            cargarPantallaPregunta(preguntaAct);
        }


    }

    public void cargarPantallaPregunta(final Pregunta preguntaAct)
    {
        contadorPreguntas+=1;
        final Pregunta new_preguntaAct = preguntas.get(orden.get(contadorPreguntas));
        ImageView imageView = findViewById(R.id.imagenPregunta);
        TextView enunciadoPregunta = findViewById(R.id.enunciadoPregunta);

        final Button btn1 = findViewById(R.id.btnopc1);
        final Button btn2 = findViewById(R.id.btnopc1);
        final Button btn3 = findViewById(R.id.btnopc1);
        final Button btn4 = findViewById(R.id.btnopc1);

        btn1.setText(preguntaAct.getOpcionesResp()[0]);
        btn2.setText(preguntaAct.getOpcionesResp()[1]);
        btn3.setText(preguntaAct.getOpcionesResp()[2]);
        btn4.setText(preguntaAct.getOpcionesResp()[3]);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn1.getText().toString().equals(preguntaAct.getRespuestaCorrecta()))
                {
                    cargarPantallaPregunta(new_preguntaAct);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn2.getText().toString().equals(preguntaAct.getRespuestaCorrecta()))
                {
                    cargarPantallaPregunta(new_preguntaAct);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn3.getText().toString().equals(preguntaAct.getRespuestaCorrecta()))
                {
                    cargarPantallaPregunta(new_preguntaAct);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btn4.getText().toString().equals(preguntaAct.getRespuestaCorrecta()))
                {
                    cargarPantallaPregunta(new_preguntaAct);
                }
            }
        });

    }


}
