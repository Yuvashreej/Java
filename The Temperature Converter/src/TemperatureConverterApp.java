import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter temperature in fahrenheit");
		double F= scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();

		double res = temperatureConverter.convertFahrenheitToCelsius(F);
        System.out.printf("%.2f",res);
	}

}
