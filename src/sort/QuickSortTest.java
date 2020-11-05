package sort;

/**
 * 快速排序 通过一趟排序将待排序记录分割成独立的两部分,其中一部分记录的关键字均比另一部分关键字小. 则分别对这两部分继续进行排序,直到整个序列有序.
 * 
 * @Description
 * @author pan Email:2318162429@qq.com
 * @version
 * @date 2020年11月5日下午8:25:41
 */
public class QuickSortTest {
	private static void swap(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	private static void subSort(int[] data, int start, int end) {
		if (start < end) {
			int base = data[start];
			int low = start;
			int high = end + 1;
			while (true) {
				while (low < end && data[++low] - base <= 0)
					;
				while (high > start && data[--high] - base >= 0)
					;
				if (low < high) {
					swap(data, low, high);
				} else {
					break;
				}
			}
			swap(data, start, high);
			subSort(data, start, high - 1); // 递归调用
			subSort(data, high + 1, end);
		}
	}
	
	public static void quickSort(int[] data) {
		subSort(data,0, data.length-1);
	}

	public static void main(String[] args) {
		int[] data = new int[] { 12, 32, 43, 76, 90, 889, -345, -3, -234 };
		System.out.println("排序之前:\n"+java.util.Arrays.toString(data));
		quickSort(data);
		System.out.println("排序之前:\n"+java.util.Arrays.toString(data));

	}

}
