public class TorresDeHanoi {

    // Método recursivo que resuelve el problema de las Torres de Hanói
    // @param n: el número de discos a mover
    // @param origen: la torre desde la cual mover los discos
    // @param destino: la torre hacia la cual mover los discos
    // @param auxiliar: la torre auxiliar que se utilizará en el proceso
    public static void moverTorresDeHanoi(int n, char origen, char destino, char auxiliar) {
        // Caso base: si solo hay un disco, se mueve directamente al destino
        if (n == 1) {
            System.out.println("Mover disco 1 de la torre " + origen + " a la torre " + destino);
            return;
        }

        // Paso 1: Mover los n-1 discos de la torre origen a la torre auxiliar
        moverTorresDeHanoi(n - 1, origen, auxiliar, destino);

        // Paso 2: Mover el disco n (el más grande) directamente a la torre destino
        System.out.println("Mover disco " + n + " de la torre " + origen + " a la torre " + destino);

        // Paso 3: Mover los n-1 discos de la torre auxiliar a la torre destino
        moverTorresDeHanoi(n - 1, auxiliar, destino, origen);
    }

    public static void main(String[] args) {
        int numDiscos = 3;  // Puedes cambiar este valor para probar con diferentes cantidades de discos

        // Llamar al método recursivo para resolver el problema
        System.out.println("Solución para " + numDiscos + " discos:");
        moverTorresDeHanoi(numDiscos, 'A', 'C', 'B');
    }
}
