package it_07_this关键字;

//自定义的Teacher类
public class Teacher {
    //成员变量
    int a = 10;

    //成员方法
    public void show() {
        //局部变量
        int a = 20;
        System.out.println(a);           //局部变量, 20

        //this: 谁调用, this就代表谁.
        //其实这里跟写了个: t.a 一回事儿.
        System.out.println(this.a);      //成员变量, 10

    }
}
