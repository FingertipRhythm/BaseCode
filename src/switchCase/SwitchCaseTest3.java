package switchCase;

import java.util.Scanner;

/**
 * switch-case����: �Ӽ��̷ֱ�������,��,��,�ж���һ���ǵ���ĵڼ��� ע:�ж�һ���Ƿ�������ı�׼: 1).���Ա�4����,�������Ա�100����
 * 2).���Ա�400����
 * 
 * ˵��:
 * 1.���ǿ���ʹ��switch-case�Ľṹ,������ת��Ϊif-else.��֮,������.
 * 2.������Щ��֧�ṹʱ,�����ּ�����ʹ��switch-case(ͬʱ,switch�б��ʽ��ȡֵ�����̫��),
 * 	�ֿ���ʹ��if-elseʱ,��������ѡ��ʹ��switch-case.ԭ��:switch-caseִ��Ч���Ը�.
 * @author pan
 *
 */
public class SwitchCaseTest3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������2019���year:");
		int year = scanner.nextInt();
		System.out.println("������2019���month:");
		int month = scanner.nextInt();
		System.out.println("������2019���day:");
		int day = scanner.nextInt();

		// ����һ������������������
		int sumDays = 0;

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
			//�ж�year�Ƿ�Ϊ����
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				sumDays += 29;
			}else {
				sumDays += 28;
			}
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;
		}

		System.out.println(year+"��" + month + "��" + day + "���ǵ���ĵ�" + sumDays + "��");
	}

}
