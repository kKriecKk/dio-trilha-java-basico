import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{

        // Acessa informações do cliente
        String idAgencia = "067-8";
        float saldoConta = 237.48f;
        var scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência(conta)");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.nextLine();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo de R$ %s já está " +
                "disponível para saque. \n", nomeCliente, idAgencia, numeroConta, saldoConta);

    }
}
