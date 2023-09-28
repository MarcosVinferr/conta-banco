import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o numero da sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("digite o numero da sua Agência: ");
        String agencia = scanner.next();

        System.out.println("digite o seu nome. ");
        String nome = scanner.next();

        System.out.println("digite o seu sobrenome. ");
        String sobrenome = scanner.next();

        System.out.println("digite o saldo da sua conta.");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nome +" "+ sobrenome +", obrigado por criar uma conta em nosso banco, sua agência é " 
                            + agencia +", conta " + numero + " e seu saldo é de R$ " 
                            + saldo + " Já esta disponivel para saque. " );
    }
}
