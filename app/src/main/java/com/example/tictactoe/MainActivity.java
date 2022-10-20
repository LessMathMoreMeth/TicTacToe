package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    boolean singleUser = false;
    Button btnLocal;
    Button btnMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLocal = findViewById(R.id.btnLocal);
        btnMulti = findViewById(R.id.btnMulti);

        btnLocal.setOnClickListener(v -> {
            singleUser = true;
            startActivity(new Intent(getApplicationContext(), GameActivity.class));
        });

        btnMulti.setOnClickListener(v -> {
            singleUser = false;
            startActivity(new Intent(getApplicationContext(), GameActivity.class));
        });
    }
}