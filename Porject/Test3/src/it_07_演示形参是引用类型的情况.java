/*
    案例: 演示形参是引用类型的情况.

    结论:
        如果是引用类型作为形参: 传递的是地址值, 所以形参的改变直接影响实参.
        String类型除外, 当它充当形参类型的时候, 传递的是数值, 即: 用法和基本类型一致.
 */
public class it_07_演示形参是引用类型的情况 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};           //地址值: 0x001
        System.out.println("调用change方法前：" + arr[1]);        //20
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);        //200
    }

    public static void change(int[] arr) {  //地址值: 0x001
        arr[1] = 200;
    }
}
