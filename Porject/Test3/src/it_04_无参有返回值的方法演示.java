/*
    案例: 无参有返回值的方法演示.

    需求:
        1.定义方法isEvenNumber(), 该方法内部有一个整数num.
        2.判断num是奇数还是偶数, 并返回结果.
        3.在main方法中调用isEvenNumber()方法, 并打印结果.

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
public class it_04_无参有返回值的方法演示 {
    public static void main(String[] args) {
        //调用方法, 输出调用.
        System.out.println(isEvenNumber());
        System.out.println("----------------------------");

        //调用方法, 赋值调用.
        boolean flag = isEvenNumber();
        System.out.println(flag);
    }

    //需求: 定义方法isEvenNumber(), 该方法内部有一个整数num, 判断num是奇数还是偶数, 并返回结果.
    //明确方法名: isEvenNumber(),  明确参数列表: 空参,  明确返回值的数据类型: boolean

    /**
     * 该方法是用来判读数字是奇数还是偶数的.
     * @return true: 偶数, false: 奇数
     */
    public static boolean isEvenNumber() {
        int num = 10;
        //判断num是奇数还是偶数, 并返回结果.
       /* if(num % 2 == 0)
            return true;
        else
            return false;*/

       /*boolean flag =  num % 2 == 0 ? true : false;
       return flag;*/

       /*boolean flag =  num % 2 == 0;
       return flag;*/

        return num % 2 == 0;
    }
}
