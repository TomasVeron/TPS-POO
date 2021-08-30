package TP1.eje4;

public class PagoPorBancoStrategy implements MetodoDePago{
    private String cbuOrigen;

    public PagoPorBancoStrategy(String cbuOrigen) {
        this.cbuOrigen = cbuOrigen;
    }

    public String getCbuOrigen() {
        return cbuOrigen;
    }

    public void setCbuOrigen(String cbuOrigen) {
        this.cbuOrigen = cbuOrigen;
    }


    @Override
    public void pagar(double monto) {
        System.out.printf("se ha pagado con transferencia Bancaria con cbu: %s \n", getCbuOrigen());
    }
}
