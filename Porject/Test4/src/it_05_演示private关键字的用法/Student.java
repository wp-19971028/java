package it_05_演示private关键字的用法;

//自定义学生类
public class Student {
    //属性
    String name;
    private int age;

    //对外提供一个公共的访问方式, 来操作age变量.
    //提供方法, 设置age的值.
    public void setAge(int a) {
        if (a >= 0 && a <= 250) {
            //走到这里, 说明年龄合法.
            age = a;
        }
    }

    //提供方法, 获取age的值.
    public int getAge() {
        return age;
    }


    //行为
    public void study() {
        //私有的内容, 本类中也可以直接访问.
        //System.out.println(age);
        System.out.println("键盘敲烂, 月薪过万!");
    }
}
