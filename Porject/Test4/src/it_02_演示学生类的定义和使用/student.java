package it_02_演示学生类的定义和使用;

/*
    定义学生类(Student), 分析如下:
        属性: 指的就是事物的外在特征(名词), 在Java中叫: 成员变量, 字段.

        行为: 指的就是事物能够做什么(动词),  在Java中叫: 成员方法
 */
public class student {
    //属性, 也叫成员变量, 写在类中, 方法外, 且有默认值.
    String name;        //姓名
    int age;            //年龄


    //行为, 也叫成员方法, 先不写static.
    public void study() {
        System.out.println("好好学习, 将来开大G!  AMG G500");
    }
}
