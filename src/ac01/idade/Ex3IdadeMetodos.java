package school.sptech.ex3;

public class Ex3IdadeMetodos {


    void classificaIdade(Integer idade){

        String classificacao;

        if (idade <= 2){
            classificacao ="Bebê";
        } else if (idade <= 11){
            classificacao ="Criança";
        } else if (idade <= 19){
            classificacao ="Adolescente";
        } else if (idade <= 30){
            classificacao ="Jovem";
        } else if (idade <= 60) {
            classificacao ="Adulto";
        } else{
            classificacao = "Idoso";
        }
        System.out.println(classificacao);
    }

}
