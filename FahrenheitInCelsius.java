import java.util.Scanner;
public class FahrenheitInCelsius {

    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
