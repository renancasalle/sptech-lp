import java.util.Scanner;

public class exemploScanner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Integer n1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        Integer n2= in.nextInt();

        Integer mult = n1 * n2;

        System.out.println(mult);
        
    }
}
