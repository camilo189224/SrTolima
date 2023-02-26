package com.example.srtolima;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    //Atributos
    MediaPlayer cancion;

    //Metodos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Ocultar el action bar
        ActionBar barra = getSupportActionBar();
        barra.hide();

        //Lanzar la cancion
        cancion = MediaPlayer.create(this,R.raw.noche_buena);
        cancion.start();

        //Temporizar la duracion del splash
        TimerTask inicioapp = new TimerTask() {
            @Override
            public void run() {

                //Lanzar una nueva actividad
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
                cancion.stop();

            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicioapp,10000);

    }
}