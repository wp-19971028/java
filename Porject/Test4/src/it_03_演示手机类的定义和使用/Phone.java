package it_03_演示手机类的定义和使用;
// 自定义手机类
public class Phone {
    //属性: 品牌(brand), 价格(price), 颜色(color)
    String brand;           //品牌
    int price;              //价格
    String color;           //颜色

    // 行为: 打电话(call)
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }
    // 行为: 发短信(sendMessage)
    public void sendMessage(String name){
        System.out.println("给"+name+"发短信");
    }

}
