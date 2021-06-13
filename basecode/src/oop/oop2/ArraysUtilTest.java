package oop.oop2;

import java.util.SortedMap;

public class ArraysUtilTest {
    public static void main(String[] args) {
        ArraysUtil util = new ArraysUtil();
        int[] arr = new int[]{23,54,6,1,0,-23,56,23};
        int max = util.getMax(arr);
        System.out.println("最大值为:"+max);

        System.out.println("排序前:");
        util.print(arr);

        util.sort(arr);
        System.out.println("排序后:");
        util.print(arr);

//        System.out.println("查找:");
//        int index = util.getIndex(arr,-2);
//        if (index>=0){
//            System.out.println("找到了,索引地址为:"+index);
//        }else{
//            System.out.println("未找到");
//        }
    }
}
