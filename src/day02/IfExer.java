package day02;

import java.util.Scanner;

/**
 * 大家都知道,男大当婚,女大当嫁,那么女方家长要嫁女儿,当然要提出一定的条件:身高:180cm以上;富:财富一千万以上;帅:是
 * 三个条件全满足,则:"我一定要嫁给他!!!" 三个条件有为真的情况,则:"嫁吧,比上不足,比下有余." 三个条件都不满足,则:"不嫁"
 * 
 * @author pan
 *
 */
public class IfExer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入你的身高:(cm)");
		int height = scanner.nextInt();
		System.out.println("请输入你的财富:(千万)");
		double wealth = scanner.nextDouble();

		/*
		 * 方式一: System.out.println("请输入你是否帅:(true/false)"); boolean isHandsome =
		 * scanner.nextBoolean();
		 * 
		 * if (height >= 180 && wealth >= 1 && isHandsome) {
		 * System.out.println("我一定要嫁给他!!!"); } else if (height >= 180 || wealth >= 1 ||
		 * isHandsome) { System.out.println("嫁吧,比上不足,比下有余."); } else {
		 * System.out.println("不嫁!"); }
		 */

		// 方式二:
		System.out.println("请输入你是否帅:(是/否)");
		String isHandsome = scanner.next();

		if (height >= 180 && wealth >= 1 && isHandsome.equals("是")) {
			System.out.println("我一定要嫁给他!!!");
		} else if (height >= 180 || wealth >= 1 || isHandsome.equals("是")) {
			System.out.println("嫁吧,比上不足,比下有余.");
		} else {
			System.out.println("不嫁!");
		}
	}

}
