public class ManejoSubcadenas {
    public static void main(String[] args) {
        //Tema de subcadenas
        var cadenaPrime = "Hola mundo";
        System.out.println("cadenaPrime = " + cadenaPrime);

        //Primera cadena
        var cadena1 = cadenaPrime.substring(0,4);
        System.out.println("cadena1 = " + cadena1);
        //Segunda cadena
        var caden2 = cadenaPrime.substring(5);
        System.out.println("caden2 = " + caden2);

    }
}
