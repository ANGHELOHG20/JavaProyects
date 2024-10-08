package animales;

public class Animal {

        public void comer(){
            System.out.println("Como muchas veces al día");
        }
        public void dormir(){
            System.out.println("Duermo muchas horas");
        }
    }

    class Perrro extends Animal {
        public void hacerSonido(){
            System.out.println("Puedo ladrar");
        }
    }

