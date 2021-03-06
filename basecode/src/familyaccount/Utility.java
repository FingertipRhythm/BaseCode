package familyaccount;

import java.util.Scanner;

/**
 * Utility工具类: 讲不通的功能封装为方法,就是可以直接通过调用方法使用它的功能,而无需考虑具体的功能实现细节
 * 
 * @author pan
 *
 */
public class Utility {
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * 用于界面菜单的选择.该方法读取键盘,如果用户键入'1'~'4'中任意的字符,则方法返回.返回值为用户键入字符.
	 * 
	 * @return
	 */
	public static char readMenuSelection() {
		char c;
		for (;;) {
			String str = readKeyBoard(1);
			c = str.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.println("选项输入错误,请重新输入:");
			} else
				break;
		}
		return c;
	}

	/**
	 * 用于收入和支出金额的输入.该方法从键盘读入一个不超过四位长度的整数,并将其作为方法的返回值.
	 * 
	 * @return
	 */
	public static int readNumber() {
		int n;
		for (;;) {
			String str = readKeyBoard(4);
			try {
				n = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.out.println("数字输入错误,请重新输入:");
			}
		}
		return n;
	}

	/**
	 * 用于收入和支出说明的输入.该方法从键盘读取一个不超过8位长度的字符串,并将其作为方法的返回值.
	 * @return
	 */
	public static String readString() {
		String str = readKeyBoard(8);
		return str;
	}

	/**
	 * 用于确认选择的输入.该方法从键盘读取'Y'或'N',并将其作为方法的返回值.
	 * @return
	 */
	public static char readConfiguration() {
		char c;
		for(;;) {
			String str = readKeyBoard(1).toUpperCase();
			c = str.charAt(0);
			if(c=='Y' || c=='N') {
				break;
			}else {
				System.out.println("选择输入错误,请重新输入:");
			}
		}
		return c;
	}
	
	public static String readKeyBoard(int limit) {
		String line="";
		while (scanner.hasNext()){
			line=scanner.nextLine();
			if (line.length()<1||line.length()>limit){
				System.out.println("输入长度(不大于"+limit+")错误,请重新输入:");
				continue;
			}
			break;
		}
		return line;
	}

}
