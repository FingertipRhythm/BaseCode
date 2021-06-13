package array;

/**
 * 算法的考查:数组的复制,反转,查找(线性查找,二分法查找)
 * 
 * @Description
 * @author pan Email:2318162429@qq.com
 * @version
 * @date 2020年11月5日上午10:36:17
 */
public class ArrayAlgorithm1 {

	public static void main(String[] args) {
		String[] arr = new String[] { "java", "c", "c#", "php" };

		// 数组的复制(区别于数组变量的赋值:arr1=arr)
		String[] arr1 = new String[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}

		// 数组的反转
		// 方法一:
//		String temp;
//		for (int i = 0; i < arr.length/2; i++) {
//			temp = arr[i];
//			arr[i]=arr[arr.length-i-1];
//			arr[arr.length-i-1]=temp;
//		}
//		//方法二:
//		for (int i = 0,j=arr.length-1;i<j; i++,j--) {
//			temp = arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
//		}
//		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println();

		// 查找(或搜索)
		// 线性查找:
		String dest = "java";
		boolean isFlag = true;
		for (int i = 0; i < arr.length; i++) {
			if (dest.equals(arr[i])) {
				System.out.println("找到了指定元素,位置为:" + i);
				isFlag = false;
				break;
			}
		}
		if (isFlag) {
			System.out.println("很遗憾,没有找到哦!");
		}
		// 二分法查找(熟悉):
		// 前提:所要查找的数组必须有序
		int[] arr2 = new int[] { -989, -223, -123, 0, 54, 89, 234, 977 };
		int dest1 = -123;
		int head = 0;// 初始的首索引
		int end = arr2.length - 1;// 初始的末索引
		boolean isFlag1 = true;
		while (head <= end) {
			int middle = (head + end) / 2;
			if (dest1 == arr2[middle]) {
				System.out.println("找到指定元素,位置为:" + middle);
				isFlag1=false;
				break;
			} else if (arr2[middle] > dest1) {
				end = middle - 1;
			} else {
				head = middle + 1;
			}
		}
		if (isFlag1) {
			System.out.println("很遗憾,没有找到哦!");
		}

	}

}
