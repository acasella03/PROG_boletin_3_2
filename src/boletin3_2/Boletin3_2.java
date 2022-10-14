package boletin3_2;

import java.util.Scanner;

public class Boletin3_2 {

    public static final double FAHRENHEIT1 = 1.8;
    public static final double FAHRENHEIT2 = 32;
    public static final double KELVIN = 273.15;

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Introduzca ºC:");
        double celsius = temp.nextDouble();
        double GradoF = celsius * FAHRENHEIT1 + FAHRENHEIT2;
        double GradoK = celsius + KELVIN;
        System.out.println(celsius + " ºC" + " son " + GradoF + " ºF \n" + celsius + " ºC" + " son " + GradoK + " K");
    }

}
