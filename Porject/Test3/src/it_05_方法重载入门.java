/*
    案例: 方法重载入门

    方法重载概述:
        同一个类中, 出现方法名相同, 但是参数列表不同的 两个或以上的方法时, 称为方法重载.
        方法重载与返回值的数据类型无关.

        参数列表不同解释:
            1. 参数个数不同.
            2. 对应参数的数据类型不同.

        解决的问题:
            用来解决方法功能相似, 但是方法名不能重名的问题. 简单理解: 就是用来解决方法重名问题的.
 */
public class it_05_方法重载入门 {
    public static void main(String[] args) {
        //1.定义方法compare(), 用来比较两个整型数据是否相等.
        //2.要求兼容所有的整数类型, 即(byte, short, int, long)

        //调用compare()方法, byte类型
        byte b1 = 10,  b2 = 20;
        System.out.println(compare(b1, b2));
        System.out.println("-----------------------------");

        //调用compare()方法, short类型
        short s1 = 10,  s2 = 20;
        System.out.println(compare(s1, s2));
        System.out.println("-----------------------------");

        //调用compare()方法, int类型
        System.out.println(compare(20, 10));
        System.out.println("-----------------------------");

        //调用compare()方法, long类型
        long s3 = 10,  s4 = 20;
        System.out.println(compare(s3, s4));
    }

    //定义方法compare(), 用来比较两个整型数据是否相等. byte类型
    public static boolean compare(byte b1, byte b2) {
        System.out.println("byte类型");
        return b1 == b2;
    }

    //定义方法compare(), 用来比较两个整型数据是否相等. short类型
    public static boolean compare(short s1, short s2) {
        System.out.println("short类型");
        return s1 == s2;
    }

    //定义方法compare(), 用来比较两个整型数据是否相等. int类型
    public static boolean compare(int a, int b) {
        System.out.println("int类型");
        return a == b;
    }

    //定义方法compare(), 用来比较两个整型数据是否相等. byte类型
    public static boolean compare(long b1, long b2) {
        System.out.println("long类型");
        return b1 == b2;
    }

}
