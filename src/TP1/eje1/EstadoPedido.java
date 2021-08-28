package TP1.eje1;

import java.util.Date;
import java.util.List;

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

}
