package switchcase;

import java.util.Scanner;

/**
 * switch-case例题: 从键盘上输入2019年的"month"和"day",要求通过程序输出输入的日期为2019年的第几天
 * 
 * 说明:break在switch-case中是可选的
 * 
 * @author pan
 *
 */
public class SwitchCaseTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入2019年的month:");
		int month = scanner.nextInt();
		System.out.println("请输入2019年的day:");
		int day = scanner.nextInt();

		// 定义一个变量来保存总天数
		int sumDays = 0;
		/*
		 * 方式一:冗余
		 * if (month == 1) { sumDays = day; } else if (month == 2) { sumDays = 31 + day;
		 * } else if(month == 3){ sumDays = 31 + 28 + day; }
		 */
		
		switch (month) {
		case 12:
			sumDays += 30;
		case 11:
			sumDays += 31;
		case 10:
			sumDays += 30;
		case 9:
			sumDays += 31;
		case 8:
			sumDays += 31;
		case 7:
			sumDays += 30;
		case 6:
			sumDays += 31;
		case 5:
			sumDays += 30;
		case 4:
			sumDays += 31;
		case 3:
			sumDays += 28;
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}
		
		System.out.println("2019年"+month+"月"+day+"日是当年的第"+sumDays+"天");
	}

}
