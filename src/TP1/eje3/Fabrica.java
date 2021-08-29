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
        CajaChocolate p1 = new CajaChocolate(150.0);
        CajaChocolate p2 = new CajaChocolate(10.0);
        CajaChocolate p3 = new CajaChocolate(120.0);

        BolsaPromocional bp = new BolsaPromocional("10 cajas de chocolates negros");
        bp.getCajaChocolates().add(p1);
        bp.getCajaChocolates().add(p2);
        bp.getCajaChocolates().add(p3);

        System.out.println(bp.getPrecio());
    }

}
