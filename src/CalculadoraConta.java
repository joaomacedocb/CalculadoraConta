import java.util.Scanner;

public class CalculadoraConta {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Olá! Boas-vindas ao divisor de conta entre amigos. Informe o valor da conta:");
            String valorDaContaEntrada = scanner.nextLine();

            System.out.println("O valor da conta é: R$ " + valorDaContaEntrada + ". Quantas pessoas pagarão?");
            String numeroPagantesEntrada = scanner.nextLine();

            boolean ehNumeroValor = valorDaContaEntrada.matches("\\d+");
            boolean ehNumeroPagantes = numeroPagantesEntrada.matches("\\d+");

            if (ehNumeroValor && ehNumeroPagantes && numeroPagantesEntrada.matches("[1-9]\\d*")) {
                System.out.println("Calculando...");
                float valorDaConta = Float.parseFloat(valorDaContaEntrada);
                int numeroPagantes = Integer.parseInt(numeroPagantesEntrada);

                float valorIndividual = valorDaConta / numeroPagantes;
                System.out.println("O valor para cada pagante é: R$ " + valorIndividual);

            } else {
                System.out.println("O valor da conta e quantidade de pagantes precisa ser um número válido.");
            }
        }
    }
