package br.com.uniritter.app1_2023_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button btn2_1 = findViewById(R.id.button2_1);
        Button Logar = findViewById(R.id.btn_logar);

        EditText Nome = findViewById(R.id.login_name);
        EditText Senha = findViewById(R.id.senha);
        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Logar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                if(Nome.getText().toString().equalsIgnoreCase("Admin") && Senha.getText().toString().equalsIgnoreCase("Admin")){

                    Context context = getApplicationContext();
                    CharSequence text = "Logado com sucesso";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Intent intent = new Intent(getApplicationContext(), DashBoard.class);
                    startActivity(intent);
                }else {

                    Context context = getApplicationContext();
                    CharSequence text = "Nome ou senha estão errados";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
            }
        });

    }
}