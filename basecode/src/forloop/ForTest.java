package forloop;

import java.util.Scanner;

/**
 * for循环结构的使用
 * 一.循环结构的4个要素
 * 1).初始化条件
 * 2).循环条件 -->是boolean类型
 * 3).循环体
 * 4).迭代条件
 * 
 * 二.for循环的结构
 * for(1;2;4){
 * 		3
 * }
 * 
 * 执行过程:1-2-3-4-2-3-4-...-2
 * 
 * @author ASUS
 *
 */
public class ForTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello world!");
		}
		//i:在for循环内有效,出了for循环就失效了
		
		//测试
		int num=1;
		for (System.out.print("a"); num <= 3;System.out.print("b"), num++) {
			System.out.print("c");
		}
		//acbcbcb
		
		System.out.println();
		
		//例题:遍历100以内的偶数,输出所有偶数的和,以及偶数的个数
		int count=0;
		int sum =0;  //记录所有偶数的和
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				System.out.print(i+"\t");
				sum+=i;
				count++;
			}
		}
		System.out.println("\n总和为:"+sum);
		System.out.println("偶数的个数为:"+count);
	}

}
