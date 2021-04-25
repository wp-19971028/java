import java.util.Scanner;

public class it_16_分支结构之switch穿透 {
    /*
    表达式：取值为byte、short、int、char，JDK5
    以后可以是枚举，JDK7以后可以是String。
    case：后面跟的是要和表达式进行比较的值。
    break：表示中断，结束的意思，用来结束switch语句。
    default：表示所有情况都不匹配的时候，就执行该处的内容，和if语句的else相似。
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数代表月份");
        int i = sc.nextInt();
        switch (i) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("请输入准确的月份!");
                
        }
    }
}
