import java.util.Scanner; 

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
   
        System.out.println("Digite o número da conta: ");
        String numero = scanner.nextLine();
       
        System.out.println("Digite o numero da sua Agencia: ");
        String Agencia = scanner.nextLine();

        System.out.println("Digite o Seu nome: ");
        String nomeCliente = scanner.nextLine();

        double Saldo = 237.48;

        System.out.println("\n Olá, " +nomeCliente + "\n o número da sua conta é: " +numero + " Agencia: " +Agencia 
        + " saldo: " +Saldo);


       
        
    }
}
