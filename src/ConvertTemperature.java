import java.util.Scanner;

public class ConvertTemperature {

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double FahrenheitToCelsius(double fahrenheit) {
        double celsius = (5 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
