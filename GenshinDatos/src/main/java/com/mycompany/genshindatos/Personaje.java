/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genshindatos;

/**
 *
 * @author Damian
 */
public class Personaje {
    private String nombre;
    private String imagen;
    private int rareza;
    private int elemento;
    private int arma;

    public Personaje() {
    }

    public Personaje(String nombre, String imagen, int rareza, int elemento, int arma) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.rareza = rareza;
        this.elemento = elemento;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        this.rareza = rareza;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public int getArma() {
        return arma;
    }

    public void setArma(int arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", imagen=" + imagen + ", rareza=" + rareza + ", elemento=" + elemento + ", arma=" + arma + '}';
    }
    
    
}
