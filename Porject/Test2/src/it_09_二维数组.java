/*
    二维数组
      数组中的数组,数组里面存储的还是数组

    定义方式和一维数组很相似

    int[][] arr = new int[3][4];
    定义一个二维数组
    [3]  表示: 二维数组中,有三个一维数组
    [4]  表示: 三个一维数组中,每个数组的长度是4
*/
public class it_09_二维数组 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println(arr);

        System.out.println(arr[1]);
        System.out.println(arr[2][3]);
        /*
     int[][] arr = new int[3][] 不推荐
     二维数组中定义三个一维数组,每个一维数组长度,没有指定
     arr[0]
     arr[1]
     arr[2]
     必须要new
       arr[0] = new int[5];
       arr[1] = new int[4];

     最简单的二维数组定义方式
       int[][] arr = { {1,4} ,{3,6,8}, {0,9,8} };
    */
        int[][] arr2 = { {1,2,3},{4,5},{6,7,8,9},{0} };

        //问题: 打印7,是数组中的元素0

        System.out.println(arr2[2][1]);

        //问题: 输出结果
        System.out.println(arr2[3][0]);
    }
}
