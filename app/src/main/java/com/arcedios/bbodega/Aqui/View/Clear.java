package com.arcedios.bbodega.Aqui.View;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.arcedios.bbodega.Aqui.Model.TodoFirebase;
import com.arcedios.bbodega.databinding.ActivityClearBinding;

public class Clear extends AppCompatActivity {
    private ActivityClearBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityClearBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.borrarTodo.setOnClickListener(view -> {
            boolean a = TodoFirebase.remove();
            if (a) {
                Toast.makeText(this, "Producto creado", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
