package dowhile;

import java.util.Scanner;

/**
 * Ƕ��ѭ����ʹ��:
 * 1.Ƕ��ѭ��:��һ��ѭ���ṹA��������һ��ѭ���ṹB��ѭ������,�͹�����Ƕ��ѭ��
 * 2.���ѭ��:ѭ���ṹB
 * 	   �ڲ�ѭ��:ѭ���ṹA
 * 3.˵��:
 * 1).�ڲ�ѭ���ṹ����һ��,ֻ�൱�����ѭ��ѭ����ִ����һ��
 * 2).�������ѭ����Ҫִ��m��,�ڲ�ѭ����Ҫִ��n��.��ʱ�ڲ�ѭ����ѭ����һ��ִ����m*n��
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
		
		/*			i(�к�)  j(*�ĸ���)
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
		
		/*			i(�к�)  j(*�ĸ���)	����:i+j=6   ���仰˵: j=6-i
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
		//��
		
		/*			i(�к�)  j(*�ĸ���)
		   *		1		1
		  ***		2		3
		 *****		3		5
		*******		4		7
		 *****		1		5
		  ***		2		3
		   *		3		1
		*/
		//�ϰ벿��
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
		//�°벿��
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