package school.sptech.ex2;
import java.util.Scanner;
public class Ex2CalculoAluno {

  public static void main(String[] args) {

    Ex2CalculoAlunoMetodos ex2CalculoAlunoMetodos = new Ex2CalculoAlunoMetodos();

    Scanner in = new Scanner(System.in);
    System.out.println("Digite a nota 1: ");
    System.out.println("Digite a nota 2: ");

    Double nota1 = in.nextDouble();
    Double nota2 = in.nextDouble();

    Double notaFinal = ex2CalculoAlunoMetodos.calcularMedia(nota1, nota2);

    System.out.println("Média: " + notaFinal);
  }
}
