package school.sptech.ex2;

public class TreinadorPokemon {

    private String nome;
    private Double nivel;

    public TreinadorPokemon() {
        this.nivel = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }

    public void treinarPokemon(Pokemon pokemon) {
        double forcaAtual = pokemon.getForca();
        pokemon.setForca(forcaAtual + (forcaAtual * 0.1));
        pokemon.setDoces(pokemon.getDoces() + 10);
        this.setNivel(this.getNivel() + 2.0);
        System.out.println("Treino Realizado!");
    }
    public void evoluirPokemon(Pokemon pokemon, String novaEvolucao) {
        if (pokemon.getDoces() >= 50) {
            pokemon.setNome(novaEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            this.setNivel(this.getNivel() + 10);
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", pokemon.getNome(), novaEvolucao));
        } else {
            System.out.println("Não foi possível realizar a operação. Doces insuficientes.");
        }
    }

}
