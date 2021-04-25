/*
    数组遍历:
      将所有的数组元素,全获取
      依靠索引, 规律从0开始,一直在自动增长1, 到达length-1
      循环来实现
        for    知道循环次数, 计数器思想
        while  不确定循环次数
*/
public class it_03_数组的遍历 {
    public static void main(String[] args) {
        int arr[] = {2,1,3,5,7,0,4};
        // for 循环遍历
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.println("***********************************");
        // foreach 遍历
        for (int a:arr) {
            System.out.print(a + "\t");
        }
    }

}
