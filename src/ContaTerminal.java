import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println(nomeCliente+" digite sua agência");
        String agencia = scanner.next();

        System.out.println(nomeCliente+" digite o número da sua conta");
        int numeroConta = scanner.nextInt();
        
        System.out.println(nomeCliente+" digite seu saldo atual");
        double saldo = scanner.nextDouble();
        
        
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo R$"+saldo+" já está disponível para saque.");


    }

}
