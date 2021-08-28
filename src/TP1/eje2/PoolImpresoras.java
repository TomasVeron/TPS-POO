package TP1.eje2;

import java.util.ArrayList;
import java.util.Objects;

public class PoolImpresoras {

    private ArrayList<Impresora> impresoras;
    private ArrayList<Impresora> impresorasActivas;
    private static PoolImpresoras poolImpresoras = null;

    private PoolImpresoras() {
        setImpresoras(new ArrayList<>());
        setImpresorasActivas(new ArrayList<>());
    }

    public ArrayList<Impresora> getImpresorasActivas() {
        return impresorasActivas;
    }

    public void setImpresorasActivas(ArrayList<Impresora> impresorasActivas) {
        this.impresorasActivas = impresorasActivas;
    }

    public ArrayList<Impresora> getImpresoras() {
        return impresoras;
    }

    public void setImpresoras(ArrayList<Impresora> impresoras) {
        this.impresoras = impresoras;
    }

    public void  addImpresora(Impresora impresora){
        getImpresoras().add(impresora);
    }

    public void  removeImpresora(Impresora impresora){
        getImpresorasActivas().remove(impresora);
    }

    public static PoolImpresoras getInstance(){
        if (poolImpresoras == null){
            poolImpresoras = new PoolImpresoras();
        }
        return poolImpresoras;
    }

    public Impresora getImpresora(String nombre){
        Impresora impresora = new Impresora();
        for (Impresora i:getImpresoras()) {
            if (Objects.equals(i.getNombre(), nombre) && !i.isActivada()) {
                impresora = i;
                getImpresorasActivas().add(impresora);
                break;
            }
        }
        return impresora;
    }

    public void liberarImpresora(Impresora impresora){
        try{
            getImpresorasActivas().remove(impresora);
        }
        catch (Exception e){
            System.out.println("No se encuentra la impresora");
        }

    }

    public static void main(String[] args) {
        PoolImpresoras pool1 = PoolImpresoras.getInstance();
        Impresora imp1 = new Impresora("imp1");
        Impresora imp2 = new Impresora("imp2");
        Impresora imp3 = new Impresora("imp3");
        pool1.addImpresora(imp1);
        pool1.addImpresora(imp2);
        pool1.addImpresora(imp3);

        System.out.println(pool1.getImpresoras());
        pool1.getImpresora("imp1");
        System.out.println(pool1.getImpresorasActivas());
        pool1.liberarImpresora(imp3);
        System.out.println(pool1.getImpresorasActivas());
    }
}
