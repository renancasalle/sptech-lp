package school.sptech;

public class ContadorVariado {
    public static void main(String[] args) {

        Double numero = 0.15;


        for (int i = 0; i < 32; i++){

            Double result = numero += 0.15;

            System.out.println(result);
        }
    }
}
