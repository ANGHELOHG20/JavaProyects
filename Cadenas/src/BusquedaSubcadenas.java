public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //Buscar subcadenas
        //indexOf - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1= "Hola Mundo Mundo";
        //sucadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        //lastIndexOff - Devuelve el indice de la ultima aparicion de la subcadena
        //subcadena de Mundo
        var indice2= cadena1.lastIndexOf("Mundo");
        //subcadena no encontrada devuelve -1
        System.out.println("indice2 = " + indice2);
        var indice3= cadena1.lastIndexOf("Java");
        System.out.println("indice3 = " + indice3);

    }
}
