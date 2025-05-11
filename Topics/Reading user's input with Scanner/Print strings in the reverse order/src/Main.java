import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();
        System.out.println(third + "\n" + second + "\n" + first);
        sc.close();
    }
}
