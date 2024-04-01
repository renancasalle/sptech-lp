package school.sptech.ex1;

public class RecursosHumanos {

    private Integer totalPromovidos = 0;
    private Integer totalReajustados = 0;

    // Getters
    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalReajustados() {
        return totalReajustados;
    }

    public void reajustarSalario(Colaborador colaborador, Double porcentagemReajuste) {
        if (porcentagemReajuste <= 0) {
            System.out.println("Erro na operação: A porcentagem de reajuste deve ser maior que 0.");
            return;
        }

        Double novoSalario = colaborador.getSalario() * (1 + porcentagemReajuste / 100);
        colaborador.setSalario(novoSalario);
        totalReajustados++;
    }


    public void promover(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (novoSalario >= colaborador.getSalario()) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalPromovidos++;
        } else {
            System.out.println("Operação não realizada: O novo salário deve ser maior que o atual.");
        }
    }
}
