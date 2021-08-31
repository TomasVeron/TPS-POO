package TP1.eje1;


public class PedidoEntregado extends EstadoPedido {

    public PedidoEntregado(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void agregarArticulo(Articulo articulo) {
        System.out.println("el pedido fue entregado no se le pueden agregar articulos");
    }

    @Override
    public void agregarRemito(Remito remito) {
        System.out.println("el pedido fue entregado no se le pueden agregar remitos");
    }

    @Override
    public void cerrarPedido() throws Exception {
        throw new Exception("El pedido ya fue entregado, no se puede cerrar.");
    }

    @Override
    public void entregarPedido() throws Exception {
        throw new Exception("El pedido ya fue entregado");

    }

    @Override
    public void reAbrirPedido() throws Exception {
        throw new Exception("El pedido ya fue entregado, no se puede reabrir.");
    }
}
