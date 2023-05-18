import java.util.Scanner;
class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("카운트다운 합니다.");
        System.out.print("양의 정숫값: ");
        int numA = scanner.nextInt();
        System.out.print("양의 정숫값: ");
        int numB = scanner.nextInt();

        if (numB > numA) {
            for (int x = numB; x >= numA; x--) {
                System.out.println(x);
                if (x == 0) {
                    System.out.println("x가 -1이 되었습니다.");
                    break;
                }
            }
        } else {
            for (int x = numA; x >= numB; --x) {
                System.out.println(x);
                if (x == 0) {
                    System.out.println("x가 -1이 되었습니다.");
                    break;
                }
            }
        }
    }
}
