package com.example.srtolima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Bebidas extends AppCompatActivity {

    //Atributos
    ArrayList<Coca_cola> lista = new ArrayList<>();
    ArrayList<Postobon> lista1 = new ArrayList<>();
    ArrayList<Cerveza> lista2 = new ArrayList<>();
    RecyclerView listaLogica;
    RecyclerView listaLogica1;
    RecyclerView listaLogica2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        listaLogica = findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        listaLogica1 = findViewById(R.id.recycler1);
        listaLogica1.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        listaLogica2 = findViewById(R.id.recycler2);
        listaLogica2.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));


        crearListaCocaCola();
        Adaptador adaptador = new Adaptador(lista);
        listaLogica.setAdapter(adaptador);

        crearListaPostobon();
        Adaptador1 adaptador1 = new Adaptador1(lista1);
        listaLogica1.setAdapter(adaptador1);

        crearListaCerveza();
        Adaptador2 adaptador2 = new Adaptador2(lista2);
        listaLogica2.setAdapter(adaptador2);
    }

    public void crearListaCocaCola(){
        lista.add(new Coca_cola(R.drawable.coca_colamini,"Coca Cola 250ml","$2.000"));
        lista.add(new Coca_cola(R.drawable.coca_colaflexy,"Coca Cola 400ml","$3.000"));
        lista.add(new Coca_cola(R.drawable.coca_cola600,"Coca Cola 600ml","$4.000"));
        lista.add(new Coca_cola(R.drawable.coca_ceromini,"Coca Cola Cero 250ml","$2.000"));
        lista.add(new Coca_cola(R.drawable.brisamanz600,"Agua Brisa de Manzana 600ml","3.000"));
        lista.add(new Coca_cola(R.drawable.brisamanzmini,"Agua Brisa de Manzana 250ml","$2.000"));
        lista.add(new Coca_cola(R.drawable.delvallecirtrusflx,"Del Valle Citrus 500ml","$2.500"));
        lista.add(new Coca_cola(R.drawable.quatro_lt_y_medio, "Quatro 1000ml","$6.000"));
        lista.add(new Coca_cola(R.drawable.quatroflexy,"Quatro 400ml","$3.000"));
        lista.add(new Coca_cola(R.drawable.spriteflexy,"Sprite 400ml","$3.000"));
    }
    public void crearListaPostobon(){
        lista1.add(new Postobon(R.drawable.colombianamini,"Colombiana 250ml","$2.000"));
        lista1.add(new Postobon(R.drawable.colombianaflexy,"Colombiana 400ml","$3.000"));
        lista1.add(new Postobon(R.drawable.hitlulo,"Hit Lulo 500ml","$3.500"));
        lista1.add(new Postobon(R.drawable.hittropical,"Hit Tropical 500ml","$3.500"));
        lista1.add(new Postobon(R.drawable.hittropical1lt,"Hit Tropical 1000ml","$4.500"));
        lista1.add(new Postobon(R.drawable.hitmra,"Hit Mora 500ml","$3.500"));
        lista1.add(new Postobon(R.drawable.hitmora1lt,"Hit Mora 1000ml","$4.500"));
        lista1.add(new Postobon(R.drawable.uvamini,"Uva 250ml","$2.000"));
        lista1.add(new Postobon(R.drawable.hitmng1lt,"Hit Mango 1000ml","$4.500"));
    }
    public void crearListaCerveza(){
        lista2.add(new Cerveza(R.drawable.aguilalata,"Aguila en Lata","$4.000"));
    }
}