package it_06_演示加入private关键字后的_标准代码_;

/*
    案例: 演示加入private关键字后的 "标准代码".

    需求:
        1.定义一个标准的学生类Student, 属性: 姓名和年龄, 行为: 学习, 吃饭.
        2.在测试类中创建学生类的对象, 然后访问类中的成员.

    StudentDemo类: 测试类.
 */
public class Test {
    public static void main(String[] args) {
        //1. 创建对象.
        Student s = new Student();
        //2. 设置属性值.
        //s.name = "刘亦菲";     //private修饰的内容, 外界无法直接访问.
        s.setName("刘亦菲");
        /*
            这里的-33是我们自己手动传入的, 实际开发中, 没有这种情况, 因为数据从前端传过来的,
            当数据从前端传过来的时候, 已经经过了校验, 换言之, 我们在后台获取到的数据已经是合法的了,
            如果再做校验属于二次校验, 可以做, 也可以不做, 一般不做, 具体看需求.
         */
        //s.setAge(-33);
        s.setAge(33);
        //3. 打印属性值.
        System.out.println(s.getName() + "..." + s.getAge());
        //4. 调用成员方法.
        s.study();
        s.eat();
    }
}