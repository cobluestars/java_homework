import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("세 자리 정숫값: ");
            num = scanner.nextInt();

            if (num >= 100 && num <= 999) {
                break;
            } else {

            }
        } while (true);

        //while문

//        while (true) {
//            System.out.print("세 자리 정숫값: ");
//            num = scanner.nextInt();
//
//            if (num >= 100 && num <= 999) {
//                break;
//            } else {
//
//            }
//        }

        //for문

//        for ( ; ; ) {   //무한 루프, 조건을 충족할 때까지 (세 자리 정숫값을 찾을 때까지) 루프를 반복한다.
//            System.out.print("세 자리 정숫값: ");
//            num = scanner.nextInt();
//
//            if (num >= 100 && num <= 999) {
//                break;
//            } else {
//
//            }
//        }

        System.out.println("입력한 값은 " + num + "입니다.");
    }
}