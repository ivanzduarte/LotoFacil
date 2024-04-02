import java.util.Random;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int escolha;

        do {
            System.out.println("**********");
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**********");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    apostarDe0a100(scanner, random);
                    break;
                case 2:
                    apostarDeAaZ(scanner);
                    break;
                case 3:
                    apostarParOuImpar(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 0);

        scanner.close();
    }

    private static void apostarDe0a100(Scanner scanner, Random random) {
        System.out.print("Digite um número de 0 a 100: ");
        int numeroSorteado = random.nextInt(101);
        int aposta = scanner.nextInt();

        if (aposta < 0 || aposta > 100) {
            System.out.println("Aposta inválida.");
            return;
        }



        if (aposta == numeroSorteado) {
            System.out.println("Você ganhou R$ 1.000,00 reais.");
        } else {
            System.out.println("Que pena! O número sorteado foi: " + numeroSorteado + ".");
        }
    }

    private static void apostarDeAaZ(Scanner scanner) {
        System.out.print("Digite uma letra de A à Z: ");
        char aposta = Character.toUpperCase(scanner.next().charAt(0));

        if (!Character.isLetter(aposta)) {
            System.out.println("Aposta inválida.");
            return;
        }

        char letraPremiada = 'I';

        if (aposta == letraPremiada) {
            System.out.println("Você ganhou R$ 500,00 reais.");
        } else {
            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada + ".");
        }
    }

    private static void apostarParOuImpar(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Você ganhou R$ 100,00 reais.");
        } else {
            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
        }
    }
}