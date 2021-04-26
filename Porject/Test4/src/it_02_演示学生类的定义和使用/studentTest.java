package it_02_演示学生类的定义和使用;
/*
    案例: 演示学生类的定义和使用.

    铺垫知识:
        1. Java语言是用来描述现实世界事物, 最基本的单位是: 类.
        2. 类就是 属性和行为 的集合, 是一个抽象的概念, 看不见, 也摸不着.
            属性:
                指的就是事物的外在特征(名词), 在Java中叫: 成员变量, 字段.

                成员变量:
                    和以前定义变量的格式一样, 只不过写在类中方法外, 且成员变量有默认值.

            行为:
                指的就是事物能够做什么(动词),  在Java中叫: 成员方法

                成员方法:
                    和以前定义方法格式一样, 只不过先不要写 static
        3. 对象是类的具体体现, 实现, 能看的见, 也能摸得着.
        4. 类的定义格式:
            public class 类名 {
                //属性

                //行为
            }
        5. 类的调用格式, 即: 如何使用类中的成员
            步骤1: 创建该类的对象.
                类名 对象名 = new 类名();
            步骤2: 通过 对象名. 的形式调用类中的成员.
                对象名.成员变量                //获取该成员变量的值.
                对象名.成员变量 = 值           //获取指定成员变量的值.
                对象名.成员方法()              //调用指定的成员方法

 */
public class studentTest {
    public static void main(String[] args) {
        //需求: 调用Student类中的成员.
        //1. 创建学生类的对象.
        student student = new student();

        //2. 打印属性值
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println("______________");
        //3. 设置属性值
        student.name = "张三";
        student.age = 18;

        //4. 打印属性值
        System.out.println(student.name);
        System.out.println(student.age);

        // 调用成员方法
        student.study();
    }
}
