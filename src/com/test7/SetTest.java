package com.test7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {

	public List<Course> coursesToSelect;
	
	public SetTest() {
		
		this.coursesToSelect=new ArrayList<Course>();
	}
	
	/*
	 * ��coursesToSelect��ӿγ�
	 */
		public void testAdd() {
			//����Course��ʵ������ ,ͨ������add��������ӵ��γ�List��
			 Course cr1=new Course("1","���ݽṹ");
			 coursesToSelect.add(cr1);
			 Course cget=(Course) coursesToSelect.get(0);
			// System.out.println("����ˣ�"+cget.id+":"+cget.name);	 
			 
			 Course cr2=new Course("2", "C����");
			 coursesToSelect.add(1, cr2);
	         Course cget2=(Course) coursesToSelect.get(1);
	      //   System.out.println("����ˣ�"+cget2.id+":"+cget2.name);
	      //   System.out.println("����ˣ�"+cget.id+":"+cget.name);
	         
	         Course[] cr3= {new Course("3", "��ɢ��ѧ"),new Course("4","�������")};
	         coursesToSelect.addAll(Arrays.asList(cr3));//ͨ��Arrays������ת�� List
	         Course cget3=(Course) coursesToSelect.get(2);
	         Course cget4=(Course) coursesToSelect.get(3);
	     //    System.out.println("����ˣ�"+cget3.id+":"+cget3.name);
	     //    System.out.println("����ˣ�"+cget4.id+":"+cget4.name);
	          
		}
	
		/*
		 * ͨ��for each�������ʼ���Ԫ��
		 */
		public void testForEach() {
			for(Object obj:coursesToSelect) {
				Course cr2=(Course) obj;
				System.out.println("�γ�"+cr2.id+":"+cr2.name);
			}
		}
		
	/*
	 * ����List��contains����	
	 */
		public void testListContains() {
			//ȡ�ñ�ѡ�γ����еĵ�0��Ԫ��
			Course course=coursesToSelect.get(0);
			//��ӡ���coursesToSelected�Ƿ����course.name
			System.out.println("ȡ�ÿγ�"+course.name);
			System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course.name+","+coursesToSelect.contains(course));//ĳ�������Ƿ����ĳ������
			
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SetTest st=new SetTest();
		 st.testAdd();
		 st.testForEach();
		//����һ��ѧ������
		 Student student=new Student("1", "С��");
		 System.out.println("��ӭѧ��"+student.name+"����ѡ��");
		 //����һ��scanner�����ü����������û�����Ŀγ�id
		 Scanner sc=new Scanner(System.in);
		
		 for(int i=0;i<3;i++) {
			 String getid=sc.nextLine();
			 
			for (Course cr : st.coursesToSelect) {
				if(cr.id.equals(getid)) { //����γ�id��ֵ����ѧ�������idֵ
				student.courses.add(cr);  //�ѿγ���Ϣ��ӵ�ѧ����
				}
			}
		 }
		  st.testForEachForSet(student);
	
	}
	
	public void testForEachForSet(Student student) {
		 //��ӡ�����ѧ����ѡ�Ŀγ�
			for (Course cr : student.courses) {
				System.out.println(cr.id+":"+cr.name);
			}
	}

}
