import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int bus = scanner.nextInt();
        int bridges = scanner.nextInt();
        for (int i = 1 ; i <= bridges ; i++) {
            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight > bus) {
                if (i == bridges) {
                    System.out.println("Will not crash");
                }
                continue;
            } else if (bus >= bridgeHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            }

        }
        scanner.close();
    }
}