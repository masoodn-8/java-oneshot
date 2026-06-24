package _50_coding_questions;

public class Sum_Of_N {
    static void main() {
        int num = 5;
        int sum = 0;
        while(num > 0){
            sum += num;
            num--;
        }

        System.out.println(sum);
    }
}
