import java.util.Random;
import java.util.Scanner;
public class dice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner check = new Scanner(System.in);
        while (true) {
            int rannum = rand.nextInt(6) + 1;
            System.out.println("주사위의 수는 " + rannum + "입니다.\n");
            System.out.print("나가려면 0을 입력하세요. 1을 입력하면 주사위를 다시 굴리게 됩니다>>>");
            int con = check.nextInt();
            if (con == 0) {
                break;
            }
            for (int i = 0; i <= 25; i++) {
                System.out.println("");
            }
        }
    }
}