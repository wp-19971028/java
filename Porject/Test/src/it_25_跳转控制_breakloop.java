public class it_25_跳转控制_breakloop {
    /*
    一般break只结束层循环
    如果在break后面跟一个标签那就会技术一个代码块
     */
    public static void main(String[] args) {
        for (int i = 0;i <10;i++){
            for (int j = 0;j <10;j++){
                if (i == 5){
                    break;
                }
                System.out.println("("+i+","+j+")");
            }
        }
        System.out.println("+++++++++++++++++++++++++");
        loop:for (int i = 0;i <10;i++){
            for (int j = 0;j <10;j++){
                if (i == 5){
                    break loop;
                }
                System.out.println("("+i+","+j+")");
            }
        }
    }
}
