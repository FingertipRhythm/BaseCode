package dowhile;

import java.util.Scanner;

/**
 * ��Ŀ:�Ӽ��̶��������ȷ��������,���ж϶���������͸����ĸ���,����Ϊ0ʱ����
 * 
 * ˵��:
 * 1.����ѭ�������������ƴ����Ľṹ: for(;;) �� while(true)
 * 2.����ѭ���м��ַ�ʽ?
 * 	��ʽһ:ѭ���������ַ���false
 * 	��ʽ��:��ѭ������,ִ��break
 * 
 * @author pan
 *
 */
public class ForWhileTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int positiveNumber = 0;// ��¼�����ĸ���
		int negativeNumber = 0;// ��¼�����ĸ���
		
		for(;;) {//while (true) {
			num = scanner.nextInt();
			//�ж�num���������
			if(num>0) {
				positiveNumber++;
			}else if (num<0) {
				negativeNumber++;
			} else {
				//һ��ִ��break,����ѭ��
				break;
			}
		}
		System.out.println("�����ĸ���Ϊ:"+positiveNumber);
		System.out.println("�����ĸ���Ϊ:"+negativeNumber);
	}
}
