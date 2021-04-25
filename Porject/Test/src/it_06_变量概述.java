public class it_06_变量概述 {
    /*
        变量概述
        变量: 在程序执行过程中其中值可以
        发生改变 本质上是一个内存中的小区域块
     */
    public static void main(String[] args) {
        // 变量定义
        int a = 10 ;
        /*
        在变量定义时
        1. 变量不可以和main重名
        2. 不可以和关键字重名
        3. 不可以重复定义
        4. 不可以把初始值赋的超范围
         */
        // 变量赋值
        a = 11;
        // 变量运算
        a = a + 1;
        // 变量打印
        System.out.println(a);

    }

}
