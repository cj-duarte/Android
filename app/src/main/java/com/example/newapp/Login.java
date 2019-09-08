package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button boton = (Button) findViewById(R.id.ingresar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = ((EditText) findViewById(R.id.correo)).getText().toString();
                String password = ((EditText) findViewById(R.id.clave)).getText().toString();
                if(usuario.equals("cj-duarte@hotmail.com") && password.equals("123456")){
                    Intent nuevoform = new Intent(Login.this,Menu.class);
                    startActivity(nuevoform);
                }
                else if (!usuario.equals("cj-duarte@hotmail.com")){
                    Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
                }else if (!password.equals("123456")){
                    Toast.makeText(getApplicationContext(), "Password Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });

        /*int a = 10;
        int b = 20;

        if (a==b){
            Toast.makeText(this, "You are in the menu", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "You don´s have access", Toast.LENGTH_LONG).show();
        }*/

    }
}
