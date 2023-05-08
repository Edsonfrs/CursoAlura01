import java.sql.SQLOutput;
import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = leitura.nextInt();

        System.out.println("Digite sua nota para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println();
        System.out.println("CADASTRO DE FILMES");
        System.out.println("Nome do Filme: " + filme);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);




    }
}
