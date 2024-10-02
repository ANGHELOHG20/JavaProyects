public class Aritmetica {

    int operando1, operando2;

    // Constructor vacío
    public Aritmetica(){
    }

    // Constructor lleno
    public Aritmetica(int a1, int b2){
        operando1 = a1;
        operando2 = b2;
    }

    void Sumar() {
        var resultado = operando1 + operando2;
        System.out.println("Resultado de la suma = " + resultado);
    }

    void Restar() {
        var resultado = operando1 - operando2;
        System.out.println("Resultado de la resta = " + resultado);

    }

    public static void main(String[] args) {
        System.out.println(" *** Clase Aritmetica ***");

        var lv1 = new Aritmetica(5,7);
        lv1.Sumar();
        lv1.Restar();

        System.out.println();

        var lv2 = new Aritmetica(12,16);
        lv2.Sumar();
        lv2.Restar();

        System.out.println();

        var lv3 = new Aritmetica();
        lv3.operando1= 10;
        lv3.operando2= 15;
        lv3.Sumar();
        lv3.Restar();
    }
}
