import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        //atribuição
        String nome = "Janine";
        int idade = 18;
        double peso = 40;
        char sexo = 'F';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        //aritmético -> operações matemáticas

        //Unários -> +, -, ++, --, !
        int num = 5;
        System.out.println(- num);

        num++; //adiciona mais 1
        num += num; // adiciona a ele mesmo seu valor anterior
        System.out.println(num);

        boolean variavel = true;
        System.out.println(!variavel);

        //Ternária -> expresão booleana ? "se true" : "senão"
        int a = 5;
        int b = 6;

        String resultado = a != b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        //Relacionais -> ==, !=, >, <, >=, <=
        String nomeUm = "Janine";
        String nomeDois = new String("Janine");

        System.out.println(nomeUm.equals(nomeDois));

        //Lógicos -> && e ||
    }
}
