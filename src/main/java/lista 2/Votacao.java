package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {

        Integer numero1 = 0;
        Integer numero2 = 0;
        Integer numero3 = 0;


        for(int i = 0; i <= 9; i++){
            Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(3);

            if(numeroAleatorio == 1){
                numero1++;
//                System.out.println(numero1);
            }else if(numeroAleatorio == 2){
                numero2++;
//                System.out.println(numero2);
            }else
                numero3++;
//                System.out.println(numero3);
        }
        System.out.println( "numeros 1 = " + numero1);
        System.out.println( "numeros 2 = " + numero2);
        System.out.println("numeros 3 = " + numero3);
    }
}
