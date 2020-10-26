package switchCase;

/**
 * switch-case��ʽ
 * 
 * 1. switch(���ʽ){ case ����1: ���1; //break; case ����2: ���2; //break; ... case ����n:
 * ���n; //break; default: ���; //break; }
 * 
 * 2,˵��: 
 * 1).����switch���ʽ�е�ֵ,һ��ƥ�����case�еĳ���.һ��ƥ��ɹ�,�������Ӧ��case�ṹ��,������ִ�����.
 * 	��������ִ������Ժ�,����Ȼ��������ִ������case�ṹ�е�ִ�����,ֱ������break�ؼ��ֻ��switch-case�ṹ 
 * 	ĩβ����Ϊֹ.
 * 2).brak,����ʹ����switch-case�ṹ��,��ʾһ�� ִ�е��˹ؼ���,������switch-case�ṹ.
 * 3).switch�ṹ�еı��ʽ,ֻ�������µ�6����������֮һ:
 * 	byte,short,char,int,ö������(JDK5.0����),String����(JDK7.0����)
 * 4).case֮��ֻ����������,����������Χ
 * 5).break�ؼ����ǿ�ѡ��.
 * 6).default:�൱��if-else�ṹ�е�else.
 * 		default�ṹ�ǿ�ѡ��.����λ��������.
 * @author pan
 *
 */
public class SwitchCaseTest {

	public static void main(String[] args) {
		int number = 2;
		switch (number) {
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("there");
			break;
		default:
			System.out.println("nothing");
			break;
		}

		String season = "summer";
		switch (season) {
		case "spring":
			System.out.println("��ů����");
			break;
		case "summer":
			System.out.println("��������");
			break;
		case "autumn":
			System.out.println("�����ˬ");
			break;
		case "winter":
			System.out.println("��ѩ����");
			break;
		default:
			System.out.println("������������!");
			break;
		}

	}

}
