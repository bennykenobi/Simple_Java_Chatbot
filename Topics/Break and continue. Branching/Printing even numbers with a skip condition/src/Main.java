import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the integer 'n' as input from user
        int n = sc.nextInt();
        String number = "";

        // Loop from 1 to 'n' to print the numbers
        for(int i = 1; i <= n; i++) {
            // Include condition to check if 'i' is even
            if (i % 2 != 0) {
                continue;
            }
            // If 'i' is 10, skip this number and the next five numbers
            if (i == 10) {
                while (i < 15)
                    i++;
                continue;
            }
            number += i + " ";
        }
        System.out.println(number);
        sc.close();
    }
}