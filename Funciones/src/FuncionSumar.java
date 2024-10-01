public class FuncionSumar {

    static int sumar(int a, int b){
        return a+b;
    }


    public static void main(String[] args) {
    int a= 3, b= 4;
    int resultado1  = sumar(a,b);
        System.out.println("La suma es " + resultado1);

        int resultado2 = sumar(40, 80);
        System.out.println("La suma es " + resultado2);
    }
}
