package com.arcedios.bbodega.Aqui.View;

import static java.security.AccessController.getContext;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.arcedios.bbodega.databinding.ActivityOpcionesBinding;


public class Opciones extends AppCompatActivity {
    private ActivityOpcionesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOpcionesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.c.setOnClickListener(view -> {
            Intent intent = new Intent(Opciones.this, Create.class);
            startActivity(intent);

        });
        binding.r.setOnClickListener(view -> {
            Intent intent = new Intent(Opciones.this, Delete.class);
            startActivity(intent);
        });
        binding.u.setOnClickListener(view -> {
            Intent intent = new Intent(Opciones.this, Update.class);
            startActivity(intent);
        });
        binding.d.setOnClickListener(view -> {
            Intent intent = new Intent(Opciones.this, Clear.class);
            startActivity(intent);
        });
        binding.salir.setOnClickListener(view -> {
            finishAffinity();
        });





    }
}