public class Troco {
    public static void main(String[] args) {

        Double valorProduto = 10.00;
        Integer qtdVendida = 5;
        Double valorPago = 60.00;

        Double valorFinal = valorPago - (valorProduto * qtdVendida);

        System.out.println("Seu troco será de R$" + valorFinal + ", onde " + valorFinal + " é o valor a ser devolvido ao cliente.");
    }
}
