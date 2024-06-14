package com.example.srtolima;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IniciarSesion extends AppCompatActivity {

    //ATRIBUTOS
    EditText correo1, contrasena1;
    Button btn_IniciarSesion1, btn_atras1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        //asociar instanciar los botones
        correo1 = findViewById(R.id.correoIniciar);
        contrasena1 = findViewById(R.id.contrasenaIniciar);
        btn_IniciarSesion1 = findViewById(R.id.btn_IniciarSesion);
        btn_atras1 = findViewById(R.id.btn_atrasini);

        //evento click
        btn_IniciarSesion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String correoUser = correo1.getText().toString().trim();
                String contrasenaUser = contrasena1.getText().toString().trim();

                if (correoUser.isEmpty() && contrasenaUser.isEmpty()) {
                    Toast.makeText(IniciarSesion.this, "Ingrese su correo y contraseña", Toast.LENGTH_SHORT).show();
                }else{
                    iniciarSesion(correoUser, contrasenaUser);
                }
            }
        });
        btn_atras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
            });
    }
    private void iniciarSesion(String correoUser, String contrasenaUser) {

    }
}