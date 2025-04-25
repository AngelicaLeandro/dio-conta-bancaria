import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println( "Por favor, digite o número da Agência !");
            agencia = ler.nextLine();

        
        System.out.println( "Por favor, digite o número da Conta .");
            numero = ler.nextInt();
            ler.nextLine();

        
        System.out.println( "Por favor, digite o nome do usúario .");
            nomeCliente = ler.nextLine();

        
        System.out.println( "Por favor, digite o Saldo da Conta .");
            saldo = ler.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        ler.close();






    }
}
