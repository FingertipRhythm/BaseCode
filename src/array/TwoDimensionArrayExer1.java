package array;
/**
 *  使用二维数组打印一个10行杨辉三角
 *  
 *  [提示]
 *  1.第一行有1个元素,第n行有n个元素
 *  2.每一行的第一个元素和最后一个元素都是1
 *  3.从第三行开始,对于非第一个元素和最后一个元素的元素.即:
 *  yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
 * 
 * @Description
 * @author pan	Email:2318162429@qq.com
 * @version
 * @date 2020年11月4日下午4:47:28
 */
public class TwoDimensionArrayExer1 {

	public static void main(String[] args) {
		//1.声明并初始化二维数组
		int[][] yanghui = new int[10][];
		
		//2.给数组的元素赋值
		for (int i = 0; i < yanghui.length; i++) {
			yanghui[i] = new int[i+1];
			
			//2.1给首末元素赋值
			yanghui[i][0]= yanghui[i][i]=1;
			//2.2给每行的非首末元素赋值
//			if(i>1) {
				for (int j = 1; j < yanghui[i].length-1; j++) {
					yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
				}
//			}
		}
		
		//3.遍历二维数组
		for (int i = 0; i < yanghui.length; i++) {
			for (int j = 0; j < yanghui[i].length; j++) {
				System.out.print(yanghui[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
