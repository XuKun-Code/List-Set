package com.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {
/*
 * ��Ҫ���
 * 1��ͨ��collections.sort()��������Interger���͵�list��������
 * 2����String ���͵�List��������
 * 3�����������ͷ��͵�List��������,��studentΪ����
 */
	
	/**
	 * * 1��ͨ��collections.sort()��������Interger���͵�list��������
	 * ����һ��Integer���͵�List������ʮ��100���ڵĲ��ظ����������
	 * ���� collections.sort()���������������
	 * @param args
	 */
	public void testSort1() {
		//����ʹ�û���������Ϊ����,�ð�װ�ࡣ
		List<Integer> integerList=new ArrayList<Integer>();
		Random rd=new Random();
		Integer k;
		for(int i=0;i<10;i++) {
			do {
				k=rd.nextInt(100);
			} while (integerList.contains(k));  //�鿴integerList���Ƿ����K
			integerList.add(k);
			System.out.println("�ɹ��������"+k);
		}
		System.out.println("-------����ǰ---------");
		for (Integer integer : integerList) {
			System.out.println(integer);
		}
		Collections.sort(integerList);
		System.out.println("-------�����---------");
		for (Integer integer : integerList) {
			System.out.println(integer);
		}
	}
	
	/**
	 * ��String ���͵�List��������
	 * @param args
	 */
	 public void testSort2() {
		 List<String> stringList=new ArrayList<String>();
		 stringList.add("dfsflj");
		 stringList.add("dfsf");
		 stringList.add("dfs");
		 System.out.println("-------����ǰ---------");
		 for (String string : stringList) {
			System.out.println(string);
		}
		 Collections.sort(stringList);
		 System.out.println("-------�����---------");
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
