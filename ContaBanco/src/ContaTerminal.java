import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência : ");
        String numero = sc.nextLine();
        System.out.print("Por favor, informe a agência : ");
        String agencia = sc.nextLine();
        System.out.print("Por favor, informe o nome do cliente : ");
        String nome = sc.nextLine();
        System.out.print("Por favor, informe o saldo : R$ ");
        float saldo = sc.nextFloat();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia
                + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque");

        sc.close();
    }
}
