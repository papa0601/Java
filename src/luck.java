import java.util.Random;
import java.util.Scanner;
public class luck {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner check = new Scanner(System.in);
        System.out.println("랜덤으로 지정할 수의 최댓값을 입력해주세요.0~(수가 클수록 확률이 낮아집니다)>>>>");
        int max = check.nextInt();
        int goal = rand.nextInt(max);
        int cur = 10;
        int att = 0;
        while (cur == goal) {
            cur = rand.nextInt(max) + 1;
            att++;
            System.out.println(att + "번째 시도는 실패했습니다.");
        }
        System.out.println(att + "번째 시도가 성공했습니다!");
    }
}
