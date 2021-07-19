import java.util.Scanner;

/*
olist의 값을 사용자가 지정한 만큼 nlist에 덮어 씌우는 코드
This code is compiled in intelliJ
*/
public class ListChange {
    public static void main(String[] args) {
        String[] olist = {"1.0", "2.0", "3.0", "3.1", "3.11", "NT", "95", "98", "2000", "ME", "XP", "Vista", "7", "8", "8.1", "10", "11"};
        Scanner counter = new Scanner(System.in);
        System.out.print("리스트를 불러올 범위를 지정해주세요(1~" + olist.length + ")>>>");
        int count = counter.nextInt() - 1;
        if (count < 0) {
            count = 0;
        }else if (count > olist.length - 1) {
            count = olist.length - 1;
        }
        String[] nlist = new String[count + 1];
        for (int i = 0; i <= count; i++) {
            nlist[i] = olist[i];
            System.out.println(nlist[i]);
        }

    }
}