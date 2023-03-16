import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //be användaren om temperatur i celcius
        System.out.print("Enter a temperature in 'Celsius': ");
        double celsius = Double.parseDouble(new Scanner(System.in).nextLine()); //hämtar input-temp som double

        //omvandla temperaturen till fahrenheit
        double CelToFahr = (celsius * 1.8 + 32);
        System.out.println(celsius + " degrees 'Celsius' is " + CelToFahr + " degrees 'Fahrenheit'.");

        //omvandla temperaturen till kelvin
        double CelToKel = (celsius + 273.15);
        System.out.println(CelToFahr + " degrees 'Fahrenheit' is " + CelToKel + " degrees 'Kelvin'.");

        //omvandla temperaturen åter till celsius
        double KelToCel = (CelToKel - 273.15);
        System.out.println(CelToKel + " degrees 'Kelvin' is " + KelToCel + " degrees 'Celsius'.");
    }
}
