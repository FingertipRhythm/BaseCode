package dowhile;


/**
 * Ƕ��ѭ����Ӧ��2:
 * 
 * 100�����������������.
 * ����:����,ֻ�ܱ�1����������������Ȼ��.-->��2��ʼ,�������-1����Ϊֹ,�����ܱ��������������
 * 
 * ��С��������:2
 * @author pan
 *
 */
public class PrimeNumberTest {
	public static void main(String[] args) {
		boolean isFlag=true; //��ʶi�Ƿ�j����,һ������,�޸���ֵ
		for (int i = 2; i <= 100; i++) { //����100���ڵ���Ȼ��
			for (int j = 2; j < i; j++) { //j:��iȥ��
				if(i%j==0) { //j:��iȥ��
					isFlag=false;
				}
			}
			
			if(isFlag==true) {
				System.out.println(i);
			}
			//����isFlag
			isFlag=true;
		}
		
	}
}
