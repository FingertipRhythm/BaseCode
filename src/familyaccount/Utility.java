package familyaccount;

import java.util.Scanner;

/**
 * Utility������: ����ͨ�Ĺ��ܷ�װΪ����,���ǿ���ֱ��ͨ�����÷���ʹ�����Ĺ���,�����迼�Ǿ���Ĺ���ʵ��ϸ��
 * 
 * @author pan
 *
 */
public class Utility {
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * ���ڽ���˵���ѡ��.�÷�����ȡ����,����û�����'1'~'4'��������ַ�,�򷽷�����.����ֵΪ�û������ַ�.
	 * 
	 * @return
	 */
	public static char readMenuSelection() {
		char c;
		for (;;) {
			String str = readKeyBoard();
			c = str.charAt(0);
			if (c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.println("ѡ���������,����������:");
			} else
				break;
		}
		return c;
	}

	/**
	 * ���������֧����������.�÷����Ӽ��̶���һ����������λ���ȵ�����,��������Ϊ�����ķ���ֵ.
	 * 
	 * @return
	 */
	public static int readNumber() {
		int n;
		for (;;) {
			String str = readKeyBoard();
			try {
				n = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.out.println("�����������,����������:");
			}
		}
		return n;
	}

	/**
	 * ���������֧��˵��������.�÷����Ӽ��̶�ȡһ��������8λ���ȵ��ַ���,��������Ϊ�����ķ���ֵ.
	 * @return
	 */
	public static String readString() {
		String str = readKeyBoard();
		return str;
	}

	/**
	 * ����ȷ��ѡ�������.�÷����Ӽ��̶�ȡ'Y'��'N',��������Ϊ�����ķ���ֵ.
	 * @return
	 */
	public static char readConfiguration() {
		char c;
		for(;;) {
			String str = readKeyBoard().toUpperCase();
			c = str.charAt(0);
			if(c=='Y' || c=='N') {
				break;
			}else {
				System.out.println("ѡ���������,����������:");
			}
		}
		return c;
	}
	
	public static String readKeyBoard() {
		String str;
		str = scanner.next();
		return str;
	}

}
