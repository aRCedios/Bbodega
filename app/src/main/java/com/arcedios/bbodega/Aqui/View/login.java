package com.arcedios.bbodega.Aqui.View;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.arcedios.bbodega.databinding.ActivityLoginBinding;
import com.arcedios.bbodega.Aqui.ModelView.Administrativo;

public class login extends AppCompatActivity {
    private ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.iniciarsesion.setOnClickListener(view -> {
            String nombre = binding.nombre.getText().toString();
            String cedula = binding.cedula.getText().toString();
            Administrativo administrativo = new Administrativo(nombre, cedula);
            binding.nombre.setText(administrativo.getNombre());
            binding.cedula.setText(administrativo.getCedula());
            Intent intent = new Intent(login.this, Opciones.class);
            // You can pass data to the new Activity using intent.putExtra() if needed
            intent.putExtra("nombre", nombre);
            intent.putExtra("cedula", cedula);
            startActivity(intent);

        });

    }
}