package forloop;

import java.util.Scanner;

/**
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 * 
 * �ڲ�ѭ����������
 * ���ѭ����������
 * 
 * @author pan
 *
 */
public class ForTest4 {

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
