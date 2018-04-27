package com.test7;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Maptest {
	//������װѧ�����͵Ķ���
	public Map<String, Student> students;

/*
 * �ڹ������г�ʼ��students����
 */
	public Maptest() {
		this.students=new HashMap<String,Student>();
	}
	
	/*
	 * ������ӣ� ����ѧ��id���ж�ʱ��ռ��
	 * ��û�б�ռ�� ��������������������ѧ�����󣬲�����ӵ�students��
	 */
	public void testPut() {
		//����scanner����������ȡ�����ѧ��id������
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i<3) {
			System.out.println("������ѧ��id��");
			String ID=sc.nextLine();
			//�жϸ�ID�Ƿ�ռ��
			Student st=students.get(ID);//����ֵΪvalue ��value ������Ϊ student 
			if(st==null) {
				//��ʾ����ѧ������
				System.out.println("������ѧ��������");
				String name=sc.nextLine();  //��ȡѧ�����������
				//�����µ�ѧ������
				Student newStudent =new Student(ID, name);
				//ͨ������students��put���������ID-ѧ��ӳ��
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����"+students.get(ID).name);//get�������ص���value ����ΪStudent����
				i++;
			}else {
				System.out.println("��ѧ��ID�Ѿ���ռ�ã���");
				continue;
			}
		}
	}
	
	/*
	 * ����Map��KeySet���������ش�ӳ���а����ļ��� Set ��ͼ
	 */
	public void testKeySet() {
		//ͨ��keySet����������Map�е����м���set����
		Set<String> KeySet=students.keySet();
		//ȡ��students������
		System.out.println("�ܹ���"+students.size()+"��ѧ��");
		//����KeySet,ȡ��ÿһ�������ٵ���get����ȡ��ÿ������Ӧ��value
		for (String str: KeySet) {
		 Student sd=students.get(str);   //get����ͨ������ȡvalueֵ
		 if(sd!=null) {
			 System.out.println("id��"+str+"ѧ��"+sd.name);
		 }
		}
	}
	
	/*
	 * ����ɾ��Map�е�ӳ��
	 */
	public void testRemove() {
		//��ʾ�û������ɾ��ѧ����id
		Scanner sc=new Scanner(System.in);
while(true) {
		System.out.println("������Ҫɾ��ѧ����id");
		String getID=sc.nextLine();
		//�жϸ�ID�Ƿ��ж�Ӧ��ѧ������    ����Ϊ Student
		Student st=students.get(getID);
		if(st==null) {
			System.out.println("��ID������ ");
			continue;
		}else {
			students.remove(getID);
			System.out.println("�ɹ�ɾ��ѧ����"+st.name);
			break;			
		}
	}
	}
	
	/*
	 * ͨ��entrySet����������Map
	 */
	public void testEntrySet() {
		//ͨ�� entrySet����������Map�����м�ֵ�Ե�
		Set<Entry<String, Student>> entrySet=students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ�ü�"+entry.getKey()+"ȡ��value"+entry.getValue().name);
		
		}
	}
	
	/*
	 * ����put�����޸�Map�е���ӳ��
	 */
	public void testModify() {
 //��ʾ����Ҫ�޸ĵ�ѧ��ID
		System.out.println("������Ҫ�޸ĵ�ѧ��ID");
		Scanner sc=new Scanner(System.in);
		while(true) {
		String getid=sc.nextLine();
		//��students�в��Ҹ�ѧ��ID���õ�ѧ������
		Student st=students.get(getid);
		if(st==null) {
			System.out.println("��ID�����ڣ�����������");
			continue;
		}
		//��ʾ��ǰ��Ӧ��ѧ�����������
		System.out.println("��ǰ��ѧ��ID������Ӧ��ѧ��Ϊ"+st.name);
		//��ʾ�����µ�ѧ�����������޸����е�ӳ��
		System.out.println("�������µ�ѧ������");
		String newname=sc.nextLine();
		Student newstudent=new Student(getid,newname);
		students.put(getid, newstudent);
		System.out.println("�޸ĳɹ�");
		break;
		
		
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Maptest mt=new Maptest();
         mt.testPut();
         mt.testKeySet();
         mt.testRemove();
         mt.testEntrySet();
         mt.testModify();
         mt.testEntrySet();
	}

}
