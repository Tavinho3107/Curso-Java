import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuario

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        try(Scanner scanner = new Scanner(System.in)){
        scanner.useLocale(new Locale("US"));

        System.out.println("Por favor, digite o numero da conta: ");
        int Numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente 

        System.out.println("Por favor, digite o numero da agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome completo do cliente: ");
        String Nome = scanner.nextLine();

        System.out.println("Por davor, digite o saldo da conta: ");
        double Saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");      
        }
    }
}
