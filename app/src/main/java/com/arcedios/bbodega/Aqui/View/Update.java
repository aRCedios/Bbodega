package com.arcedios.bbodega.Aqui.View;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.arcedios.bbodega.Aqui.Model.TodoFirebase;
import com.arcedios.bbodega.databinding.ActivityUpdateBinding;


public class Update extends AppCompatActivity {
    private ActivityUpdateBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUpdateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.actualizar.setOnClickListener(view -> {
            String codigo = binding.codigoActualizar.getText().toString();
            String nombre = binding.nombreActualizar.getText().toString();
            int cantidad = Integer.parseInt(binding.cantidadActualizar.getText().toString());
            boolean a = TodoFirebase.updateItem(codigo,nombre,cantidad);
            if (a) {
                Toast.makeText(this, "Producto creado", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            }
        });

    }
}