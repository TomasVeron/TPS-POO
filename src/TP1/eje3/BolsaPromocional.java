package TP1.eje3;

import java.util.ArrayList;

public class BolsaPromocional extends Producto{
    private String descripcion;
    private ArrayList<CajaChocolate> cajaChocolates;

    public BolsaPromocional(String descripcion) {
        setCajaChocolates(new ArrayList<>());
        setDescripcion(descripcion);
    }

    public double getPrecio(){
        return  getCajaChocolates().stream()
                .mapToDouble(CajaChocolate::getPrecio)
                .sum();
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
