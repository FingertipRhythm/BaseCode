package forloop;

import java.util.Scanner;

/**
 * ��Ŀ:��������������m��n,�������Լ������С������
 * ����:12��20�����Լ����4,��С��������60
 * ˵��:break�ؼ��ֵ�ʹ��
 * 
 * @author ASUS
 *
 */
public class ForTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������һ��������:");
		int m = scanner.nextInt();
		System.out.println("������ڶ���������:");
		int n = scanner.nextInt();
		
		//��ȡ���Լ��
		//��ȡ�������еĽ�Сֵ
		int min=(m<=n)?m:n;
		for (int i = min; i >= 1; i--) {
			if (m%i==0 && n%i==0) {
				System.out.println("���Լ��Ϊ:"+i);
				break;//һ����ѭ����ִ�е�break,������ѭ��
			}
		}
		
		//��ȡ��С������
		//��ȡ�������еĽϴ�ֵ
		int max = (m>=n)?m:n;
		for (int i = max; i < m*n; i++) {
			if (i%m==0 && i%n==0) {
				System.out.println("��С������Ϊ:"+i);
				break;
			}
		}
	}

}
