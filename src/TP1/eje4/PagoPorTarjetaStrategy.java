package TP1.eje4;

public class PagoPorTarjetaStrategy implements MetodoDePago{

    private String nombreTarjeta;
    private String numero;
    private String cvv;

    public PagoPorTarjetaStrategy(String nombreTarjeta, String numero, String cvv) {
        this.nombreTarjeta = nombreTarjeta;
        this.numero = numero;
        this.cvv = cvv;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public void pagar(double monto) {
        System.out.printf("se ha pagado con tarjeta de credito terminada en ***%s \n", getNumero().substring(getNumero().length()-4));
    }

}
