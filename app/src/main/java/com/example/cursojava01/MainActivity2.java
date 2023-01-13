package com.example.cursojava01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button btnContar;
    private SeekBar inicio, fim, passo;
    private TextView txtInicio, txtFim, txtPasso, txtResultado;
    private String nI, nF, nP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnContar = findViewById(R.id.btnContar);
        inicio = findViewById(R.id.seekBarInicio);
        fim = findViewById(R.id.seekBarFim);
        passo = findViewById(R.id.seekBarPasso);
        txtInicio = findViewById(R.id.txtInicio);
        txtFim = findViewById(R.id.txtFim);
        txtPasso = findViewById(R.id.txtPasso);
        txtResultado = findViewById(R.id.txtResultado);

        metodoSeekBar();

    }

    public void metodoSeekBar(){

        inicio.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                nI = Integer.toString(i);
                txtInicio.setText(nI);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        fim.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                nF = Integer.toString(i);
                txtFim.setText(nF);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        passo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                nP = Integer.toString(i);
                txtPasso.setText(nP);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        btnContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = Integer.parseInt(nI);
                int f = Integer.parseInt(nF);
                int p = Integer.parseInt(nP);

                String cont = " ";
                if (i < f){
                    for (int x = i; x <=f; x+=p){
                        cont += x + " ";
                    }
                }else{
                    for (int x = i; x >=f; x-=p){
                        cont += x + " ";
                    }
                }


                txtResultado.setText(cont);
                txtResultado.setVisibility(View.VISIBLE);
            }
        });
    }
}