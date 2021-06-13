package array;
/**
 * 一.数组的概述
 * 1.数组的理解:数组(Array),是多个相同类型数据按一定顺序排列的集合,并使用一个名字命名,并通过编号的方式对这些数据进行统一管理.
 * 
 * 2.数组相关的概念:
 * 	>数组名
 *  >元素
 *  >角标,小标,索引
 *  >索引的长度:元素的个数
 *  
 * 3.数组的特点:
 * 1)数组是有序排列的
 * 2)数组属于引用数据类型的变量.数组的元素,既可以是基本数据类型,也可以是引用数据类型.
 * 3)创建数组对象会在内存中开辟一整块连续的空间.
 * 4)数组的长度一旦确定,就不能修改.
 * 
 * 4.数组的分类:
 * 	①按照维度:一维数组,二维数组,...
 *  ②按照数组元素的类型:基本数据类型元素的数组,引用数据类型元素的数组.
 *  
 * 5.一维数组的使用
 *  ① 一维数组的声明和初始化
 *  ② 如何调用数组的指定位置的元素
 *  ③ 如何获取数组的长度
 *  ④ 如何遍历数组
 *  ⑤ 数组元素的默认初始化值 －见ArrayTest1.java
 *  ⑥ 数组的内存解析－见ArrayTest1.java
 * 
 * @Description
 * @author pan	Email:2318162429@qq.com
 * @version
 * @date 2020年10月28日下午6:03:15
 */
public class ArrayTest {

	public static void main(String[] args) {
		// ① 一维数组的声明和初始化
		int num;//声明
		num = 10;//初始化
		int id=1001;//声明+初始化
		
		int[] ids;//声明
		//1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
		ids = new int[] {1001,1002,1003,1004};
		//1.2动态初始化://数组的初始化和数组元素的赋值操作分开进行
		String[] names=new String[5];
		
		//错误写法:
//		int[] arr1 = new int[];
//		int[5] arr2 = new int[5];
//		int[] arr3 = new int[3] {1002,1003,1006};
		
		//也是正确写法
		int[] arr4 = {1,2,3,4,5}; //类型推断
		
		//总结:数组一旦初始化完成,其长度就确定了.
		
		//2.如何调用数组的指定位置的元素:通过角标的方式调用
		//数组的角标(或索引)从0开始的,到数组的长度-1结束
		names[0] = "王铭";
		names[1] = "张三";
		names[2] = "李四";
		names[3] = "王五";
		names[4] = "赵六";
//		names[5] = "田七";
		
		//3.如何获取数组的长度.
		//属性:length
		System.out.println(names.length);
		System.out.println(ids.length);
		
		//4.如何遍历数组
		/*
		 * System.out.println(names[0]); System.out.println(names[1]);
		 * System.out.println(names[2]); System.out.println(names[3]);
		 * System.out.println(names[4]);
		 */	
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String str : names) {
			System.out.println(str);
		}
	}
	
	

}
