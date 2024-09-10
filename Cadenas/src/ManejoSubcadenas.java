public class ManejoSubcadenas {
    public static void main(String[] args) {
        //Tema de subcadenas
        var cadenaPrime = "Hola mundo";
        System.out.println("cadenaPrime = " + cadenaPrime);

        //Primera cadena
        var cadena1 = cadenaPrime.substring(0,4);
        System.out.println("cadena1 = " + cadena1);
        //Segunda cadena
        var cadena2 = cadenaPrime.substring(5);
        System.out.println("cadena2 = " + cadena2);
        //Otra manera de obtener la ultima cadena
        var cadena3 = cadenaPrime.substring(5,10);
        System.out.println("cadena3 = " + cadena3);

    }
}
