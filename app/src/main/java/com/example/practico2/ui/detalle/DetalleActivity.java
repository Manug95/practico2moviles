package com.example.practico2.ui.detalle;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practico2.databinding.ActivityDetalleBinding;

public class DetalleActivity extends AppCompatActivity {
    private ActivityDetalleBinding binding;
    private DetalleViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityDetalleBinding.inflate(getLayoutInflater());
        viewModel = new DetalleViewModel(getApplication());

        setContentView(binding.getRoot());

        viewModel.getMutableLibro().observe(this, libro -> {
            binding.tvTituloLibro.setText(libro.getTitulo());
            binding.tvAutor.setText(libro.getAutor());
            binding.tvAnio.setText(String.valueOf(libro.getAnio()));
            binding.tvPaginas.setText(String.valueOf(libro.getPaginas()));
            binding.tvGeneros.setText(String.join(", ", libro.getGeneros()));
            binding.tvDescripcion.setText(libro.getDescripcion());
            binding.imageView2.setImageResource(libro.getImagen());
        });

        binding.btnVolver.setOnClickListener(view -> {
            finish();
        });

        viewModel.obtenerLibroDelIntent(getIntent());

    }
}