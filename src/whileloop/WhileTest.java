package whileloop;


/**
 *  * whileѭ���ṹ��ʹ��
 * һ.ѭ���ṹ��4��Ҫ��
 * 1).��ʼ������
 * 2).ѭ������ -->��boolean����
 * 3).ѭ����
 * 4).��������
 * 
 * ��.whileѭ���Ľṹ
 * 1;
 * while(2){
 * 	3;
 * 	4;
 * }
 * 
 * ִ�й���:1-2-3-4-2-3-4-...-2
 * 
 * ˵��:
 * 1.дwhileѭ��ǧ��С�Ĳ�Ҫ���˵�������.һ������,�Ϳ��ܵ�����ѭ��.
 * 2.д����,Ҫ���������ѭ��.
 * 3.forѭ����whileѭ���ǿ����໥ת����!
 * 	����:forѭ����whileѭ���ĳ�ʼ���������ֵ����÷�Χ��ͬ.
 * 
 * �㷨:������;
 *   
 * @author pan
 *
 */
public class WhileTest {

	public static void main(String[] args) {
		
		int i=1;
		while (i<=5) {
			System.out.println("Hello world!");
			i++;
		}
		
		//����
		int num=1;
		//acbcbcb
		System.out.print("a");
		while (num<=3) {
			System.out.print("c");
			System.out.print("b");
			num++;
		}
		System.out.println();
		
		//����:����100���ڵ�ż��,�������ż���ĺ�,�Լ�ż���ĸ���
		int j=1;
		int count=0;
		int sum =0;  //��¼����ż���ĺ�
		while (j<=100) {
			if(j%2==0) {
				System.out.println(j);
				sum+=j;
				count++;
				
			}
			j++;
		}
		System.out.println("\n�ܺ�Ϊ:"+sum);
		System.out.println("ż���ĸ���Ϊ:"+count);
	}

}
