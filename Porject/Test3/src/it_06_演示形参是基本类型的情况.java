public class it_06_演示形参是基本类型的情况 {
    /*
    案例: 演示形参是基本类型的情况.

    结论:
        如果是基本类型作为形参: 传递的是数值, 所以形参的改变对实参没有任何影响.
    */
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);        //100
        change(number);	 //实参.
        System.out.println("调用change方法后：" + number);        //100
    }

    public static void change(int number) {	//形参.
        number = 200;
    }
}
