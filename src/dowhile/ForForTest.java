package dowhile;

import java.util.Scanner;

/**
 * 嵌套循环的使用:
 * 1.嵌套循环:将一个循环结构A声明在另一个循环结构B的循环体中,就构成了嵌套循环
 * 2.外层循环:循环结构B
 * 	   内层循环:循环结构A
 * 3.说明:
 * 1).内层循环结构遍历一遍,只相当于外层循环循环体执行了一次
 * 2).假设外层循环需要执行m次,内层循环需要执行n次.此时内层循环的循环体一共执行了m*n次
 * @author pan
 *
 */
public class ForForTest {
	public static void main(String[] args) {
		//******
		for(int i=1;i<=6;i++) {
			System.out.print('*');
		}
		
		System.out.println("\n");
		
		/*
		 * ******
		 * ******
		 * ******
		 * ******
		 */
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=6 ; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("\n");
		
		/*			i(行号)  j(*的个数)
		 * *		1		1
		 * **		2		2
		 * ***		3		3
		 * ****		4		4
		 * *****	5		5
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		/*			i(行号)  j(*的个数)	规律:i+j=6   换句话说: j=6-i
		 * *****	1		5
		 * ****		2		4
		 * ***		3		3
		 * **		4		2
		 * *		5		1
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=6-i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("\n");
		
		/*
		*
		**
		***
		****
		*****
		*****
		****
		***
		**
		*
		*/
		//略
		
		/*			i(行号)  j(*的个数)
		   *		1		1
		  ***		2		3
		 *****		3		5
		*******		4		7
		 *****		1		5
		  ***		2		3
		   *		3		1
		*/
		//上半部分
		int count=0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i+count; j++) {
				System.out.print("*");
				
			}
			count++;
			System.out.println();
		}
		//下半部分
		int sum=6;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= sum-i; j++) {
				System.out.print("*");
			}
			sum--;
			System.out.println();
		}
		
	}
}
