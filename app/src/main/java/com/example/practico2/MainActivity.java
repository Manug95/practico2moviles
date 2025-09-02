package com.example.practico2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practico2.databinding.ActivityMainBinding;
import com.example.practico2.ui.detalle.DetalleActivity;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        viewModel = new MainActivityViewModel(getApplication());

        setContentView(binding.getRoot());

        viewModel.getMutableTitulo().observe(this, libro -> {
            binding.tvMensaje.setText("");
            if (libro != null) {
                Intent intent = new Intent(this, DetalleActivity.class);
                intent.putExtra("libro", libro);
                startActivity(intent);
            } else {
                binding.tvMensaje.setText("No se encontró el libro");
            }
        });

        binding.btnBuscar.setOnClickListener(view -> {
            String titulo = binding.etBuscarLibro.getText().toString();
            viewModel.buscarLibro(titulo);
        });
    }
}