import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class DesafioContaBancaria {

    public static void main(String[] args) {
        // Inicilizando dados do cliente
        String cliente =  "Bram Stoker";
        String tipoConta = "Conta Corrente"; // Outra opção: Poupança

        double saldoInicial = 15000.00;
        double saldoAtual = saldoInicial;

        int opcaoMenu = 0;

        System.out.println("********************************************");
        System.out.println("DADOS INICIAIS DO CLIENTE");
        System.out.println();
        System.out.println("Nome: " + cliente);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + NumberFormat.getCurrencyInstance().format(saldoInicial));
        System.out.println("********************************************");
        System.out.println();
        System.out.println();
        System.out.println("");

        // Montando menu para o usuário
        String menu = """
                *** OPERAÇÕES ***
                1 Consultar saldos
                2 Receber valor
                3 Transferir valor
                4 Sair
                
                Digite a opção desejada
                """;
        Scanner entrada = new Scanner(System.in);

        while (opcaoMenu != 4) {
            System.out.println(menu);
            opcaoMenu = entrada.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Saldo: " + saldoAtual);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double valorReceber = entrada.nextDouble();
                    saldoAtual = saldoAtual + valorReceber;
                    System.out.println("Saldo: " + saldoAtual);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir: ");
                    double valorTransferir = entrada.nextDouble();
                    if (saldoAtual > valorTransferir) {
                        saldoAtual = saldoAtual - valorTransferir;
                        System.out.println("Saldo: " + saldoAtual);
                        System.out.println();
                    } else {
                        System.out.println("Não há saldo suficiente para fazer essa transferência!");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Obrigado pela preferência! ");
                    System.out.println("Volte sempre! ");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida! ");
                    System.out.println();

            }
        }











    }
}
