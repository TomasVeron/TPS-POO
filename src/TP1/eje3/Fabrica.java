package TP1.eje3;

import java.util.ArrayList;

public class Fabrica {
    private String nombre;
    private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;

    public Fabrica(String nombre) {
        setNombre(nombre);
        setProductos(new ArrayList<>());
        setVentas(new ArrayList<>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }


    public static void main(String[] args) {

    }

}
