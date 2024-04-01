package school.sptech.ex4;

public class Ex4DescontoProgressivoMetodos {


    static Double calcularDesconto(Double valor, Integer quantidade) {

        Double valorComDesconto;


        if (quantidade == 1) {
            valorComDesconto = valor - (valor * 0.1);
        } else if (quantidade == 2) {
            valorComDesconto = valor - (valor * 0.2);
        } else {
            valorComDesconto = valor - (valor * 0.3) - 0.0001;
        }
        return valorComDesconto;


    }

    void exibirNotaFiscal(Integer valor, Integer quantidade, Integer valorComDesconto) {
        // Coloque os métodos aqui
    }
}