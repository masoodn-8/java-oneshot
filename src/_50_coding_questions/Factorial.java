package _50_coding_questions;

public class Factorial {
    static void main() {
        int num = 1;

        int factorial = 1;
        while(num > 0){
            factorial = factorial * num;
            num--;
        }
        System.out.println(factorial);
    }
}
