package it_07_this关键字;
/*
    案例: 演示this关键字.

    封装简介:
        概述:
            封装就是隐藏对象的属性和实现细节, 仅对外提供一个公共的访问方式.
            怎么隐藏?
                可以通过private关键字实现.
            公共的访问方式是什么?
                getXxx(), setXxx()
        原则:
            1. 把不需要对外暴漏的内容都封装起来.
            2. 把成员变量全部私有化(封装起来).
            //大白话翻译: 成员变量私有化(private修饰), 其他用public修饰.

        好处:
            1. 提高了代码的安全性.        由private保证.
            2. 提高了代码的复用性.        由方法保证.

    this关键字简介
        概述:
            它是一个关键字, 代表本类当前对象的引用.
            //大白话: 谁调用, this就代表谁.
        作用:
            用来解决局部变量和成员变量重名问题的.

        补充: 使用变量的原则
            使用变量遵循就近原则, 如果局部位置有, 就使用, 没有就去本类的成员位置找, 有就是使用.
            没有就报错.      //先这么记忆, 不严谨, 因为本类找不到, 还回去父类找.
 */
public class Test {
    public static void main(String[] args) {
        //需求1: 调用Teacher#show(), 演示使用变量的原则.
        //method01();

        //需求2: 加入this后的, 标准的Student类的代码编写和调用.
        //1. 创建对象.
        Student s = new Student();
        //2. 设置属性值.
        //s.name = "刘亦菲";     //private修饰的内容, 外界无法直接访问.
        s.setName("刘亦菲");
        s.setAge(33);
        //3. 打印属性值.
        System.out.println(s.getName() + "..." + s.getAge());
        //4. 调用成员方法.
        s.study();
        s.eat();

    }

    public static void method01() {
        Teacher t = new Teacher();
        t.a = 100;
        t.show();
    }

}

