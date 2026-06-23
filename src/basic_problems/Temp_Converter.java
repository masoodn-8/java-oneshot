package basic_problems;

import java.util.Scanner;

public class Temp_Converter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        System.out.println("Fahrenheit is : " + ((32 - celsius) * 5/9)*-1);
    }
}
