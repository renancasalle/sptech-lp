package school.sptech;
import java.util.concurrent.ThreadLocalRandom;

public class Loteira {
    public static void main(String[] args) {

        Integer numero = 5;
        Integer tentativas = 0;
        Integer numeroAleatorio;
        Boolean acerto = false;


        do {
            numeroAleatorio = ThreadLocalRandom.current().nextInt(10);
            tentativas++; System.out.println(numeroAleatorio);
            if (numeroAleatorio.equals(numero)) {
                acerto = true;
            }
        } while (!acerto);


        if (tentativas <= 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (tentativas <= 10) {
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }


}
