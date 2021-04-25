public class it_18_循环结构之for语句 {
    /*
    for语句的格式
    for (初始化语句;条件判断语句;条件控制语句) {
    }
     */
    public static void main(String[] args) {
        // 案例: 求1~100 之内的偶数

        for(int i = 1;i<=100;i++){
            if (i %2 == 0){
                System.out.println(i);
            }
        }
    }
}
