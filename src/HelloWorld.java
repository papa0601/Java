public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Java Said \"Hello World\"\nAnd I Said \"Fuck You\"");

        byte num = 0;
        while (num < 100) {
            try {
                num++;
                Thread.sleep(125);
                System.out.println("당신은 " + num + "번 시도했다.");
            } catch (InterruptedException Ignore) {Ignore.printStackTrace();

            }
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n당신은 " + num + "번의 시도끝에 마침내 해냈다.");
    }
}
