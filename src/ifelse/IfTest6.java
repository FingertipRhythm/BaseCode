package ifElse;

public class IfTest6 {

	public static void main(String[] args) {
		// 如何回去一个随机数: 10-99(两位数)
		int value = (int) (Math.random() * 90 + 10); // [0.0,1.0) -> [0.0,90.0) -> [10.0,100.0) -> [10,99]

		// 公式:[a,b]: (int)(Math.random()*(b-a+1)+a);

		System.out.println(value);
	}

}
