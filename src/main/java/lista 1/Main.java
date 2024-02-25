package school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer qtdFilhos0 = 1;
        Integer qtdFilhos4 = 1;
        Integer qtdFilhos16 = 1;

        Double valorFilhos0 = qtdFilhos0 * 25.12;
        Double valorFilhos4 = qtdFilhos4 * 15.88;
        Double valorFilhos16 = qtdFilhos16 * 12.44;

        Double valorTotal = valorFilhos0 + valorFilhos4 + valorFilhos16;

        Integer qtdTotal = qtdFilhos0 + qtdFilhos4 + qtdFilhos16;

        System.out.println("Você tem um total de " + qtdTotal + " filhos e vai receber R$" + valorTotal + " de bolsa");
    }

}