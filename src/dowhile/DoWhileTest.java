package dowhile;
/**
 * do-while循环的使用
 * 一.循环结构的4个要素
 * 1).初始化条件
 * 2).循环条件 -->是boolean类型
 * 3).循环体
 * 4).迭代条件
 * 
 * 二.while循环的结构
 * 1
 * do{
 * 	3;
 * 	4;
 * }while(2);
 * 
 * 执行过程:1-3-4-2-3-4-2-...-2
 * 
 * 说明:
 * 1.do-while循环至少会执行一次循环体!
 * 2.开发中,使用for和while更多一些.较少使用do-while
 * @author pan
 *
 */
public class DoWhileTest {
	public static void main(String[] args) {
		//循环100以内的偶数,并计算偶数的总和,以及偶数的个数
		int count=0;
		int sum=0;
		int num=1;
		do {
			if(num%2==0) {
				System.out.println(num);
				sum+=num;
				count++;
			}
			num++;
		} while (num<=100);
		
		System.out.println("总和为:"+sum);
		System.out.println("偶数的个数为:"+count);
		
		
		/************while和do-while比较****************/
		int num2 = 10;
		while (num2<10) {
			System.out.println("Hello:while");
			num2++;
		}
		
		do {
			System.out.println("Hello:do-while");
			num2++;
		} while (num<10);
	}
}

