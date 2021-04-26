package it_06_演示加入private关键字后的_标准代码_;


//自定义的学生类, 像这种用来描述实体的类也叫: 实体类, 或者JavaBean类, POJO类.
public class Student {
    //属性: 姓名和年龄
    private String name;        //姓名
    private int age;            //年龄

    //对外提供getXxx()和setXxx(), 让用户来操作name和age属性.
    //获取姓名
    public String getName() {
        return name;
    }
    //设置姓名
    public void setName(String n) {
        //这里可以判断n(传入的姓名)是否合法, 但是我们不做
        name = n;
    }

    //获取年龄
    public int getAge(){
        return age;
    }

    //设置年龄
    public void setAge(int a) {
        //这里可以判断a(传入的年龄)是否合法, 但是我们不做
        age = a;
    }

    //行为: 学习, 吃饭.
    public void study() {
        System.out.println("键盘敲烂, 月薪过万!");
    }

    public void eat() {
        System.out.println("学生吃牛肉!");
    }
}
