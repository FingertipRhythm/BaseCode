package array;
/**
 *  创建一个长度为6的int型数组,要求取值为1-30,同时元素值各不相同
 * 
 * @Description
 * @author pan	Email:2318162430@qq.com
 * @version
 * @date 2020年11月4日下午4:47:28
 */
public class TwoDimensionArrayExer2 {

	public static void main(String[] args) {
//		//1.声明并初始化一维数组
//		int[] arr = new int[6];
//		int num = (int)(Math.random()*30+1);
//		System.out.println(num);
//		//2.给数组的元素赋值
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=(int)(Math.random()*30+1);
//			for (int j = 1; j < i; j++) {
//				if (arr[i]==arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		
//		//3.遍历二维数组
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//方式一:
		int[] arr1 = new int[6];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=(int)(Math.random()*30+1);
			boolean flag =false;
			while (true) {
				for (int j = 1; j < i; j++) {
					if (arr1[i]==arr1[j]) {
						flag = true;
						break;
					}
				}
				if (flag) {
					arr1[i]=(int)(Math.random()*30+1);
					flag = false;
					continue;
				}else {
					break;
				}
			}
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
			
	}

}
