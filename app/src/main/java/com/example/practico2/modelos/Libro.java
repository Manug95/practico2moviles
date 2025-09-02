package com.example.practico2.modelos;

import java.io.Serializable;
import java.util.ArrayList;

public class Libro implements Serializable {
    private String titulo;
    private String autor;
    private int anio;
    private int paginas;
    private ArrayList<String> generos;
    private String descripcion;
    private int imagen;

    public Libro(String titulo, String autor, int anio, int paginas, String descripcion, ArrayList<String> genero, int imagen) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.paginas = paginas;
        this.generos = genero;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public ArrayList<String> getGeneros() {
        return generos;
    }

    public String toString() {
        return titulo + " - " + autor + " (" + anio + ") - " + generos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setGeneros(ArrayList<String> generos) {
        this.generos = generos;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void addGenero(String genero) {
        generos.add(genero);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
