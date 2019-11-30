package com.example.practica1moisesbravo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RecibirDatosPersonales extends AppCompatActivity {

    TextView nombres, apellidos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_datos_personales);

        nombres = (TextView)findViewById(R.id.textView_nombres_recibidos);
        apellidos = (TextView)findViewById(R.id.textView_apellidos_recibidos);

        Bundle bundle = this.getIntent().getExtras();
        nombres.setText(bundle.getString("nombres"));
        apellidos.setText(bundle.getString("apellidos"));
    }
}
