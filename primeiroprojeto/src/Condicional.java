public class Condicional {

    public static void main(String[] args) {

        int anoDeLancamento = 1985;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filmes retrôs que valem a pena serem assistidos!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }

    }
}
