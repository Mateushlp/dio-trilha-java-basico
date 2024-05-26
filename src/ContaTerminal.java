import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite e o seu Nome:");
        String nome = scanner.next();

        
        System.out.print("Digite Sua Agencia:");
        int agencia = scanner.nextInt();

        System.out.print("Digita o Numero da Sua Conta:");
        int conta = scanner.nextInt();

        System.out.print("Por favor digite seu saldo:");
        double saldo = scanner.nextDouble();


       System.out.print("Ola "+ nome +" , obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +" , conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
