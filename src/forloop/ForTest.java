package forloop;

import java.util.Scanner;

/**
 * forѭ���ṹ��ʹ��
 * һ.ѭ���ṹ��4��Ҫ��
 * 1).��ʼ������
 * 2).ѭ������ -->��boolean����
 * 3).ѭ����
 * 4).��������
 * 
 * ��.forѭ���Ľṹ
 * for(1;2;4){
 * 		3
 * }
 * 
 * ִ�й���:1-2-3-4-2-3-4-...-2
 * 
 * @author ASUS
 *
 */
public class ForTest {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello world!");
		}
		//i:��forѭ������Ч,����forѭ����ʧЧ��
		
		//����
		int num=1;
		for (System.out.print("a"); num <= 3;System.out.print("b"), num++) {
			System.out.print("c");
		}
		//acbcbcb
		
		System.out.println();
		
		//����:����100���ڵ�ż��,�������ż���ĺ�,�Լ�ż���ĸ���
		int count=0;
		int sum =0;  //��¼����ż���ĺ�
		for (int i = 1; i <= 100; i++) {
			if(i%2==0) {
				System.out.print(i+"\t");
				sum+=i;
				count++;
			}
		}
		System.out.println("\n�ܺ�Ϊ:"+sum);
		System.out.println("ż���ĸ���Ϊ:"+count);
	}

}
