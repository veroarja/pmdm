package com.example.primeraaplicacion;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ContadorOnClickListener implements View.OnClickListener {
    enum Operacion {
        SUMAR, RESTAR;
    }
    private Operacion operacion = null;
    private EditText num;
    private int result;
    private TextView resultado;

    public ContadorOnClickListener() {
    }

    public ContadorOnClickListener(EditText num, Operacion operacion, TextView resultado) {
        this.operacion = operacion;
        this.resultado = resultado;
        this.num = num;
    }

    public void onClickSumar(View v) {
        int numero = Integer.parseInt(num.getText().toString());
        result += numero;
        resultado.setText("El resultado es: " + result);
    }

    public void onClickRestar(View v) {
        int numero = Integer.parseInt(num.getText().toString());
        result -= numero;
        resultado.setText("El resultado es: " + result);
    }

    @Override
    public void onClick(View v) {
        if (operacion.equals("SUMAR")) {
            onClickSumar(v);
        } else if (operacion.equals("RESTAR")) {
            onClickRestar(v);
        } else {
            resultado.setText("ERROR");
        }

    }
}
