package array;
/**
 *  
 * 
 * @Description
 * @author pan	Email:2318162429@qq.com
 * @version
 * @date 2020年11月4日下午4:47:28
 */
public class TwoDimensionArrayExer {

	public static void main(String[] args) {
		int[][] arr = new int[][] {{3,5,8},{12,9},{7,0,6,4}};
		int sum=0;//记录总和
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
