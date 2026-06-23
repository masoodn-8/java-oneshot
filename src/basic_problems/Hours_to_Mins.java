package basic_problems;

import java.util.Scanner;

public class Hours_to_Mins {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int hours = sc.nextInt();

        System.out.println("Minutes : " +hours * 60);
    }
}
