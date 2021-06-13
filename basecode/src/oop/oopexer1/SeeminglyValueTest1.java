package oop.oopexer1;

/**
 * 定义一个int型数组:int[] arr = new int[]{12,3,3,34,56,77,432};
 * 让数组的每个位置上的值除去以首位置的元素,得到的结果,作为该位置上的新值.遍历新的数组.
 */
public class SeeminglyValueTest1 {
    public static void main(String[] args) {
        int[] arr = new int[]{12,3,3,34,56,77,432};
        //错误写法:
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=arr[i]/arr[0];
//        }
        //正确写法1
//        for (int i = arr.length-1; i >= 0; i--) {
//            arr[i]=arr[i]/arr[0];
//        }
        //正确写法2
        int temp=arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]/temp;
        }
        print(arr);
    }

    public static void print(int[] arr){
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }
}
