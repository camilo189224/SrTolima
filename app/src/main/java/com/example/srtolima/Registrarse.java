package com.example.srtolima;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registrarse extends AppCompatActivity {

    EditText email, password, repassword;
    Button btn_reg, btn_backreg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        email = findViewById(R.id.correo);
        password = findViewById(R.id.password);
        repassword = findViewById(R.id.contrasenaConf);
        btn_reg = findViewById(R.id.btn_registro);
        btn_backreg = findViewById(R.id.btn_atrasreg);

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailUser = email.getText().toString().trim();
                String passwordUser = password.getText().toString().trim();
                String repasswordUser = repassword.getText().toString().trim();

                if (emailUser.isEmpty() && passwordUser.isEmpty() && repasswordUser.isEmpty()){
                    Toast.makeText(Registrarse.this, "complete los datos", Toast.LENGTH_SHORT).show();
                }else {
                    registerUser(emailUser, passwordUser, repasswordUser);
                }
            }
        });
    }

    private void registerUser(String emailUser, String passwordUser, String repasswordUser) {

    }
}



