import java.util.Scanner;

public class it_13_分支结构之if_else_语句 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("可以进网吧happy!");
        }
        else {
            System.out.println("未成年人禁止入内!");
        }
    }
}
