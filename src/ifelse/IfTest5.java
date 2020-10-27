package ifelse;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		// 测算狗狗的年龄
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入狗狗的年龄:");
		int dogAge = scanner.nextInt();
		if (dogAge > 0 && dogAge <= 2) {
			System.out.println("相当于人的年龄" + (dogAge * 10.5));
		} else if (dogAge > 2) {
			System.out.println("相当于人的年龄" + (2 * 10.5 + (dogAge - 2) * 4));
		} else {
			System.out.println("狗狗还没有出生呢");
		}

	}

}
