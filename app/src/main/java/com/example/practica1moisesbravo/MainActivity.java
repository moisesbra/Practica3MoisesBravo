package com.example.practica1moisesbravo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin, buttonGuardar, buttonBuscar, buttonParametro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = (Button)findViewById(R.id.buttonLogin);
        buttonGuardar = (Button)findViewById(R.id.buttonGuardar);
        buttonBuscar = (Button)findViewById(R.id.buttonBuscar);
        buttonParametro = (Button)findViewById(R.id.buttonPasarParametro);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GuardarActivity.class);
                startActivity(intent);
            }
        });

        buttonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(intent);
            }
        });

        buttonParametro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PasarParametroActivity.class);
                startActivity(intent);
            }
        });
    }
}
