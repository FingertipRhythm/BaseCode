package oop.oop2;

/**
 * 自定义数组工具类
 */
public class ArraysUtil {
    //求数组的最大值
    public int getMax(int[] arr){
        int maxValue=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue<arr[i]){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
    //求数组的最小值
    public int getMin(int[] arr){
        int minValue=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minValue>arr[i]){
                minValue=arr[i];
            }
        }
        return minValue;
    }
    //其数组的总和
    public int getSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    //求数组的平均值
    public int getAvg(int[] arr){
        int avg = getSum(arr)/arr.length;
        return avg;
    }

    //如下的两个重名方法构成了重载:
    //反转数组
    public void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }

    public void reverse(String[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            String temp = arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
    
    //复制数组
    public  int[] copy(int[] arr){
        int[] arrCopy=new int[arr.length];
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i]=arr[i];
        }
        return arrCopy;
    }
    //数组排序
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
//                    int  temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
                    //错误的:
//                    swap(arr[j],arr[j+1]);
                    //正确的
                    swap(arr,j,j+1);
                }
            }
        }
    }
    //错误的:交换数组中指定两个位置元素的值:
//    public void swap(int m,int n){
//        int temp = m;
//        m=n;
//        n=temp;
//    }

    //正确的:交换数组中指定两个位置元素的值:
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    //遍历数组
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    //查找数组
    public int getIndex(int[] arr,int dest){
        //线性查找:
        for (int i = 0; i < arr.length; i++) {
            if (dest==arr[i]){
                return i;
            }
        }
        return -1; //返回一个负数,表示没有找到
    }
}
