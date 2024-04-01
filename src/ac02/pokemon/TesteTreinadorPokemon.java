package school.sptech.ex2;

public class TesteTreinadorPokemon {
    public static void main(String[] args) {
        Pokemon poke01 = new Pokemon();
        poke01.setNome("Lucario");
        poke01.setTipo("luta");
        poke01.setForca(50.0);

        Pokemon poke02 = new Pokemon();
        poke02.setNome("Swablue");
        poke02.setTipo("vento");
        poke02.setForca(100.0);

        TreinadorPokemon trei01 = new TreinadorPokemon();
        trei01.setNome("Renan");
        trei01.setNivel(10.0);

        TreinadorPokemon trei02 = new TreinadorPokemon();
        trei02.setNome("Joao");
        trei02.setNivel(5.0);

        trei01.treinarPokemon(poke02);
        trei01.treinarPokemon(poke02);
        trei01.treinarPokemon(poke02);
        trei01.treinarPokemon(poke02);
        trei01.treinarPokemon(poke02);
        System.out.println(String.format("Pokemon: %s | Tipo: %s | Força %.0f", poke02.getNome(), poke02.getTipo(), poke02.getForca()));
        trei01.evoluirPokemon(poke02, "Buterfree");
        System.out.println(String.format("Pokemon: %s | Tipo: %s | Força %.0f", poke02.getNome(), poke02.getTipo(), poke02.getForca()));

        trei02.treinarPokemon(poke01);
        trei02.treinarPokemon(poke01);
        System.out.println(String.format("Pokemon: %s | Tipo: %s | Força %.0f", poke01.getNome(), poke01.getTipo(), poke01.getForca()));
        trei02.evoluirPokemon(poke01, "Venusaur");

        System.out.println(String.format("Nome do Treinador: %s | Nível: %d", trei01.getNome(), trei01.getNivel()));
        System.out.println(String.format("Nome do Treinador: %s | Nível: %d", trei02.getNome(), trei02.getNivel()));


    }
}
