import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 A: ");
        int numA = scanner.nextInt();
        System.out.print("정수 B: ");
        int numB = scanner.nextInt();

            if (numB < numA) {
                for (int i = numB; i <= numA; i++) {
                    System.out.print(" " + i);
                }
            } else {
                for (int i = numA; i <= numB; i++) {
                    System.out.print(" " + i);
                }
            }
        }
    }