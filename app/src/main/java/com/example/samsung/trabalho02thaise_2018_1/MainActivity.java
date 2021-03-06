package com.example.samsung.trabalho02thaise_2018_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private RadioButton cargo;
    private EditText horaExtraTrab;
    private EditText filhos;
    private EditText faltas;
    private EditText proventos;
    private EditText descontos;
    private EditText num_filhos;
    private Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargo = (RadioButton) findViewById(R.id.rgCargo);
        horaExtraTrab = (EditText) findViewById(R.id.etHorasExtraTrabalhadas);
        filhos = (EditText) findViewById(R.id.etNfilhos);
        faltas = (EditText) findViewById(R.id.etNfaltas);
        calcular = (Button) findViewById(R.id.btCalcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double fHoraExtraTrab = Double.parseDouble(horaExtraTrab.getText().toString());
                double salarioBase;
                double salarioLiquido, ir, inss, sindicato;

                horaExtraTrab = salarioBase/240 * 2;

                faltas = salarioBase /30;
                filhos = salarioBase * 0,03;
                inss = salarioBase * 0.10;
                proventos = salarioBase + horaExtraTrab + num_filhos * filhos;
                descontos = inss + faltas;

                salarioLiquido = proventos - descontos;

                Intent intent = new Intent(MainActivity.this, ActivityResultado.class);
                intent.putExtra("salarioBase", salarioBase);
                intent.putExtra("inss", inss);
                intent.putExtra("salarioLiquido", salarioLiquido);
                startActivity(intent);
            }

        });

    }

    ;
}


