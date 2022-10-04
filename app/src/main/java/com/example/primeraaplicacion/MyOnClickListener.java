package com.example.primeraaplicacion;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyOnClickListener implements View.OnClickListener {
    private TextView textv;
    private EditText name;
    private int cont = 0;

    public MyOnClickListener(TextView textv, EditText name) {
        this.textv = textv;
        this.name = name;
    }

    public TextView getTextv() {
        return textv;
    }

    public void setTextv(TextView textv) {
        this.textv = textv;
    }

    public EditText getName() {
        return name;
    }

    public void setName(EditText name) {
        this.name = name;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    @Override
    public void onClick(View v) {
        if (name.getText().toString().isEmpty()) {
            textv.setText("INTRODUZCA UN NOMBRE");
        } else {
            textv.setText("Hola, " + name.getText());
        }
        System.err.println(name.getText());
        cont +=1;
        Log.i("***Contador: ", String.valueOf(cont));
    }

}
