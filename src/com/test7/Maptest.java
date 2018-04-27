package com.test7;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Maptest {
	//用来承装学生类型的对象
	public Map<String, Student> students;

/*
 * 在构造器中初始化students属性
 */
	public Maptest() {
		this.students=new HashMap<String,Student>();
	}
	
	/*
	 * 测试添加： 输入学生id，判断时候被占用
	 * 若没有被占用 ，则输入姓名，创建新学生对象，并且添加到students中
	 */
	public void testPut() {
		//创建scanner对象，用来获取输入的学生id和姓名
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i<3) {
			System.out.println("请输入学生id：");
			String ID=sc.nextLine();
			//判断该ID是否被占用
			Student st=students.get(ID);//返回值为value 而value 的类型为 student 
			if(st==null) {
				//提示输入学生姓名
				System.out.println("请输入学生姓名：");
				String name=sc.nextLine();  //获取学生输入的姓名
				//创建新的学生对象
				Student newStudent =new Student(ID, name);
				//通过调用students的put方法，添加ID-学生映射
				students.put(ID, newStudent);
				System.out.println("成功添加学生："+students.get(ID).name);//get方法返回的是value 类型为Student类型
				i++;
			}else {
				System.out.println("该学生ID已经被占用！！");
				continue;
			}
		}
	}
	
	/*
	 * 测试Map的KeySet方法，返回此映射中包含的键的 Set 视图
	 */
	public void testKeySet() {
		//通过keySet方法，返回Map中的所有键的set集合
		Set<String> KeySet=students.keySet();
		//取得students的容量
		System.out.println("总共有"+students.size()+"个学生");
		//遍历KeySet,取得每一个键，再调用get方法取得每个键对应的value
		for (String str: KeySet) {
		 Student sd=students.get(str);   //get方法通过键获取value值
		 if(sd!=null) {
			 System.out.println("id："+str+"学生"+sd.name);
		 }
		}
	}
	
	/*
	 * 测试删除Map中的映射
	 */
	public void testRemove() {
		//提示用户输入待删除学生的id
		Scanner sc=new Scanner(System.in);
while(true) {
		System.out.println("请输入要删除学生的id");
		String getID=sc.nextLine();
		//判断该ID是否有对应的学生对象    类型为 Student
		Student st=students.get(getID);
		if(st==null) {
			System.out.println("该ID不存在 ");
			continue;
		}else {
			students.remove(getID);
			System.out.println("成功删除学生："+st.name);
			break;			
		}
	}
	}
	
	/*
	 * 通过entrySet方法来遍历Map
	 */
	public void testEntrySet() {
		//通过 entrySet方法，返回Map中所有键值对的
		Set<Entry<String, Student>> entrySet=students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("取得键"+entry.getKey()+"取得value"+entry.getValue().name);
		
		}
	}
	
	/*
	 * 利用put方法修改Map中的已映射
	 */
	public void testModify() {
 //提示输入要修改的学生ID
		System.out.println("请输入要修改的学生ID");
		Scanner sc=new Scanner(System.in);
		while(true) {
		String getid=sc.nextLine();
		//从students中查找该学生ID对用的学生对象
		Student st=students.get(getid);
		if(st==null) {
			System.out.println("该ID不存在！请重新输入");
			continue;
		}
		//提示当前对应的学生对象的姓名
		System.out.println("当前改学生ID，所对应的学生为"+st.name);
		//提示输入新的学生姓名，来修改已有的映射
		System.out.println("请输入新的学生姓名");
		String newname=sc.nextLine();
		Student newstudent=new Student(getid,newname);
		students.put(getid, newstudent);
		System.out.println("修改成功");
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
