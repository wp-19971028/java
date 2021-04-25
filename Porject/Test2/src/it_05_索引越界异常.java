/*
    案例: 演示使用数组时的两个小问题.

    问题一:  数组索引越界异常(ArrayIndexOutOfBoundsException)
        问题描述:
            数组的长度为2, 但是我们却访问了数组中的第3个元素, 此时代码就有问题了, 会报: 数组索引越界异常(ArrayIndexOutOfBoundsException)
        产生原因:
            你访问了数组中不存在的元素.
        解决方案:
            访问数组中存在的元素即可.
 */
public class it_05_索引越界异常 {
    public static void main(String[] args) {
        //1.定义int类型的数组, 存储元素11, 22.
        //int[] arr = new int[]{11, 22};
        int[] arr = {11, 22};                                                                //int a = 10;
        arr = new int[]{1, 2, 3, 4, 5};              //a = 20;
        //arr = {1, 2, 3, 4, 5, 6};         //这样写会报错, 静态初始化的 语法糖只有在定义数组的时候有效.

        //2.打印数组中的第2个元素.
        System.out.println(arr[1]);         //22

        //3.尝试打印数组中的第3个元素.
        System.out.println(arr[2]);         //数组索引越界异常(ArrayIndexOutOfBoundsException)
    }
}