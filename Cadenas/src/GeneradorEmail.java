public class GeneradorEmail {
    public static void main(String[] args) {

        System.out.println("*** GENERADOR DE EMAILS ***");

        //Nombre Completo del usuario
        var nombreCompleto = " Anghelo Huane Gutierrez";
        System.out.println("nombreCompleto = " + nombreCompleto);
        //Procesar o normalizar el nombre de usuario
        //Limpiar los espacios en blanco al incio y al final
        var nombreNormalizado = nombreCompleto.strip();
        //Reemplazar los espacio en blanco por punto
        nombreNormalizado =nombreNormalizado.replace(" ",".");
        //Convertir a minusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        //Datos de la empresa
        var nombreEmpresa= "Louis Vuitton";
        System.out.println("\nNombre empresa = " + nombreEmpresa);
        var extensionDominio= ".com.pe";
        System.out.println("Extensión del dominio: " + extensionDominio);

        //Quitamos espacios en blanco y convertimos a minúsculas
        var nombreEmpresaNormalizado =nombreEmpresa.strip().replace(" ","").toLowerCase();
        var dominioEmailNormalizado="@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        //Email
        var Email = nombreNormalizado+dominioEmailNormalizado;
        System.out.println("Email = " + Email);


    }
}
