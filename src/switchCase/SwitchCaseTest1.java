package switchCase;

/**
 * switch-case����:
 * �Գɼ�����60�ֵ�,���"�ϸ�".����60�ֵ�,���"���ϸ�"
 * 
 * ˵��:���switch-case�ṹ�еĶ��case��ִ�������ͬ,����Կ��ǽ��кϲ�.
 * @author pan
 *
 */
public class SwitchCaseTest1 {

	public static void main(String[] args) {
		int score =79;
		//����
		switch (score/10) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("������");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("����");
			break;
		default:
			System.out.println("�ɼ��������");
			break;
		}
		
		//���Ž�:
		switch (score/60) {
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("����");
			break;
		default:
			System.out.println("�ɼ��������");
			break;
		}

	}

}
