import java.util.Scanner;

public class it_22_跳转控制continue {
    public static void main(String[] args) {
        //打印1-100内除了5的倍数的偶数
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                if (i % 5 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
