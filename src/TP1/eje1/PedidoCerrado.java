package TP1.eje1;

import java.util.List;

public class PedidoCerrado extends EstadoPedido {

    public PedidoCerrado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void agregarArticulo(Articulo articulo) {
        System.out.println("el pedido esta cerrado no se pueden agregar mas Articulos");
    }

    @Override
    public void agregarRemito(Remito remito) {
        List<Remito> remitos = getPedido().getRemitos();
        remitos.add(remito);
    }

    @Override
    public void cerrarPedido() throws Exception {
        throw new Exception("El pedido ya esta cerrado.");
    }

    @Override
    public void entregarPedido() {
        getPedido().setEstado(new PedidoEntregado(getPedido()));
    }

    @Override
    public void reAbrirPedido() {
        getPedido().setEstado(new PedidoAbierto(getPedido()));
    }


}
