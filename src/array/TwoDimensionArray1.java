package array;
/**
 * 二维数组的使用
 * 	规定:二维数组分为外层数组的元素,内层数组的元素
 * 		int[][] arr = new int[4][3];
 * 		外层元素:arr[0],arr[i];
 * 		内层元素:arr[0][0],arr[1][2]等
 * 
 *  ⑤ 数组元素的默认初始化值
 *  针对于初始化方式一:比如:int[][] arr = new int[4][3];
 *  	外层元素的初始化值为:地址值
 *  	内层元素的初始化值为:与一维数组初始化情况相同
 *  针对于初始化方式一:比如:int[][] arr = new int[4][];
 *  	外层元素的初始化值为:null
 *  	内层元素的初始化值为:不能调用,否则报错
 *  
 *  ⑥ 数组的内存解析
 *  
 * 
 * @Description
 * @author pan	Email:2318162429@qq.com
 * @version
 * @date 2020年11月4日下午4:47:28
 */
public class TwoDimensionArray1 {

	public static void main(String[] args) {
		//5.数组元素的默认初始化值
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);  //[I@3d24753a   地址值
		System.out.println(arr[0][0]); //0
//		System.out.println(arr);  //[[I@59a6e353  地址值
		System.out.println("********");
		
		float[][] arr1 = new float[4][3];
		System.out.println(arr1[0]);  //[F@59a6e353   地址值
		System.out.println(arr1[0][0]); //0.0
		System.out.println("********");
		
		String[][] arr2 = new String[4][3];
		System.out.println(arr2[0]);  //[Ljava.lang.String;@7a0ac6e3   地址值
		System.out.println(arr2[0][0]); //null
		System.out.println("********");
		
		double[][] arr3 = new double[4][];
		System.out.println(arr3[1]); //null
		System.out.println(arr3[1][0]); //java.lang.NullPointerException
		
		//6. 数组的内存解析
	}

}
