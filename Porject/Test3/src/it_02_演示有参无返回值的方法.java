/*
    案例: 演示有参无返回值的方法.

    需求:
        1.定义方法isEvenNumber(), 该方法接收一个int类型的整数num.
        2.判断num是奇数还是偶数, 并打印结果.

    涉及到的关于方法的小技巧:
        定义方法时的三个明确:
            1. 明确方法名.
            2. 明确参数列表.
            3. 明确返回值的数据类型.

        调用方法时的三个步骤:
            1. 写方法名.
            2. 传参.   方法要什么类型的数据, 我们就传入什么类型的值.
            3. 接收.   方法返回什么值, 我们就用对应的数据类型来接收.
 */
public class it_02_演示有参无返回值的方法 {
    public static void main(String[] args) {
        //调用isEvenNumber()方法, 传入变量.
        int a = 10;
        isEvenNumber(a);            //实参, 实际参与操作的数据
        System.out.println("-------------------");
        //调用isEvenNumber()方法, 传入常量.
        isEvenNumber(21);           //实参, 实际参与操作的数据
    }

    /*
         需求: 定义方法isEvenNumber(), 判断指定的数字是否是偶数, 并打印.

          定义方法时的三个明确:
            1. 明确方法名.                   isEvenNumber()
            2. 明确参数列表.                 int num
            3. 明确返回值的数据类型.         void
     */
    public static void isEvenNumber(int num) {    //int num = ?             //形参: 形容调用方法, 需要传入什么类型的参数.
        //判断指定的数字是否是偶数, 并打印.
        if (num % 2 == 0)
            System.out.println(num + "是偶数");
        else
            System.out.println(num + "是奇数");
    }
}
