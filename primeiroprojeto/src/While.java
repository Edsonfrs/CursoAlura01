public class While {

    public static void main(String[] args) {

        int contador = 0;

        while (contador <= 10) {
            System.out.println(contador + " com while");
            contador++;
        }

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println(cont + " esse é com o for.");
        }


    }
}
