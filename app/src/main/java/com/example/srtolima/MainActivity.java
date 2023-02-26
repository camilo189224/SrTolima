package com.example.srtolima;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Atributos
    ImageView btnPla200;
    ImageView btnPla250;
    ImageView btnPla300;
    ImageView btnPla350;
    ImageView btnPla400;
    ImageView btnPla500;

    //Metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar barra = getSupportActionBar();

        //cambiar el color del ActionBar
        ColorDrawable colorBarra = new ColorDrawable(Color.parseColor("#FFF30606"));
        barra.setBackgroundDrawable(colorBarra);

        //asociando los botones a eventos de click (escuchar click)
        btnPla200 = findViewById(R.id.pla200);
        btnPla250 = findViewById(R.id.pla250);
        btnPla300 = findViewById(R.id.pla300);
        btnPla350 = findViewById(R.id.pla350);
        btnPla400 = findViewById(R.id.pla400);
        btnPla500 = findViewById(R.id.pla500);
    }

    //Cargar el menu xml creado previamente
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Dar funcionamiento al menu

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //observamos a que item del menu le damos click
        int itemSeleccionado = item.getItemId();
        switch(itemSeleccionado){
            case (R.id.opcion1):
                Toast.makeText(this, "seleccionaste opcion1", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion2):
                Toast.makeText(this, "seleccionaste opcion2", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion3):
                Toast.makeText(this, "seleccionaste opcion3", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.opcion4):
                Toast.makeText(this, "seleccionaste opcion4", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}