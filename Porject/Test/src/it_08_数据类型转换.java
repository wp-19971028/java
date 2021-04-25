public class it_08_数据类型转换 {
    /*
    数据类型转换分为两种
    自动转换
    和
    强制转换
     */
    /*
    小类型转大自动转换
    大转小要强制
     */
    // 案例演示
    public static void main(String[] args) {
        // 自动转换
        int a = 10;
        float b = a;
        System.out.println(b);
        // 强制转换
        int x = 10;
        float y = 3.14f;
        x = (int) y;
        System.out.println(x);

    }
}
