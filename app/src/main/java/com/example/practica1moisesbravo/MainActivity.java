package com.example.practica1moisesbravo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin, buttonGuardar, buttonBuscar, buttonParametro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.buttonLogin);
        buttonGuardar = findViewById(R.id.buttonGuardar);
        buttonBuscar = findViewById(R.id.buttonBuscar);
        buttonParametro = findViewById(R.id.buttonPasarParametro);

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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.opcionLogin:
                intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.opcionGuardar:
            intent = new Intent(MainActivity.this, GuardarActivity.class);
            startActivity(intent);
            break;
            case R.id.opcionBuscar:
                intent = new Intent(MainActivity.this, BuscarActivity.class);
                startActivity(intent);
                break;
            case R.id.opcionPasarparatmetro:
                intent = new Intent(MainActivity.this, PasarParametroActivity.class);
                startActivity(intent);
                break;

        }
        return true;
    }
}
