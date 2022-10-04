package com.example.primeraaplicacion;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContadorActivity extends AppCompatActivity {
    private EditText num;
    private int result = 0;
    private TextView textv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        Button sumar = findViewById(R.id.sumar);
        Button restar = findViewById(R.id.restar);

        textv = findViewById(R.id.textView2);
        num = findViewById(R.id.editTextNumber);

        sumar.setOnClickListener(v -> onClickSumar());
        restar.setOnClickListener(v -> onClickRestar());
    }

    public void onClickSumar() {
        int numero = Integer.parseInt(num.getText().toString());
        result += numero;
        textv.setText("El resultado es: " + result);
    }

    public void onClickRestar() {
        int numero = Integer.parseInt(num.getText().toString());
        result -= numero;
        textv.setText("El resultado es: " + result);
    }
}