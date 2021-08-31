package TP1.eje1;


public abstract class EstadoPedido {
    private Pedido pedido;

    public EstadoPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract void agregarArticulo(Articulo articulo);

    public abstract void agregarRemito(Remito remito);


    public abstract void cerrarPedido() throws Exception;

    public abstract void entregarPedido() throws Exception;

    public abstract void reAbrirPedido() throws Exception;
}
