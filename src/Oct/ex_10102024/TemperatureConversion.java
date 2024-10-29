package Oct.ex_10102024;

public class TemperatureConversion {
    public static void main(String[] args) {
        final double CONVERSION_RATIO = 9.0/5.0;
        final int BASE_FAHRENHEIT =  32;

        double celcius = 15.0;
        double  fahrenheit = (celcius * CONVERSION_RATIO)+ BASE_FAHRENHEIT;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
