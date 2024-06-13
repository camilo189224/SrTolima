package com.example.srtolima;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    //Atributos
    Button btnIniciar, btnRegistrar, btnatras;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnIniciar = findViewById(R.id.iniciarSesion);
        btnRegistrar = findViewById(R.id.registrarse);
        btnatras = findViewById(R.id.volver);


        btnatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { finish();}
        });
    }

    public void irIniciar(View view){
        Intent i = new Intent(this, IniciarSesion.class);
        startActivity(i);
    }
    public void irRegistrar(View view){
        Intent i = new Intent(this, Registrarse.class);
        startActivity(i);
    }
}
