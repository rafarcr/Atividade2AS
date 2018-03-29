package com.example.rafarcr.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

            EditText user;
            EditText senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.userText);
        senha = (EditText) findViewById(R.id.senhaText);

    }


    public void Entrar (View view) {

        String usuario = user.getText().toString();
        String pass = senha.getText().toString();

        if (usuario.equals("fabio") && pass.equals("pedreiro")) {

            Intent segundaTela = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(segundaTela);

        }
           else {
               Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos ! !!",
                       Toast.LENGTH_LONG).show();
           }







    }


}
