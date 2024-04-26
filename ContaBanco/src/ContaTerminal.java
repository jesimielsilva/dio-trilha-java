import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
         // Criando um objeto Scanner para ler entrada do usuário
         Scanner scanner = new Scanner(System.in);
        
         // Solicitando e lendo o número da agência
         System.out.println("Por favor, digite o número da Agência com o dígito: ");
         String agencia = scanner.nextLine();
         
         // Solicitando e lendo o número da conta
         System.out.println("Agora o número da Conta: ");
         int numeroConta = Integer.parseInt(scanner.nextLine());
         
         // Solicitando e lendo o nome e sobrenome do cliente
         System.out.println("Digite o nome e o sobrenome do Cliente: ");
         String nomeCliente = scanner.nextLine();
         
         // Solicitando e lendo o saldo da conta
         System.out.println("E o Saldo em conta: ");
         String saldoConta = scanner.nextLine(); // Lê a entrada como uma string
         double saldoContaCliente = Double.parseDouble(saldoConta); // Converte para double
         
         // Exibindo uma mensagem de boas-vindas ao cliente com as informações fornecidas
         System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " + 
                 "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " +
                 saldoContaCliente + " já está disponível para saque. ");
         
         // Fechando o objeto Scanner para liberar recursos
         scanner.close();

    }
}
