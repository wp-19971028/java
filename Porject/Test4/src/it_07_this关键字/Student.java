package it_07_this关键字;

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
    public void setName(String name) {
        this.name = name;
    }

    //获取年龄
    public int getAge(){
        return age;
    }

    //设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    //行为: 学习, 吃饭.
    public void study() {
        System.out.println("键盘敲烂, 月薪过万!");
    }

    public void eat() {
        System.out.println("学生吃牛肉!");
    }
}
