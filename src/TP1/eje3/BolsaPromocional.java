package TP1.eje3;

import java.util.ArrayList;

public class BolsaPromocional extends Producto{
    private String descripcion;
    private float porcentajeDescuento;
    private ArrayList<CajaChocolate> cajaChocolates;

    public BolsaPromocional(String descripcion, float porcentajeDescuento) {
        this.descripcion = descripcion;
        this.porcentajeDescuento = porcentajeDescuento;
        setCajaChocolates(new ArrayList<>());
    }

    public double getPrecio(){
        return  getCajaChocolates().stream()
                .mapToDouble(CajaChocolate::getPrecio)
                .sum()*getPorcentajeDescuento();
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<CajaChocolate> getCajaChocolates() {
        return cajaChocolates;
    }

    public void setCajaChocolates(ArrayList<CajaChocolate> cajaChocolates) {
        this.cajaChocolates = cajaChocolates;
    }


}
