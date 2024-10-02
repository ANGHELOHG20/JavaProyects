public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clases y Objetos ***");

        System.out.println();

        var lv1 = new Persona();
        lv1.nombre="Anghelo";
        lv1.apellido="Huane";
        lv1.mostrarPersona();

        System.out.println();

        var lv2 = new Persona();
        lv2.nombre= "Logal";
        lv2.apellido= "Paul";
        lv2.mostrarPersona();
    }
}

