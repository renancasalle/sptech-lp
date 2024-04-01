package school.sptech.ex1;

import java.util.Scanner;

public class Ex1ClasseSocialMetodos {

  Double calcularQtdSalariosMinimos (Double renda) {

    Double qtdSalarios = renda / 1045;

    return qtdSalarios;
  }

  String classeSocial (Double qtdSalarios){

    if (qtdSalarios <= 2){
      return "E";
    }else if (qtdSalarios <= 4){
      return "D";
    }else if (qtdSalarios <= 10){
      return "C";
    }else if (qtdSalarios <= 20){
      return "B";
    }else{
      return "A";
    }
  }
}
