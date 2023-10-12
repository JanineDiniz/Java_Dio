public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 17.0;
    
    if (valorSolicitado <= saldo) {
      saldo -= valorSolicitado;
      System.out.println("Saque realizado!");
    }else{
      System.out.println("Não foi possível realizar o saque. Saldo indisponível");
    }

    System.out.println("Saldo disponível: " + saldo);
  }
}
