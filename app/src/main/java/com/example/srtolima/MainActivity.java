package com.example.srtolima;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //Atributos

    ImageButton btnPla200;
    ImageButton btnPla250;
    ImageButton btnPla300;
    ImageButton btnPla350;
    ImageButton btnPla400;
    ImageButton btnPla450;
    ImageButton btnPla500;
    ImageButton btnEmpaLech;

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
        btnPla450 = findViewById(R.id.pla450);
        btnPla500 = findViewById(R.id.pla500);
        btnEmpaLech = findViewById(R.id.empaLech);
        btnPla200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBebidas = new Intent(MainActivity.this,Bebidas.class);
                startActivity(intentBebidas);
            }
        });
        btnPla250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBebidas = new Intent(MainActivity.this,Bebidas.class);
                startActivity((intentBebidas));
            }
        });
        btnPla300.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBebidas = new Intent(MainActivity.this,Bebidas.class);
                startActivity((intentBebidas));
            }
        });
        btnPla350.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBebidas = new Intent(MainActivity.this,Bebidas.class);
                startActivity((intentBebidas));
            }
        });
        btnPla400.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBebidas = new Intent(MainActivity.this,Bebidas.class);
                startActivity((intentBebidas));
            }
        });
        btnPla450.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBebidas = new Intent(MainActivity.this,Bebidas.class);
                startActivity((intentBebidas));
            }
        });
        btnPla500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBebidas = new Intent(MainActivity.this,Bebidas.class);
                startActivity((intentBebidas));
            }
        });
        btnEmpaLech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBebidas = new Intent(MainActivity.this,Bebidas.class);
                startActivity((intentBebidas));
            }
        });
    }

    //metodo para cambiar el idioma de mi app
    public void cambiarIdioma(String idioma){

        //configurando el lenguaje del telefono
        Locale lenguaje = new Locale(idioma);
        Locale.setDefault(lenguaje);

        //configuracion global del telefono
        Configuration configuracionTelefono = getResources().getConfiguration();
        configuracionTelefono.locale = lenguaje;

        //ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());

    }

    //Cargar el menu xml creado previamente
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Dar funcionamiento al menu
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