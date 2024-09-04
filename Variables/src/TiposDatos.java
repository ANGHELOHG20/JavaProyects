public class TiposDatos{
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros
        // Valor por default es 0

        byte tipoByte =127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort =32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoEntero= 2147483647;
        System.out.println("tipoEntero = " + tipoEntero);
        long tipoLong= 987654321098765422L;
        System.out.println("tipoLong = " + tipoLong);

        // Punto Flotante
        // Valor por default es 0.0
        float tipoFloat= 3.14F;
        System.out.println("tipoFloat = " + tipoFloat); //F o f tipo float
        double tipoDouble = 3.1315D; //Do d tipo double opcional
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter
        // Valor por default \u0000
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 66;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar ='@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano
        // Valor por default es false
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean= false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Objetct (Referencia)
        // Valor por default es null
        String nombre= "Anghelo";
        System.out.println("nombre = " + nombre);





    }
}
