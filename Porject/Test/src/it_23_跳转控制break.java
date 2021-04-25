public class it_23_跳转控制break {
    public static void main(String[] args) {
        //打印1-100的偶数 如果是11的倍数跳出循环
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                if (i % 11 == 0) {
                    break;
                }
                System.out.println(i);
            }
        }
    }
}
