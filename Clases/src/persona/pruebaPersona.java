package persona;

public class pruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Creacion de Clases y Objetos ***");

        System.out.println();

        var lv1 = new Persona("Paco", "Yunque");
        lv1.mostrarPersona();

        System.out.println();

        var lv2 = new Persona("Logan", "Lujan");
        lv2.mostrarPersona();
    }
}
