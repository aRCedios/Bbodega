package com.arcedios.bbodega.Aqui.View;

import android.os.Bundle;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import com.arcedios.bbodega.databinding.ActivityDeleteBinding;
import com.arcedios.bbodega.Aqui.Model.TodoFirebase;

public class Delete extends AppCompatActivity {
    private ActivityDeleteBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDeleteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.borrar.setOnClickListener(view -> {
            String codigo = binding.codigoBorrar.getText().toString();
            boolean a = TodoFirebase.removeItem(codigo);
            if (a) {
                Toast.makeText(this, "Producto borrado", Toast.LENGTH_SHORT).show();
            }

        });


    }
}