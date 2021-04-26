package it_05_演示private关键字的用法;
/*
    案例: 演示private关键字的用法.

    private简介:
        为什么要学习private?
            因为目前我们代码中的成员变量, 外界是可以直接访问的, 这样的话, 用户就有可能给录入一些非法值,
            造成安全隐患, 所以我们要对 成员变量进行一层封装, 不让外界直接访问了.
            //大白话理解: 银行的钱用户是无法直接访问的, 要通过柜台小姐姐或者ATM自动存取款机来操作.
        概述:
            它是一个关键字, 表示"私有"的意思, 也是访问权限修饰符的一种,
            被它修饰的内容, 只能在本类中直接使用.

        应用场景:
            1.在实际开发中, 成员变量基本上都是用private关键字来修饰的.
            2.如果明确知道类中的某些内容不想被外界直接访问, 都可以通过private来修饰.

       细节:
            因为被private修饰的内容, 只能在本类中直接访问, 外界如果想使用这些私有成员, 需要通过特定方式.
            即: 我们可以在类中定义两个方法, 一个是setXxx(), 用来设置属性值, 一个getXxx(), 用来获取属性值.

 */
public class Test {
    public static void main(String[] args) {
        //1. 创建对象
        Student student = new Student();
        //2. 给对象赋值
        student.name = "张三";
//        student.age = 18  //私有成员外界无法直接访问.
        student.setAge(18);
        //3. 打印属性值
        System.out.println(student.name+"..."+ student.getAge());
        //4. 调用成员方法
        student.study();
    }
}
