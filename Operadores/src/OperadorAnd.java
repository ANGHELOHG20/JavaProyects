public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador And ***");
            //And Devuelve true si ambos valores son true
            boolean a= true, b = false;
            var resultado = a && b;
            System.out.println("resultado a= true, b = false= " + resultado);

            boolean c= false, d = true;
            resultado = c && d;
            System.out.println("resultado c= false, d = true= " + resultado);

            boolean e= true, f = true;
            resultado = e && f;
            System.out.println("resultado e= true, f = true= " + resultado);

            boolean g= false, h = false;
            resultado = g && h;
            System.out.println("resultado g= false, h = false= " + resultado);
        }
        }
