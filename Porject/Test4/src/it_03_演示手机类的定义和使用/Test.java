package it_03_演示手机类的定义和使用;
/*
    案例: 演示手机类的定义和使用.

    需求:
        1.定义手机类Phone.
         属性: 品牌(brand), 价格(price), 颜色(color)
         行为: 打电话(call), 发短信(sendMessage)
        2.创建测试类PhoneTest, 在类中定义main方法, 并访问手机类(Phone类)中的成员.

    PhoneTest: 手机类的测试类.3

    Phone:     具体的手机类.
 */
public class Test {
    public static void main(String[] args) {
        //需求:访问Phone类中的成员
        //1. 创建Phone类的对象
        Phone phone = new Phone();
        //2. 打印属性的值
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println("_______________________");
        //3. 设置属性的值
        phone.brand = "华为P30";
        phone.price = 99999;
        phone.color = "土豪金";

        //4. 打印属性值
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        System.out.println("_______________________");
        //5. 调用打电话的方法
        phone.call("张一山");
        phone.sendMessage("秦始皇");

    }
}
