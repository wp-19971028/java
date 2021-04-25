// 导包
import java.util.Scanner;

public class it_10_数据输入 {
    /*
    在Java中输就输入都要用到这三部
    导包 创对象 调用输入方法
     */
    // 这里就以控制太输入做一个输入的演示
    public static void main(String[] args) {
//        创建控制台输入对象
        Scanner sc = new Scanner(System.in);
        // 调用输入整数的方法输入整数
        int i = sc.nextInt();
        // 调用输入浮点的方法输入整数
        double j = sc.nextDouble();
        // 调用输入字符串的方法输入整数
        String s = sc.next();
        // 打印这些输入
        System.out.println(i);
        System.out.println(j);
        System.out.println(s);



    }
}
