package forloop;

import java.util.Scanner;

/**
 * ��Ŀ:���е�ˮ�ɻ���.��ν��ˮ�ɻ�����ָ,һ��3λ��,�����λ�����������͵����䱾��.
 * eg:153 = 1*1*1+5*5*5+3*3*3;
 * 
 * @author ASUS
 *
 */
public class ForTest3 {

	public static void main(String[] args) {
		int bai = 0;
		int shi = 0;
		int ge  = 0;
		int s =0;
		for (int i = 100; i < 1000; i++) {
			bai = i/100;
			shi = i%100/10;
			ge  = i%10;
			s=bai*bai*bai+ge*ge*ge+shi*shi*shi;
			if (i==s) {
				System.out.println(s);
			}
		}
	}

}
