package TP1.eje1;

import java.util.Date;
import java.util.List;

public class PedidoAbierto extends EstadoPedido{

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
}
