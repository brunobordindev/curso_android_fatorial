package com.example.cursojava01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Button btnCancelar, btnOk;
    private EditText editNumero;
    private TextView txtQtd, txtSoma, txtPares, txtImpares, txtAcima, txtMedia;
    private int soma = 0, quantidade, par, impar, acimaCem;
    private double media;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        editNumero = findViewById(R.id.editNumero);
        btnOk = findViewById(R.id.btnOk);
        btnCancelar = findViewById(R.id.btnCancelar);
        txtSoma = findViewById(R.id.txtSoma);
        txtQtd = findViewById(R.id.txtQtd);
        txtPares = findViewById(R.id.txtPares);
        txtImpares = findViewById(R.id.txtImpares);
        txtAcima = findViewById(R.id.txtAcima);
        txtMedia = findViewById(R.id.txtMedia);
        linearLayout = findViewById(R.id.linearL);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n = Integer.parseInt(String.valueOf(editNumero.getText()));

                soma += n;
                ++quantidade;

                if (n % 2 == 0){
                    ++par;
                }

                if (n % 2 == 1) {
                    ++impar;
                }

                if(n > 100){
                    ++acimaCem;
                }

                editNumero.setText("");
                if (n == 0){
                    media = soma / (quantidade - 1);

                    linearLayout.setVisibility(View.VISIBLE);
                    txtSoma.setText("Total da Soma: " + soma);
                    txtQtd.setText("Total de Valores: "+ (quantidade - 1) );
                    txtPares.setText("Total de Pares: " + (par - 1));
                    txtImpares.setText("Total de Ímpares: " + impar);
                    txtAcima.setText("Acima de 100: " + acimaCem);
                    txtMedia.setText("Média dos valores: " + Math.round(media));
                }
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soma = 0;
                quantidade = 0;
                par = 0;
                impar = 0;
                acimaCem = 0;
                media = 0;
                linearLayout.setVisibility(View.GONE);
            }
        });

    }

}