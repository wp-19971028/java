package it_08_构造器;

//自定义的学生类
public class Student {
    //属性
    private String name;
    private int age;

    //系统默认加的空参.
    public Student() {
        System.out.println("我是空参构造方法");
    }

    //自己给的全参
    public Student(String name, int age) {
        System.out.println("我是全参构造方法");
        this.name = name;
        this.age = age;
    }
}
