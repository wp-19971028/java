package it_09_一个完整的类定义与演示;

//自定义的学生类, 标准的JavaBean类.
//要求: 属性: 姓名和年龄, 行为: 学习, 吃饭.
public class Student {
    //属性, 全部私有.
    private String name;        //姓名
    private int age;            //年龄

    //构造方法, 空参, 全参.
    public Student() { }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getXxx(), setXxx()
    //操作姓名
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //操作年龄
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    //行为, 成员方法, 先不写static
    //学习
    public void study() {
        System.out.println("键盘敲烂, 月薪过万!");
    }

    //吃饭
    public void eat() {
        System.out.println("学生吃牛肉!");
    }
}
