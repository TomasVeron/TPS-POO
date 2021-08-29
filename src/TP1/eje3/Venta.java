package TP1.eje3;

import TP1.eje1.Cliente;

public class Venta {
    private Cliente cliente;
    private Producto producto;

    public Venta(Cliente cliente, Producto producto) {
        this.cliente = cliente;
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
