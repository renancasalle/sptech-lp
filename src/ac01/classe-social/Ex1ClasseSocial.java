package school.sptech.ex1;

import java.util.Scanner;

public class Ex1ClasseSocial {

    public static void main(String[] args) {

        Ex1ClasseSocialMetodos ex1ClasseSocialMetodos = new Ex1ClasseSocialMetodos();

        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua renda:");

        Double renda = in.nextDouble();

        Double manoel = ex1ClasseSocialMetodos.calcularQtdSalariosMinimos(renda);
        String manoela = ex1ClasseSocialMetodos.classeSocial(manoel);

        System.out.println(String.format("""
                Você recebe aproximadamente %.1f salários-mínimos. 
                Você pertence a classe social: %s.
                
                """, manoel, manoela));
    }
}


