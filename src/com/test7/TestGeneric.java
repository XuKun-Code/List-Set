package com.test7;

import java.util.ArrayList;
import java.util.List;  //util���µ�

/*
 * ���з��͵� List��������
 */
public class TestGeneric {
   public List<Course> courses;
   
   public TestGeneric() {
	   this.courses=new ArrayList<Course>();
   }
/*
 * �������	   
 */
	public void testAdd() {
		Course cr1=new Course("1", "�������");
		courses.add(cr1);
		
		//���ͼ����У�������ӷ��͹涨�����ͼ�������������Ķ��󣬷���ᱨ��
	 //	courses.add("asfjasj"); 
		
		Course cr2=new Course("2", "�������");
		courses.add(cr2);
	}

	/*
	 * ͨ��foreach������
	 */
	public void testForEach() {
		for(Course cr:courses) {
			System.out.println(cr.id+":"+cr.name);
		}
	}
   
	/*
	 *���ͼ��Ͽ������ ���͵������͵Ķ���ʵ��
	 */
	public void testChild() {
		ChildCourse ccr=new ChildCourse();
		ccr.id="3";
		ccr.name="��ѧӢ��";
		courses.add(ccr);
		
	}
	
	/*
	 * ���Ͳ���ʹ�û�������
	 */
	public void testBasicType() {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		System.out.println(list.get(0));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestGeneric tg=new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();
	
	}

}
