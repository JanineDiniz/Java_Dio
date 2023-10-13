public class ExemploFor {
  public static void main(String[] args) {
    for (int carneirinhos = 1; carneirinhos <= 5; carneirinhos++) {
      System.out.println("Contando carneirinhos: " + carneirinhos);
    }

    //For Array
    String alunos [] = {"Felipe", "Jonas", "Maria", "Gabriel"};

    for (int i = 0; i < alunos.length; i++) {
      System.out.println("O aluno no indice " + i + " é " + alunos[i]);
    }

    //Forma abreviada
    for(String aluno : alunos){
      System.out.println("Nome do aluno é " + aluno);
    }

    //Break/ continue
    for (int numero = 1; numero <= 5; numero++) {
      if(numero == 3)
          continue; //ou break
          System.out.println(numero);
    }
  }
}
