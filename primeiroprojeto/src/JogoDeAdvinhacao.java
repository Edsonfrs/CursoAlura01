import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);// Geração do número aleatório
        int numeroTentavivas = 0;

        while (numeroTentavivas < 5) {
            System.out.println("Por favor, digite um número entra 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            numeroTentavivas++;

            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Muito Bom!!! Você acertou o número em " + numeroTentavivas + " tentavivas.");
                break;
            } else if (numeroDigitado < numeroAleatorio) {
                System.out.println("O número digitado é menor que número esperado!");
            } else {
                System.out.println("O número digitado é maior que número esperado!");
            }
        }
        if (numeroTentavivas == 5) {
            System.out.println("Eita!!! Você não conseguiu acertar o número esperado dentro das 5 tentativas. O número era "
            + numeroAleatorio);
        }
    }
}
