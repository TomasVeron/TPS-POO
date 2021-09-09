package TP1.eje4;

public class Tarjeta {

    static public void cobrar(String nombre,String numero, String cvv, double importe){
        System.out.printf("se ha pagado con tarjeta de credito terminada en ***%s \n", numero.substring(numero.length()-4));
    }
}
