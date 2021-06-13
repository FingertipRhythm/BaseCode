package array;

/**
 * 拓展:修改题目,实现array2对array1的复制
 *
 * @Description
 * @author pan Email:2318162429@qq.com
 * @version
 * @date 2020年11月5日上午10:36:17
 */
public class ArrayAlgorithmExer1 {

	public static void main(String[] args) {
		int[] array1, array2;
		array1 = new int[] { 2, 3, 5, 7, 11, 13, 17, 19 };

		// 显示array1的内容
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "  ");
		}
		System.out.println();

		// 数组的复制
		array2 = new int[array1.length];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
		}

		// 修改array2中的偶数引元素,使其等于索引值(如array[0]=0,array[2]=2)
		for (int i = 0; i < array2.length; i++) {
			if (i % 2 == 0) {
				array2[i] = i;
			}
		}
		// 显示array2的内容
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + "  ");
		}
		System.out.println();

		// 显示array1的内容
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "  ");
		}

	}

}
