package com.test7;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ListTest {

	public List coursesToSelect; //list是排列有序的，可以重复的队列
	
	public  ListTest() {
		this.coursesToSelect=new ArrayList();
	}
	
/*
 * 向coursesToSelect添加课程
 */
	public void testAdd() {
		//创建Course的实例对象 ,通过调用add方法，添加到课程List中
		 Course cr1=new Course("1","数据结构");
		 coursesToSelect.add(cr1);
		 Course cget=(Course) coursesToSelect.get(0);
		 System.out.println("添加了："+cget.id+":"+cget.name);	 
		 
		 Course cr2=new Course("2", "C语言");
		 coursesToSelect.add(0, cr2);
         Course cget2=(Course) coursesToSelect.get(0);
         System.out.println("添加了："+cget2.id+":"+cget2.name);
         System.out.println("添加了："+cget.id+":"+cget.name);
         
         Course[] cr3= {new Course("3", "离散数学"),new Course("4","汇编语言")};
         coursesToSelect.addAll(Arrays.asList(cr3));//通过Arrays把数组转成 List
         Course cget3=(Course) coursesToSelect.get(2);
         Course cget4=(Course) coursesToSelect.get(3);
         System.out.println("添加了："+cget3.id+":"+cget3.name);
         System.out.println("添加了："+cget4.id+":"+cget4.name);
	}
    
	
/*
 * 取得List中元素的方法
 */
	public void testGet() {
		
	}
	
	
	public static void main(String[] args) {
		ListTest lt=new ListTest();
		
		lt.testAdd();
	}
}
