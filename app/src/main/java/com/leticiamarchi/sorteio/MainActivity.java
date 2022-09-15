package com.leticiamarchi.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void selecionarBotao(View v){

            int valor1, valor2, n;

            EditText editAA = (EditText)findViewById(R.id.editA);
            EditText editDD = (EditText)findViewById(R.id.editDe);

            valor1 = Integer.parseInt(editAA.getText().toString());
            valor2 = Integer.parseInt(editDD.getText().toString());

            Random aleatorio = new Random();

            n = aleatorio.nextInt((valor1 - valor2) + 1) + valor2;




        TextView texto = findViewById(R.id.textResultado);
        texto.setText("O número sorteado é: " + n);
    }
}