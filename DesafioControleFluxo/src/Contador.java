import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int primeiroParametro = terminal.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int segundoParametro = terminal.nextInt();

        try {
            // chamando o método contendo a lógica de contagem
            contar(primeiroParametro, segundoParametro);

        } catch (ParametrosInvalidosException exception) {
            // imprimir a mensageclsm: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("\n O segundo parâmetro deve ser maior que o primerio.\n");
        }
        terminal.close();
    }

    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (primeiroParametro > segundoParametro) {
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoParametro - primeiroParametro;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imrimindo o número: " + (i + 1));
        }
    }
}
