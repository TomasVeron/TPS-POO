package TP1.eje1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private EstadoPedido estado;
    private int numero;
    private Date fechaEntrega;
    private Cliente cliente;
    private List<Articulo> articulos;
    private List<Remito> remitos;

    public Pedido(int numero, Date fechaEntrega, Cliente cliente) {
        this.estado = new PedidoAbierto(this);
        this.numero = numero;
        this.fechaEntrega = fechaEntrega;
        this.cliente = cliente;
        setArticulos(new ArrayList<>());
        setRemitos(new ArrayList<>());
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public List<Remito> getRemitos() {
        return remitos;
    }

    public void setRemitos(List<Remito> remitos) {
        this.remitos = remitos;
    }

    public void agregarArticulo(Articulo articulo){
        getEstado().agregarArticulo(articulo);
    }

    public void agregarRemito(Remito remito){
        getEstado().agregarRemito(remito);
    }

    public static void main(String[] args) {
        Cliente c1 = new Cliente(41114, "Tomas" , new Date());

        Pedido p1 = new Pedido(123, new Date(), c1);
        p1.agregarArticulo(new Articulo(3, 100.3));
        p1.agregarArticulo(new Articulo(1, 145.3));
        p1.agregarArticulo(new Articulo(1, 123.3));
        p1.setEstado(new PedidoCerrado(p1));
        p1.agregarArticulo(new Articulo(1, 32.2));

        System.out.println(p1.getArticulos());

    }

}
