package it_04_演示成员变量和局部变量的区别;
// 自定义学生类
public class Student {
    //成员变量, 属性
    int a = 20;

    //成员方法, 行为
    public void show() {
        //局部变量
        int b = 10;

        System.out.println(a);  //20
        System.out.println(b);  //10
    }
}
