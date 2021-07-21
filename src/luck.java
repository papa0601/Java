import java.util.Random;
import java.util.Scanner;
public class luck {
    public static void main(String[] args) {
        Random rand = new Random();
        int max;

        while (true) {
            Scanner check = new Scanner(System.in);


            try {
                while (true) {
                    System.out.print("숫자를 입력해주세요. 10~(수가 클수록 확률이 낮아집니다)>>>>");
                    max = check.nextInt();
                    if (max > 9) {
                        break;
                    }
                    System.out.println("\n\n\n\n\n");
                    System.out.println("10이상의 수를 입력해주세요.");

                }
                break;
            } catch (Exception e) {
                System.out.println("\n\n\n\n\n");
                System.out.println("정수를 입력해주세요.");
            }
        }
        int goal = rand.nextInt(max) + 10;
        int cur = 1;
        int att = 0;

        while (cur != goal) {
            cur = rand.nextInt(goal) + 1;
            att++;
            System.out.println(att + "번째 시도 : 실패");
        }
        att++;
        System.out.println(att + "번째 시도 : 성공!");
    }
}
