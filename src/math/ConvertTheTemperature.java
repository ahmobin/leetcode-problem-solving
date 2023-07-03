package math;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ConvertTheTemperature {
    public static void main(String[] args) {
        System.out.println("2469. Convert the Temperature");
        System.out.println("==============================");
        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }


    public static double[] convertTemperature(double celsius){
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }
}
