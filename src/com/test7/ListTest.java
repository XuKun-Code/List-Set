package com.test7;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

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
		
	}
	
	
	public static void main(String[] args) {
		ListTest lt=new ListTest();
		
		lt.testAdd();
	}
}
