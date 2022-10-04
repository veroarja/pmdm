package com.example.primeraaplicacion;

import static com.example.primeraaplicacion.ContadorOnClickListener.Operacion.RESTAR;
import static com.example.primeraaplicacion.ContadorOnClickListener.Operacion.SUMAR;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Contador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        Button sumar = findViewById(R.id.sumar);
        Button restar = findViewById(R.id.restar);

        TextView textv = findViewById(R.id.textView2);
        EditText num = findViewById(R.id.editTextNumber);

        sumar.setOnClickListener(new ContadorOnClickListener(num,SUMAR,textv));
        restar.setOnClickListener(new ContadorOnClickListener(num,RESTAR,textv));
    }
}