package school.sptech;

public class Potencia {
    public static void main(String[] args) {

        Integer base = 2;
        Integer exponente = 4;
        Integer potencia = base * base;
        Integer valorFinal = 1;

        for (int i = 0; i <= exponente; i++){

         valorFinal *= base;

            System.out.println(valorFinal);
        }
    }
}
