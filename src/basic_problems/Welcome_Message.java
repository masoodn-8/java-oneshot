package basic_problems;

import java.util.Scanner;

public class Welcome_Message{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(name);
    }
}