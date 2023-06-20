import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite o numero da Conta");
        numero = sc.nextInt();
        System.out.println("Por favor digite o numero da Agencia");
        agencia = sc.next();
        System.out.println("Por favor digite Nome e Sobrenome");
        nomeCliente = sc.next();
        System.out.println("Por favor digite o seu Saldo");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero +" e seu saldo " + saldo + " já está disponível para saque.");
    }
   
    
}
