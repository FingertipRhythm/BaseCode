package day02;

import java.util.Scanner;

/**
 * ��С���μ�java����,���͸�������Ⱥ��ɳ�ŵ:
 * ���
 * �ɼ�Ϊ100��ʱ,����һ̨BMW;
 * �ɼ�Ϊ(80,90]ʱ,����һ̨iPhone xs max
 * ���ɼ�Ϊ[60,80]ʱ,����һ��iPad
 * ����ʱ,ʲô����Ҳû��
 * ��Ӽ���������С������ĩ�ɼ�,�������ж�
 * 
 * ˵��:
 * 1.else�ṹ�ǿ�ѡ��
 * 2.������������ʽ:
 * 	>�������������ʽ֮����"����"��ϵ(��û�н����Ĺ�ϵ),�ĸ��жϺ�ִ��������������滹������,����ν
 *  >�������������ʽ֮�����н����Ĺ�ϵ,��Ҫ����ʵ�����,�������Ӧ�ý��ĸ��ṹ����������.
 *  >�������������ʽ֮���а����Ĺ�ϵ,ͨ�������,��Ҫ����ΧС�������ڷ�Χ�������,����,��ΧС�ľ�û�л�����
 * 
 * @author ASUS
 *
 */
public class IfTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������С������ĩ�ɼ�:(0-100)");
		int score = scanner.nextInt();
		
		if(score==100) {
			System.out.println("����һ̨BMW");
		}else if(score>80&&score<=90) {
			System.out.println("����һ̨iPhone xs max");
		}else if(score>=60&&score<=80) {
			System.out.println("����һ��iPad");
		}else {
			System.out.println("ʲô����Ҳû��");
		}
	}

}
