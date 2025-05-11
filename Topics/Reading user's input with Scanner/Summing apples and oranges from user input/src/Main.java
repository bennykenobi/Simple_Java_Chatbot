import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Use a Scanner to read user input
        Scanner readFruit = new Scanner(System.in);

        // Read the number of apples from the user
        int apples = readFruit.nextInt();

        // Read the number of oranges from the user
        int oranges = readFruit.nextInt();

        // Calculate the total number of fruits and print the result
        System.out.println(apples + oranges); 
        
        readFruit.close();
    }
}
