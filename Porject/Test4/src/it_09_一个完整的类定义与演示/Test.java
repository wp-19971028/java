package it_09_一个完整的类定义与演示;

/*
    案例: 标准的JavaBean的定义和使用.

    需求:
        1.定义一个标准的学生类Student, 属性: 姓名和年龄, 行为: 学习, 吃饭.
        2.在测试类中创建学生类的对象, 然后访问类中的成员.

    定义格式:
        public class 类名 {
            //属性, 全部私有.

            //构造方法, 空参, 全参.

            //getXxx(), setXxx()

            //行为, 成员方法, 先不写static
        }

    使用格式:
        1. 创建的对象
        2. 通过 对象名. 的形式来访问类中的成员.
 */
public class Test {
    public static void main(String[] args) {
        //需求1: 测试空参构造.
        //1. 创建对象.
        Student s1 = new Student();
        //2. 设置属性值.
        s1.setName("刘亦菲");
        s1.setAge(33);
        //3. 打印属性值.
        System.out.println(s1.getName() + "..." + s1.getAge());
        //4. 调用成员方法.
        s1.study();
        s1.eat();
        System.out.println("---------------------------------");


        //需求2: 测试全参构造.
        //1. 创建对象, 并设置属性值.
        Student s2 = new Student("赵丽颖", 31);

        //2. 打印属性值.
        System.out.println(s2.getName() + "..." + s2.getAge());

        //3. 调用成员方法.
        s2.study();
        s2.eat();
    }
}
