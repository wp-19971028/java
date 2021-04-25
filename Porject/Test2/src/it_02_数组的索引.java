import org.w3c.dom.ls.LSOutput;

/*

        数据类型[] 变量名 = new 数据类型[存储元素的个数];

           数据类型: 数组中存储元素的数据类型
           [] 表示数组的意思
           变量名  自定义标识符

           new  创建容器关键字
           数据类型: 数组中存储元素的数据类型
           []  表示数组的意思
           元素个数,就是数组中,可以存储多少个数据 (恒定, 定长)

         数组是一个容器: 存储到数组中的每个元素,都有自己的自动编号
         自动编号,最小值是0, 最大值,长度-1
         自动编号专业名次, 索引(index), 下标, 角标
         访问数组存储的元素,必须依赖于索引, 公式 数组名[索引]

         Java提供一个属性,操作索引的
         数组的一个属性,就是数组的长度, 属性的名字 length
         使用属性:  数组名.length  数据类型 int

         数组的最小索引是0, 最大索引数组.length-1
 */
public class it_02_数组的索引 {
    public static void main(String[] args) {
        //定义数组,存储整数,容器长度, 3个
        // 数据类型[] 变量名 = new 数据类型[存储元素的个数];
        int[] arr = new int[3];
        System.out.println(arr);
        //通过索引的方式,数组中的三个元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr.length);
    }
}
