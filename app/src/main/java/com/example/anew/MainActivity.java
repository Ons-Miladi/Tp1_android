package com.example.anew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "MainActivity.java");//MainActivity.java est le nom du fichier de mise en page de l'activité principale
        Log.d("MainActivity", "android:name");//l'attribut android:name est pour la classe qui implémente l'activité
        Log.d("MainActivity", "AVD Manager");//AVD Manger est une outil utilisé pour créer un nouvel émulateur
        Log.i("MainActivity", "MainActivity layout is complete");
        Log.d("MainActivity", "Info"); //le menu de niveau Log est réglé sur Info



    }
}