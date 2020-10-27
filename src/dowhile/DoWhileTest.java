package dowhile;
/**
 * do-whileѭ����ʹ��
 * һ.ѭ���ṹ��4��Ҫ��
 * 1).��ʼ������
 * 2).ѭ������ -->��boolean����
 * 3).ѭ����
 * 4).��������
 * 
 * ��.whileѭ���Ľṹ
 * 1
 * do{
 * 	3;
 * 	4;
 * }while(2);
 * 
 * ִ�й���:1-3-4-2-3-4-2-...-2
 * 
 * ˵��:
 * 1.do-whileѭ�����ٻ�ִ��һ��ѭ����!
 * 2.������,ʹ��for��while����һЩ.����ʹ��do-while
 * @author pan
 *
 */
public class DoWhileTest {
	public static void main(String[] args) {
		//ѭ��100���ڵ�ż��,������ż�����ܺ�,�Լ�ż���ĸ���
		int count=0;
		int sum=0;
		int num=1;
		do {
			if(num%2==0) {
				System.out.println(num);
				sum+=num;
				count++;
			}
			num++;
		} while (num<=100);
		
		System.out.println("�ܺ�Ϊ:"+sum);
		System.out.println("ż���ĸ���Ϊ:"+count);
		
		
		/************while��do-while�Ƚ�****************/
		int num2 = 10;
		while (num2<10) {
			System.out.println("Hello:while");
			num2++;
		}
		
		do {
			System.out.println("Hello:do-while");
			num2++;
		} while (num<10);
	}
}

