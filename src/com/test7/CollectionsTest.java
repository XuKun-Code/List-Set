package com.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {
/*
 * 将要完成
 * 1、通过collections.sort()方法，对Interger泛型的list进行排序；
 * 2、对String 泛型的List进行排序；
 * 3、对其他类型泛型的List进行排序,以student为例。
 */
	
	/**
	 * * 1、通过collections.sort()方法，对Interger泛型的list进行排序；
	 * 创建一个Integer泛型的List，插入十个100以内的不重复随机整数，
	 * 调用 collections.sort()方法对其进行排序
	 * @param args
	 */
	public void testSort1() {
		//不能使用基本类型作为泛型,用包装类。
		List<Integer> integerList=new ArrayList<Integer>();
		Random rd=new Random();
		Integer k;
		for(int i=0;i<10;i++) {
			do {
				k=rd.nextInt(100);
			} while (integerList.contains(k));  //查看integerList中是否包含K
			integerList.add(k);
			System.out.println("成功添加整数"+k);
		}
		System.out.println("-------排序前---------");
		for (Integer integer : integerList) {
			System.out.println(integer);
		}
		Collections.sort(integerList);
		System.out.println("-------排序后---------");
		for (Integer integer : integerList) {
			System.out.println(integer);
		}
	}
	
	/**
	 * 对String 泛型的List进行排序；
	 * @param args
	 */
	 public void testSort2() {
		 List<String> stringList=new ArrayList<String>();
		 stringList.add("dfsflj");
		 stringList.add("dfsf");
		 stringList.add("dfs");
		 System.out.println("-------排序前---------");
		 for (String string : stringList) {
			System.out.println(string);
		}
		 Collections.sort(stringList);
		 System.out.println("-------排序后---------");
		 for (String string : stringList) {
			System.out.println(string);
		}
	 }
	public static void main(String[] args) {
		CollectionsTest  cT=new CollectionsTest();
		cT.testSort2();		
		//cT.testSort1();
	}
}
