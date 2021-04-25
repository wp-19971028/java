import java.util.Scanner;

public class it_14_分支结构之if_elseif_else_语句 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        if(score >= 80){
            System.out.println("奖励一百快钱");
        }
        else if( score >= 60) {
            System.out.println("去吃海底捞!");
        }else {
            System.out.println("挨打!");
        }
    }
}
