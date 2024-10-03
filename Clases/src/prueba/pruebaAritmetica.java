package prueba;

import aritmetica.Aritmetica;

public class pruebaAritmetica {
    public static void main(String[] args) {
        System.out.println(" *** Clase aritmetica.Aritmetica ***");

        var lv1 = new Aritmetica(5,7);
        System.out.println("Atributo operando1: " + lv1.getOperando1());
        lv1.setOperando1(10);
        lv1.setOperando2(15);
        lv1.Sumar();
        lv1.Restar();

        System.out.println();

        var lv2 = new Aritmetica(12,16);
        lv2.Sumar();
        lv2.Restar();

        System.out.println();

        var lv3 = new Aritmetica();
        lv3.Sumar();
        lv3.Restar();
    }
}
