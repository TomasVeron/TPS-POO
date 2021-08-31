package TP1.eje1;

import java.util.List;

public class PedidoAbierto extends EstadoPedido {

    public PedidoAbierto(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void agregarArticulo(Articulo articulo) {
        List<Articulo> articulos = getPedido().getArticulos();
        articulos.add(articulo);
    }

    @Override
    public void agregarRemito(Remito remito) {
        System.out.println("el Pedido esta abierto no se pueden agregar remitos");
    }

    @Override
    public void cerrarPedido() {
        getPedido().setEstado(new PedidoCerrado(getPedido()));
    }

    @Override
    public void entregarPedido() throws Exception {
        throw new Exception("El pedido no fue cerrado, no se puede entregar.");
    }

    @Override
    public void reAbrirPedido() throws Exception {
        throw new Exception("El pedido ya esta abierto.");
    }
}
