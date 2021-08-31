package TP1.eje1;

import java.util.List;

public class Remito {

    private List<Articulo> articulosPedido;

    public Remito(List<Articulo> articulosPedido) {
        this.articulosPedido = articulosPedido;
    }

    public List<Articulo> getArticulosPedido() {
        return articulosPedido;
    }

    public void setArticulosPedido(List<Articulo> articulosPedido) {
        this.articulosPedido = articulosPedido;
    }
}
