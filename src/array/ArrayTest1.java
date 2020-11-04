package array;
/**
 *  ⑤ 数组元素的默认初始化值
 *  	>数组元素是整形:0
 *  	>数组元素是浮点型:0.0
 *  	>数组元素是char型:0 或 ASCII码为0,而非'0'
 *  	>数组元素是boolean型:false
 * 
 * 		>数组元素是引用数据类型:null
 *  
 *  ⑥ 数组的内存解析
 * @Description
 * @author pan	Email:2318162429@qq.com
 * @version
 * @date 2020年10月28日下午6:03:15
 */
public class ArrayTest1 {

	public static void main(String[] args) {
		//⑤ 数组元素的默认初始化值
		int[] arr =new int[4];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*******");
		
		short[] arr1 = new short[4];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("*******");
		
		float[] arr2 = new  float[4];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("*******");
		
		char[] arr3 = new char[4];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("----"+arr3[i]+"----");
		}
		System.out.println("*******");
		if (arr3[2]==0) {
			System.out.println("你好!");
		}
		
		boolean[] arr4 = new boolean[4];
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		System.out.println("*******");
		
		String[] arr5 = new String[4];
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		System.out.println("*******");
	}
	
	

}
