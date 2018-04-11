package com.test7;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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
 * 通过 get方法 取得List中元素的方法
 */
	public void testGet() {
		//获取list的长度
		int size=coursesToSelect.size();
		System.out.println("有如下课程可选");
		for(int i=0;i<size;i++) {
		    Course cr=(Course) coursesToSelect.get(i);
		    System.out.println("课程"+cr.id+":"+cr.name);
		}
	}
	
	/*
	 *通过迭代器iterator 来遍历 List
	 */
	public void testIterator() {  
		//通过集合的iterator方法，取得迭代器实例 
		Iterator it=coursesToSelect.iterator();
		while(it.hasNext()) {   //有元素的话 就返回真值
		//通过iterator的next的方法取得元素
		Course cr1=	(Course) it.next();
		System.out.println("课程"+cr1.id+":"+cr1.name);
		}
	}

	/*
	 * 通过for each方法访问集合元素
	 */
	public  void testForEach() {
		for(Object obj:coursesToSelect) {
			Course cr2=(Course) obj;
			System.out.println("课程"+cr2.id+":"+cr2.name);
		}
	}
	
	/*
	 * 通过set方法，修改List中的元素
	 */
	public void testModify() {
		coursesToSelect.set(3,new Course("5", "毛概"));
	}
	
	/*
	 *通过 remove方法 删除List中的元素
	 */
	public void testRemove() {
		//Course cr3=(Course) coursesToSelect.get(3);
		 //coursesToSelect.remove(3);
		Course[] courses= {(Course) coursesToSelect.get(2),(Course) coursesToSelect.get(3)};
		 coursesToSelect.removeAll(Arrays.asList(courses));
		 
	}
	

	
	public static void main(String[] args) {
		ListTest lt=new ListTest();
		
		lt.testAdd();
	    lt.testGet();
	    lt.testIterator();
	    lt.testForEach();
	    lt.testModify();
	    lt.testForEach();
	    lt.testRemove();
	    lt.testForEach();
	}
}
