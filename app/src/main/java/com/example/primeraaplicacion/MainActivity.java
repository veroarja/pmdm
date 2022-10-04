package com.example.primeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton1 = findViewById(R.id.button2);
        TextView textv = findViewById(R.id.textView);
        EditText name = findViewById(R.id.editTextTextPersonName);

        boton1.setText("Saludar");
        MyOnClickListener b1 = new MyOnClickListener(textv,name);
        boton1.setOnClickListener(b1);



    }
}