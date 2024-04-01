package school.sptech.ex4;

import java.util.Scanner;

public class Ex4DescontoProgressivo {

  public static void main(String[] args) {

    Ex4DescontoProgressivoMetodos ex4DescontoProgressivoMetodos = new Ex4DescontoProgressivoMetodos();

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o valor unitário do produto: ");
    Double valorUnitario = leitor.nextDouble();


    System.out.println("Digite a quantidade:");
    Integer quantidadeProduto = leitor.nextInt();

    Double valorComDesconto = Ex4DescontoProgressivoMetodos.calcularDesconto(valorUnitario, quantidadeProduto);

    System.out.println("------------------------------\n" +
            "Valor do produto: R$"+ valorUnitario+"\n" +
            "Quantidade: "+ quantidadeProduto+"\n" +
            "------------------------------\n" +
            "Valor com desconto: R$"+ (valorComDesconto));

  }
}
