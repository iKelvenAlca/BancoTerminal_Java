import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu numero de conta: ");
        numero = sc.nextInt();
        System.out.println("Digite sua agencia: ");
        agencia = sc.next();
        System.out.println("Digite seu nome: ");
        nomeCliente = sc.next();
        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();
        
        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero +" e seu saldo " + saldo + 
        " já está disponível para saque");

    }
}
