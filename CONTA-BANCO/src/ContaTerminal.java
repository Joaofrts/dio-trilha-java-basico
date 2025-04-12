import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da conta: ");
        int conta = sc.nextInt();
        System.out.print("Por favor, digite o numero da agencia: ");
        String agencia = sc.next();
        sc.nextLine();
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("Por favor, digite o depósito inicial da conta: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar um aconta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já esta disponivel para saque.",nomeCliente,agencia,conta,saldo);
    }
}