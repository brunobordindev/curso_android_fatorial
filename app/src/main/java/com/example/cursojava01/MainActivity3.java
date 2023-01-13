package com.example.cursojava01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText editNumFatorial;
    private Button btnFatorial;
    private TextView txtFormula, txtFatorial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editNumFatorial = findViewById(R.id.editTextFatorial);
        btnFatorial = findViewById(R.id.btnFatorial);
        txtFatorial = findViewById(R.id.textFatorial);
        txtFormula = findViewById(R.id.textFormula);

        btnFatorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = Integer.parseInt(String.valueOf(editNumFatorial.getText()));
                Fatorial f = new Fatorial();
                f.setValor(numero);
                txtFormula.setText(f.getFormula());
                txtFatorial.setText(Integer.toString(f.getFatorial()));
            }
        });



    }
}