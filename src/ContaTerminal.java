import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
    int numeroConta;
    String agencia;
    String nomeCliente;
    Float saldo;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Numero Conta:");
    numeroConta = entrada.nextInt();
    System.out.println("Numero Agencia:");
    agencia = entrada.next();
    System.out.println("Nome Cliente:");
    nomeCliente = entrada.next();
    System.out.println("Saldo Cliente:");
    saldo = entrada.nextFloat();
    if (numeroConta !=0 && !nomeCliente.isEmpty()) {
        System.out.println("Conta criada com sucesso!");
    System.out.println(numeroConta+" "+agencia+" " +nomeCliente+" "+ saldo+" ");
    }
    

    }
    
}
