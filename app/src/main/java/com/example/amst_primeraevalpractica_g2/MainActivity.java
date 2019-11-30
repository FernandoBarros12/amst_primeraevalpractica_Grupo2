package com.example.amst_primeraevalpractica_g2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    public static int contador;
    public static ArrayList<Pregunta> preguntas = new ArrayList<>();
    public static ArrayList<Integer> orden = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }    public void empezar(View view) {
        llenarpreguntas();
        Intent intent = new Intent(this, Preguntas.class);
        startActivity(intent);

    }

    public void llenarpreguntas(){
        String enunciado1="¿Cómo se llama el personaje principal de frozen?",enunciado2="¿Cómo se llama el personaje principal de la sirenita?", enunciado3="¿Cómo se llama el personaje principal de valiente?",enunciado4="¿Cómo se llama el personaje principal de la princesa y el sapo?",enunciado5="¿Cómo se llama el personaje principal de enredados?";
        String[] respuesta1 = {"Elsa", "Betty", "Anita", "Olaf"};
        String[] respuesta2 = {"Mellody", "Roberta", "Ariel", "Ursula"};
        String[] respuesta3 = {"Mellody", "Scarlett", "Bu", "Merida"};
        String[] respuesta4 = {"Diana", "Olivia", "Pocahontas", "Julexy"};
        String[] respuesta5 = {"Dayana", "Sofia", "Mohana", "Rapuncell"};
        String respuestaC1="Elsa",respuestaC2="Ariel",respuestaC3="Merida",respuestaC4="Diana",respuestaC5="Rapuncell";
        String urlImg1="batman.jpg",urlImg2="captain.jpg",urlImg3="titanic.jpg",urlImg4="elsa.jpg",urlImg5="rocky.jpg";
        Pregunta pregunta1 = new Pregunta(enunciado1,urlImg1,respuesta1,respuestaC1),pregunta2 = new Pregunta(enunciado2,urlImg2,respuesta2,respuestaC2),pregunta3 = new Pregunta(enunciado3,urlImg3,respuesta3,respuestaC3),pregunta4 = new Pregunta(enunciado4,urlImg4,respuesta4,respuestaC4),pregunta5 = new Pregunta(enunciado5,urlImg5,respuesta5,respuestaC5);
        preguntas.add(pregunta1);
        preguntas.add(pregunta2);
        preguntas.add(pregunta3);
        preguntas.add(pregunta4);
        preguntas.add(pregunta5);
    }

    public void llenarOrden(){

        while (orden.size()!=5){
            int n = indiceRandom();
            if (orden.isEmpty())
                orden.add(n);
            else{
                if(!orden.contains(new Integer(n)))
                    orden.add(n);
            }
        }
    }

    private int indiceRandom(){

        Random rand = new Random();
        int n = rand.nextInt(5);
        return n;
    }
}
