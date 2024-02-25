package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {

        Integer soma = 0;

        for (int i = 0; i <= 10; i++){
            Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(10);
            soma += numeroAleatorio;
            System.out.println(numeroAleatorio);
            System.out.println(soma);

        }
    }
}
