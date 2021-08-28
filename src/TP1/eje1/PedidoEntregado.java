package TP1.eje1;

import java.util.Date;
import java.util.List;

public class PedidoEntregado extends EstadoPedido{

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
}
