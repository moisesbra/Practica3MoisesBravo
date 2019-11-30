package com.example.practica1moisesbravo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GuardarActivity extends AppCompatActivity {

    EditText nombres, apellidos;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar);

        nombres = (EditText)findViewById(R.id.editText_ingnombres);
        apellidos = (EditText)findViewById(R.id.editText_ingapellidos);
        enviar = (Button)findViewById(R.id.button_enviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GuardarActivity.this, RecibirDatosPersonales.class);
                Bundle bundle = new Bundle();
                bundle.putString("nombres",nombres.getText().toString());
                bundle.putString("apellidos",apellidos.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
