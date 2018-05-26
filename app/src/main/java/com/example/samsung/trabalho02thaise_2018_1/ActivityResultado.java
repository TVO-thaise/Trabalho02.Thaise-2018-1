package com.example.samsung.trabalho02thaise_2018_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Samsung on 25/05/2018.
 */

public class ActivityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();

        String cargo = (String) intent.getSerializableExtra("cargo");
        double salBase = (double) intent.getSerializableExtra("salarioBase");
        double inss = (double) intent.getSerializableExtra("inss");
        double salLiquido = (double) intent.getSerializableExtra("salarioLiquido");



        TextView tvNome = (TextView) findViewById(R.id.tvNome);
        tvNome.setText("Cargo: "+ cargo);

        TextView tvSalarioBruto = (TextView) findViewById(R.id.tvSalBase);
        tvSalarioBruto.setText("Salário Base: "+ salBase);

        TextView tvInss = (TextView) findViewById(R.id.tvInss);
        tvInss.setText("INSS: "+ inss);

        TextView tvSalarioLiquido = (TextView) findViewById(R.id.tvSalLiquido);
        tvSalarioLiquido.setText("Salário Liquido: "+ salLiquido);
    }
}
