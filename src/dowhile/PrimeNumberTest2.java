package dowhile;

/**
 * Ƕ��ѭ����Ӧ��2:
 * 
 * 100000�����������������. ����:����,ֻ�ܱ�1����������������Ȼ��.-->��2��ʼ,�������-1����Ϊֹ,�����ܱ��������������
 * 
 * ��С��������:2 ��PrimeNumberTest.java�ļ����������������Ż�
 * 
 * @author pan
 *
 */
public class PrimeNumberTest2 {
	public static void main(String[] args) {
		int count = 0; // ��¼�����ĸ���
		// ��ȡ��ǰʱ�����1970-01-01 00:00:00 �ĺ�����
		long start = System.currentTimeMillis();

		lable:for (int i = 2; i <= 100000; i++) { // ����100000���ڵ���Ȼ��
			for (int j = 2; j <= Math.sqrt(i); j++) { // j:��iȥ��
				if (i % j == 0) { // j:��iȥ��
					continue lable;
				}
			}
			//ִ�е��˲���Ķ�������
			count++;
		}

		// ��ȡ��ǰʱ�����1970-01-01 00:00:00 �ĺ�����
		long end = System.currentTimeMillis();
		System.out.println("�����ĸ���Ϊ:" + count);
		System.out.println("�����ѵ�ʱ��:" + (end - start));

		// �Ż�ǰ:29785 20206
		// �Ż�һ:3211  1877
		// �Ż���:543 	  24
	}
}
