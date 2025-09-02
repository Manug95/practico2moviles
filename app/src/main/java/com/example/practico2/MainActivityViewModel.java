package com.example.practico2;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.practico2.modelos.Libro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    private List<Libro> libros;
    private MutableLiveData<Libro> mutableLibro;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        libros = new ArrayList<>();

        libros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", 1943, 96, "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Infantil")), R.drawable.principito));
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, 1000, "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.quijote));
        libros.add(new Libro("1984", "George Orwell", 1949, 328, "Una obra maestra", new ArrayList<>(Arrays.asList("Ciencia Ficción", "Distopía")), R.drawable.l1984));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, 417, "Una obra maestra", new ArrayList<>(Arrays.asList("Realismo Mágico", "Novela")), R.drawable.cienanios));
        libros.add(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997, 223, "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.potter));
        libros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954, 1178, "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.anillos));
        libros.add(new Libro("El gran Gatsby", "F. Scott Fitzgerald", 1925, 180, "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.gatsby));
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen", 1813, 374, "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.orgullo));
        libros.add(new Libro("Matar a un ruiseñor", "Harper Lee", 1960, 279, "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.ruisenior));
        libros.add(new Libro("Crimen y castigo", "Fyodor Dostoevsky", 1866, 112, "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.crimen));
        libros.add(new Libro("Los juegos del hambre", "Suzanne Collins", 2008, 309, "Una obra maestra", new ArrayList<>(Arrays.asList("Ciencia Ficción", "Distopía")), R.drawable.hambre));
        libros.add(new Libro("El alquimista", "Paulo Coelho", 1988, 209, "Una obra maestra", new ArrayList<>(Arrays.asList("Novela", "Clásica")), R.drawable.alquimista));
        libros.add(new Libro("El nombre del viento", "Patrick Rothfuss", 2007, 662, "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.viento));
        libros.add(new Libro("El hobbit", "J.R.R. Tolkien", 1937, 310, "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.hobbit));
        libros.add(new Libro("El código Da Vinci", "Dan Brown", 2003, 454, "Una obra maestra", new ArrayList<>(Arrays.asList("Misterio", "Thriller")), R.drawable.davinci));
        libros.add(new Libro("La llamada de Cthulhu", "H. P. Lovecraft", 1898, 420, "Una obra maestra", new ArrayList<>(Arrays.asList("Fantasía", "Aventura")), R.drawable.cthulhu));
    }

    public LiveData<Libro> getMutableTitulo() {
        if (mutableLibro == null) {
            mutableLibro = new MutableLiveData<>();
        }
        return mutableLibro;
    }

    public void buscarLibro(String titulo) {
        if (titulo != null) {
            //metodo para buscar el libro
            for (Libro libro : libros) {
                if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                    mutableLibro.setValue(libro);
                    return;
                }

            }
            mutableLibro.setValue(null);
        }
    }

}
