package com.test7;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ListTest {

	public List coursesToSelect; //list����������ģ������ظ��Ķ���
	
	public  ListTest() {
		this.coursesToSelect=new ArrayList();
	}
	
/*
 * ��coursesToSelect��ӿγ�
 */
	public void testAdd() {
		//����Course��ʵ������ ,ͨ������add��������ӵ��γ�List��
		 Course cr1=new Course("1","���ݽṹ");
		 coursesToSelect.add(cr1);
		 Course cget=(Course) coursesToSelect.get(0);
		 System.out.println("����ˣ�"+cget.id+":"+cget.name);	 
		 
		 Course cr2=new Course("2", "C����");
		 coursesToSelect.add(0, cr2);
         Course cget2=(Course) coursesToSelect.get(0);
         System.out.println("����ˣ�"+cget2.id+":"+cget2.name);
         System.out.println("����ˣ�"+cget.id+":"+cget.name);
         
         Course[] cr3= {new Course("3", "��ɢ��ѧ"),new Course("4","�������")};
         coursesToSelect.addAll(Arrays.asList(cr3));//ͨ��Arrays������ת�� List
         Course cget3=(Course) coursesToSelect.get(2);
         Course cget4=(Course) coursesToSelect.get(3);
         System.out.println("����ˣ�"+cget3.id+":"+cget3.name);
         System.out.println("����ˣ�"+cget4.id+":"+cget4.name);
          
	}
   
	
/*
 * ȡ��List��Ԫ�صķ���
 */
	public void testGet() {
		//��ȡlist�ĳ���
		int size=coursesToSelect.size();
		System.out.println("�����¿γ̿�ѡ");
		for(int i=0;i<size;i++) {
		    Course cr=(Course) coursesToSelect.get(i);
		    System.out.println("�γ�"+cr.id+":"+cr.name);
		}
	}
	
	/*
	 *ͨ�������������� List
	 */
	public void testIterator() {  
		//ͨ�����ϵ�iterator������ȡ�õ�����ʵ�� 
		Iterator it=coursesToSelect.iterator();
		while(it.hasNext()) {   //��Ԫ�صĻ� �ͷ�����ֵ
		//ͨ��iterator��next�ķ���ȡ��Ԫ��
		Course cr1=	(Course) it.next();
		System.out.println("�γ�"+cr1.id+":"+cr1.name);
		}
	}

	/*
	 * ͨ��for each�������ʼ���Ԫ��
	 */
	public  void testForEach() {
		for(Object obj:coursesToSelect) {
			Course cr2=(Course) obj;
			System.out.println("�γ�"+cr2.id+":"+cr2.name);
		}
	}
	
	/*
	 * �޸�List�е�Ԫ��
	 */
	public void testModify() {
		coursesToSelect.set(3,new Course("5", "ë��"));
	}
	
	/*
	 * ɾ��List�е�Ԫ��
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
