public class Main {
    public static void main(String[] args) {
        System.out.println("CONVERSOR DE TEMPERATURA");

        double tempCelsius = 30.4;
        double tempCelsiusFahrenheit = (tempCelsius * 1.8) + 32;
        int tempConvertidafahrenheit = (int) tempCelsiusFahrenheit;

        System.out.println("Temperatura Celsius: " + tempCelsius);
        System.out.println("Temperatura Fahrenheit: " + tempCelsiusFahrenheit);
        System.out.println("Temperatura Fahrenheit(Display): " + tempConvertidafahrenheit );
    }
}