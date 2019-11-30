package com.example.practica1moisesbravo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasarParametroActivity extends AppCompatActivity {

    EditText cajaDatos;
    Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar_parametro);

        cajaDatos = (EditText)findViewById(R.id.editTextParametro);
        botonEnviar = (Button)findViewById(R.id.buttonEnviarParametro);

        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PasarParametroActivity.this, RecibirParametroActivity.class);
                //se crea un objeto de tipo bundle que sera la vitacora de parametros a enviar
                Bundle bundle = new Bundle();
                // el metodo put fija los parametros a enviar mediante un id
                bundle.putString("dato", cajaDatos.getText().toString());
                // metodo putExtras envia un objeto de tipo bundle como un solo parametro entre actividades
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });


    }
}
