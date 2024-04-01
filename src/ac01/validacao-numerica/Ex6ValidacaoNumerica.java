package school.sptech.ex6;

import java.util.Scanner;

public class Ex6ValidacaoNumerica {

  public static void main(String[] args) {

    Ex6ValidacaoNumericaMetodos ex6ValidacaoNumerica = new Ex6ValidacaoNumericaMetodos();

    Scanner in = new Scanner(System.in);
    System.out.println("Digite um número: ");

    Integer numero = in.nextInt();

    ex6ValidacaoNumerica.verificarPrimo(numero);
  }
}

