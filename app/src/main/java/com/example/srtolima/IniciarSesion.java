package com.example.srtolima;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class IniciarSesion extends AppCompatActivity {

    //ATRIBUTOS
    EditText correo1;
    EditText contrasena1;
    Button btn_IniciarSesion1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        //asociar instanciar los botones
        correo1 = findViewById(R.id.correo);
        contrasena1 = findViewById(R.id.password);
        btn_IniciarSesion1 = findViewById(R.id.btn_IniciarSesion);

    }

}