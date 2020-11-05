package sort;
/**
 * 数组的冒泡排序的实现
 * 
 * @Description
 * @author pan	Email:2318162429@qq.com
 * @version
 * @date 2020年11月5日下午7:58:40
 */
public class BubbleSortTest {

	public static void main(String[] args) {
		int[] arr = new int[] {12,32,43,76,90,889,-345,-3,-234};
		
		//冒泡排序
		int temp=0;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
