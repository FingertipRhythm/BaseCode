package ifElse;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		// ���㹷��������
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����빷��������:");
		int dogAge = scanner.nextInt();
		if (dogAge > 0 && dogAge <= 2) {
			System.out.println("�൱���˵�����" + (dogAge * 10.5));
		} else if (dogAge > 2) {
			System.out.println("�൱���˵�����" + (2 * 10.5 + (dogAge - 2) * 4));
		} else {
			System.out.println("������û�г�����");
		}

	}

}
