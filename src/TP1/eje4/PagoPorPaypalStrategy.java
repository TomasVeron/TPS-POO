package TP1.eje4;

public class PagoPorPaypalStrategy implements MetodoDePago{

    private String usuario;

    public PagoPorPaypalStrategy(String usuario, double monto) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    @Override
    public void pagar(double monto) {
        System.out.printf("se ha pagado por metodo de paypa del usuario: %s \n", getUsuario());
    }
}
