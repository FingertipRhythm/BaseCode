package day02;

import java.util.Scanner;

/**
 * ��Ҷ�֪��,�д󵱻�,Ů�󵱼�,��ôŮ���ҳ�Ҫ��Ů��,��ȻҪ���һ��������:���:180cm����;��:�Ƹ�һǧ������;˧:��
 * ��������ȫ����,��:"��һ��Ҫ�޸���!!!" ����������Ϊ������,��:"�ް�,���ϲ���,��������." ����������������,��:"����"
 * 
 * @author pan
 *
 */
public class IfExer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("������������:(cm)");
		int height = scanner.nextInt();
		System.out.println("��������ĲƸ�:(ǧ��)");
		double wealth = scanner.nextDouble();

		/*
		 * ��ʽһ: System.out.println("���������Ƿ�˧:(true/false)"); boolean isHandsome =
		 * scanner.nextBoolean();
		 * 
		 * if (height >= 180 && wealth >= 1 && isHandsome) {
		 * System.out.println("��һ��Ҫ�޸���!!!"); } else if (height >= 180 || wealth >= 1 ||
		 * isHandsome) { System.out.println("�ް�,���ϲ���,��������."); } else {
		 * System.out.println("����!"); }
		 */

		// ��ʽ��:
		System.out.println("���������Ƿ�˧:(��/��)");
		String isHandsome = scanner.next();

		if (height >= 180 && wealth >= 1 && isHandsome.equals("��")) {
			System.out.println("��һ��Ҫ�޸���!!!");
		} else if (height >= 180 || wealth >= 1 || isHandsome.equals("��")) {
			System.out.println("�ް�,���ϲ���,��������.");
		} else {
			System.out.println("����!");
		}
	}

}
