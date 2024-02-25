package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {

        Integer numero = 23;
        Integer pares = 0;
        Integer impares = 0;

        for (int i = 0; i <= 199; i++){
            Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(100);

            System.out.println(numeroAleatorio);

            if (i % 2 == 0){
                pares++;
                System.out.println("Esses são os pares: " + pares);
            }else{
                impares++;
                System.out.println("Esses são os pares: " + impares);
            }
        }
    }
}
