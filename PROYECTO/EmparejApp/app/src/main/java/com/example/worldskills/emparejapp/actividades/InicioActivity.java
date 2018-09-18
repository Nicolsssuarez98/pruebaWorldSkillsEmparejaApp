package com.example.worldskills.emparejapp.actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.worldskills.emparejapp.R;
import com.example.worldskills.emparejapp.entidades.User;

public class InicioActivity extends AppCompatActivity {


    EditText player1, player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
    }

    public void onClick(View view) {
        if (player1.getText().toString().equals("") || player2.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "llener todos los campos", Toast.LENGTH_SHORT).show();
        } else {
            User.player1 = player1.getText().toString();
            User.player2 = player2.getText().toString();
            Intent miIntent = new Intent(InicioActivity.this, MainActivity.class);
            startActivity(miIntent);
            finish();

        }
    }
}
