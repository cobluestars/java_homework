import java.util.Scanner;
import java.lang.Math;
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int random = (int) (Math.random() * 100);
        int life = 5;

        do {
            System.out.print("두 자리 양의 정숫값: ");
            num = scanner.nextInt();
            life --;

            if (num >= 10 && num <= 99) {
                if (num != random) {
                    if (num > random) {
                        System.out.println("더 작은 숫자입니다. (남은 life: " + life + ")");
                    } else {
                        System.out.println("더 큰 숫자입니다. (남은 life: " + life + ")");
                    }
                } else {
                System.out.println("정답입니다.");
                break;
                }

                if(life == 0) {
                    System.out.println("게임 오버!");
                    System.out.println("정답은 " + random + "입니다.");
                    break;
                }
            } else {
                System.out.println("두 자리 양의 정숫값을 입력하세요. 벌칙으로 life: -1 하겠습니다.");
                System.out.println("남은 life: " + life);
            }
        } while (true);
    }
}