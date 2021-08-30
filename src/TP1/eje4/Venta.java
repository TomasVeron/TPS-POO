package TP1.eje4;

public class Venta {

    private MetodoDePago metodoDePago;
    private double monto;
    private String productos;

    public Venta(MetodoDePago metodoDePago, double monto, String productos) {
        this.metodoDePago = metodoDePago;
        this.monto = monto;
        this.productos = productos;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public void pagar(){
        getMetodoDePago().pagar(getMonto());
    }

    public static void main(String[] args) {
        MetodoDePago pago = new PagoPorBancoStrategy("0000000747343");
        MetodoDePago pago1= new PagoPorTarjetaStrategy("Visa", "525855579766243", "049");
        Venta venta1 = new Venta(pago, 500 , "3 coca colas");
        Venta venta2 = new Venta(pago1, 500 , "3 coca colas");

        venta1.pagar();
        venta2.pagar();


    }
}
