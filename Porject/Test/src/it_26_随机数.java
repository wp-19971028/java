import java.util.Random;

public class it_26_随机数 {
    /*
    产生随机数有两种方法
    1.用math.random()方法
    2.使用random类的random方法
     */
    public static void main(String[] args) {
        //演示math.random
        // 这种只可以产生[0-1)之间的随机数
        // 要的到特定范围通过数学操作
        System.out.println(Math.random());
        // 要得到 10~20 的数字
        System.out.println((int)(Math.random() * 10+10));

        // random演示
        Random ran = new Random();
        //产生[0~10)的随机数
        System.out.println(ran.nextInt(10));
        //产生0~1的随机数
        System.out.println(ran.nextDouble());


    }
}
