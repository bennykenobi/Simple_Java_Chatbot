import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int students = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        for  (int i = 0; i < students; i++) {
            char grade = scanner.next().charAt(0);
            if (grade == 'A') {
                gradeA++;
            }  else if (grade == 'B') {
                gradeB++;
            }  else if (grade == 'C') {
                gradeC++;
            } else {
                gradeD++;
            }
        }
        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}
