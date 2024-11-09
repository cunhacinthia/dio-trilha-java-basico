import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o suário

        //Obter pela classe scanner os vamores digitados no terminal

        //Exibir a mensagem da conta criada

        Scanner inserir = new Scanner(System.in);

        String agencia;
        int numeroConta;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência");
        agencia = inserir.next();
        System.out.println("Digite o número da conta");
        numeroConta = inserir.nextInt();
        System.out.println("Digite o seu nome");
        nomeCliente = inserir.next();
        System.out.println("Digite o seu saldo");
        saldo = inserir.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
