import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numUsuario = -1;
        int numAleatorio = random.nextInt(100);

        System.out.println("ADVINHE O NÚMERO!!!\nVocê tem 10 tentativas!\n=========================");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "- Número escolhido: ");
            numUsuario = scanner.nextInt();
            scanner.nextLine();
            if (numUsuario == numAleatorio) { 
                System.out.printf("Você acertou! Eu estava pensando no número %d", numAleatorio);
                break; 
            } else if (i == 10) {
                System.out.printf("Voce perdeu, O número era %d!", numAleatorio);
                break;
            }

            int diferenca = numUsuario - numAleatorio;
            diferenca = diferenca < 0 ? -diferenca : diferenca;
            if (diferenca < 5) {
                System.out.println("Muito quente!");
            } else if (diferenca < 15) {
                System.out.println("Quente!");
            } else if (diferenca < 40) {
                System.out.println("Frio!");
            } else {
                System.out.println("Muito frio!");
            }
        }

        scanner.close();
    }

}