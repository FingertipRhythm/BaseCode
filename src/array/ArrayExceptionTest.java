package array;

/**
 * 数组中的常见异常: 1.数组角标越界的异常:ArrayIndexOutOfBoundException
 * 
 * 2.空指针异常:NullPointException
 * 
 * @Description
 * @author pan Email:2318162429@qq.com
 * @version
 * @date 2020年11月5日下午10:44:32
 */
public class ArrayExceptionTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		// 1.数组角标越界的异常:ArrayIndexOutOfBoundException
		
//		for (int i = 0; i <= arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		System.out.println(arr[-2]);
		
//		System.out.println("Hello");
		
		//2.空指针异常:NullPointException
		//情况一:
//		arr=null;
//		System.out.println(arr[0]);
		
		//情况二:
//		int[][] arr2 = new int[4][];
//		System.out.println(arr2[0][0]);
		
		//情况三:
		String[] arr3 = new String[] {"AA","BB","CC"};
		arr3[0]=null;
		System.out.println(arr3[0].toString());
	}

}
