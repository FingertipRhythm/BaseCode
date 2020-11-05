package arrays;

import java.util.Arrays;

/**
 * java.util.Arrays:操作数组的工具类,里面定义了很多操作数组的方法
 * 
 * @Description
 * @author pan	Email:2318162429@qq.com
 * @version
 * @date 2020年11月5日下午9:20:18
 */
public class ArraysTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 1,2,3,4 };
		int[] arr1 = new int[] { 4,3,2,1 };
		
		// 1.boolean equals(int[] a,int[] b)
		boolean isEquals = Arrays.equals(arr, arr1);
		System.out.println(isEquals);
		
		// 2.Stirng toString(int[] a)
		System.out.println(Arrays.toString(arr));
		
		// 3.void fill(int[] a,int val)
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		// 4.void sort(int[] a)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 5.int binarySearch(int[] a,int key)
		int[] arr3 = new int[]{-23,-2,0,3,5,7,45,76,234};
		int search = Arrays.binarySearch(arr3, 45);
		System.out.println(search);
	}

}
