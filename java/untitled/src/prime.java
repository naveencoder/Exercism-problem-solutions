import java.util.Scanner;

public class prime

{
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 2; i <= num; i++) {
            int flag = 0;
            for (int j = 2; j <= i; j++) {
                while (i % j == 0) {
                    flag = 1;
                }
                if (flag == 0) {
                    System.out.println(+i + " ");
                }
            }

        }
    }

}
