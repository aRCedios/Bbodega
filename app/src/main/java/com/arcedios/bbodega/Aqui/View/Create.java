package com.arcedios.bbodega.Aqui.View;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.arcedios.bbodega.Aqui.Model.TodoFirebase;
import com.arcedios.bbodega.Aqui.ModelView.productos;
import com.arcedios.bbodega.databinding.ActivityCreateBinding;


public class Create extends AppCompatActivity {
    private ActivityCreateBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.Enviar.setOnClickListener(view -> {
            String nombre = binding.Nproducto.getText().toString();
            int cantidad = Integer.parseInt(binding.Cantidad.getText().toString());
            String codigo = binding.codigo.getText().toString();
            productos producto = new productos(nombre, cantidad, codigo);
            boolean a = TodoFirebase.addUser(producto);
            if (a) {
                Toast.makeText(this, "Producto creado", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            }


        });


    }
}