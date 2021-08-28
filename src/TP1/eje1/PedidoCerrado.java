package TP1.eje1;

import java.util.Date;
import java.util.List;

public class PedidoCerrado extends EstadoPedido{

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

    public void reabrirPedido(){
        getPedido().setEstado(new PedidoAbierto(getPedido()));
    }

}
