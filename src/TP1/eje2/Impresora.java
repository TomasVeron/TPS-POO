package TP1.eje2;

import java.util.Objects;

public class Impresora {
    private String nombre;
    private  boolean activada;

    public Impresora(String nombre) {
        this.nombre = nombre;
        setActivada(false);
    }

    public Impresora() {
        setActivada(false);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    public void imprimir(String texto){
        System.out.println(texto);
    }

    @Override
    public boolean equals(Object obj) {
        Impresora impresora = (Impresora) obj;
        return Objects.equals(this.nombre, impresora.getNombre());
    }

    @Override
    public String toString() {
        return nombre;
    }
}
