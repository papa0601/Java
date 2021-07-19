import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        String[] OList = {"3.1", "3.11", "NT", "95", "98", "2000", "ME", "XP", "Vista", "7", "8", "8.1", "10", "11"};
        Scanner Counter = new Scanner(System.in);
        System.out.print("리스트를 불러올 범위를 지정해주세요(1~" + OList.length + ")>>>");
        int Count = Counter.nextInt() - 1;
        if (Count < 0) {
            Count = 0;
        }else if (Count > OList.length - 1) {
            Count = OList.length - 1;
        }
        String[] NList = new String[Count + 1];
        for (int i = 0; i <= Count; i++) {
            NList[i] = OList[i];
            System.out.println(NList[i]);
        }

    }
}
