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

        String nome = (String) intent.getSerializableExtra("nome");
        double salBruto = (double) intent.getSerializableExtra("salarioBruto");
        double inss = (double) intent.getSerializableExtra("inss");
        double sindicato = (double) intent.getSerializableExtra("sindicato");
        double salLiquido = (double) intent.getSerializableExtra("salarioLiquido");



        /*TextView tvNome = (TextView) findViewById(R.id.tvNome);
        tvNome.setText("Nome: "+ nome);

        TextView tvSalarioBruto = (TextView) findViewById(R.id.tvSalBruto);
        tvSalarioBruto.setText("Salário Bruto: "+ salBruto);

        TextView tvInss = (TextView) findViewById(R.id.tvInss);
        tvInss.setText("INSS: "+ inss);

        TextView tvSindicato = (TextView) findViewById(R.id.tvSindicato);
        tvSindicato.setText("Sindicato: "+ sindicato);

        TextView tvSalarioLiquido = (TextView) findViewById(R.id.tvSalLiquido);
        tvSalarioLiquido.setText("Salário Liquido: "+ salLiquido);*/

    }
}
