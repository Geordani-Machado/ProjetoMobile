package br.com.uniritter.app1_2023_1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DashBoard extends AppCompatActivity {

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        Button btn_sair = findViewById(R.id.btn_sair);
        Button Soma = findViewById(R.id.btn_soma);
        Button Azul = findViewById(R.id.btn_menos);

        TextView Resultado = findViewById(R.id.Resultado);

        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent);
            }
        });

        Soma.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                 Resultado.setText("Vermelho ❤️");
            }
        });

        Azul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Resultado.setText("Azul 💙");
            }
        });


    }
}
