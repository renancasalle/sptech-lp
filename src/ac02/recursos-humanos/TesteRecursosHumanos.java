package school.sptech.ex1;

public class TesteRecursosHumanos {

  public static void main(String[] args) {

    Colaborador colaborador1 = new Colaborador();
    colaborador1.setNome("Pedro");
    colaborador1.setCargo("Gerente");
    colaborador1.setSalario(20000.00);
    System.out.println(String.format("Nome: %s | Cargo: %s | Salário: %.2f", colaborador1.getNome(), colaborador1.getCargo(), colaborador1.getSalario()));

    RecursosHumanos recHumanos = new RecursosHumanos();

    recHumanos.promover(colaborador1, "Dono", 21000.00);

    recHumanos.reajustarSalario(colaborador1, 2000.00);
    System.out.println(String.format("Nome: %s | Cargo: %s | Salário: %.2f", colaborador1.getNome(), colaborador1.getCargo(), colaborador1.getSalario()));
  }
}
