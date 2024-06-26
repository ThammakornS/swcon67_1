public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Given temperature in Fahrenheit
        double fahrenheit = 98.6;

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
