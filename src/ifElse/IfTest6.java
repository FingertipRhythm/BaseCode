package ifElse;

public class IfTest6 {

	public static void main(String[] args) {
		// ��λ�ȥһ�������: 10-99(��λ��)
		int value = (int) (Math.random() * 90 + 10); // [0.0,1.0) -> [0.0,90.0) -> [10.0,100.0) -> [10,99]

		// ��ʽ:[a,b]: (int)(Math.random()*(b-a+1)+a);

		System.out.println(value);
	}

}
