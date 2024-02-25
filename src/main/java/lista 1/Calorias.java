public class Calorias {
    public static void main(String[] args) {

        String nome = "Julius";

        Integer aquecimento = 20;
        Integer aerobico = 15;
        Integer musculacao = 120;

        Integer totalAquecimento = aquecimento * 12;
        Integer totalAerobico = aerobico * 20;
        Integer totalMusculacao = musculacao * 25;

        Integer totalcalorias = totalAerobico + totalAquecimento + totalMusculacao;
        Integer tempoTotal = aquecimento + aerobico + musculacao;

        System.out.println("Olá, " + nome + ". Você fez um total de  " + tempoTotal + " minutos de exercícios e perdeu cerca de " + totalcalorias + " calorias.");





    }
}
