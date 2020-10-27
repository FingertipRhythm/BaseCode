package dowhile;
/**
 * 题目:一个数如果恰好等于他的因子之和,这个数就称为"完数".例如:6=1+2+3
 * 编程:找出1000以内的所有完数.(因子:除去这个数本身的其他约数)
 * @author pan
 *
 */
public class PerfectNumberTest {

	public static void main(String[] args) {
		int factor=0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 1; j <=i/2; j++) {
				if (i%j==0) {
					factor+=j;
				}
			}
			if (i==factor) {
				System.out.println(i);
			}
			factor=0;
		}

	}

}
