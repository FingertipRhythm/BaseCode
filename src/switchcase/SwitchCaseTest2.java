package switchcase;

import java.util.Scanner;

/**
 * switch-case����: �Ӽ���������2019���"month"��"day",Ҫ��ͨ������������������Ϊ2019��ĵڼ���
 * 
 * ˵��:break��switch-case���ǿ�ѡ��
 * 
 * @author pan
 *
 */
public class SwitchCaseTest2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������2019���month:");
		int month = scanner.nextInt();
		System.out.println("������2019���day:");
		int day = scanner.nextInt();

		// ����һ������������������
		int sumDays = 0;
		/*
		 * ��ʽһ:����
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
		
		System.out.println("2019��"+month+"��"+day+"���ǵ���ĵ�"+sumDays+"��");
	}

}
