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
	 * 向coursesToSelect添加课程
	 */
		public void testAdd() {
			//创建Course的实例对象 ,通过调用add方法，添加到课程List中
			 Course cr1=new Course("1","数据结构");
			 coursesToSelect.add(cr1);
			 Course cget=(Course) coursesToSelect.get(0);
			// System.out.println("添加了："+cget.id+":"+cget.name);	 
			 
			 Course cr2=new Course("2", "C语言");
			 coursesToSelect.add(1, cr2);
	         Course cget2=(Course) coursesToSelect.get(1);
	      //   System.out.println("添加了："+cget2.id+":"+cget2.name);
	      //   System.out.println("添加了："+cget.id+":"+cget.name);
	         
	         Course[] cr3= {new Course("3", "离散数学"),new Course("4","汇编语言")};
	         coursesToSelect.addAll(Arrays.asList(cr3));//通过Arrays把数组转成 List
	         Course cget3=(Course) coursesToSelect.get(2);
	         Course cget4=(Course) coursesToSelect.get(3);
	     //    System.out.println("添加了："+cget3.id+":"+cget3.name);
	     //    System.out.println("添加了："+cget4.id+":"+cget4.name);
	          
		}
	
		/*
		 * 通过for each方法访问集合元素
		 */
		public void testForEach() {
			for(Object obj:coursesToSelect) {
				Course cr2=(Course) obj;
				System.out.println("课程"+cr2.id+":"+cr2.name);
			}
		}
		
	/*
	 * 测试List的contains方法	
	 */
		public void testListContains() {
			//取得备选课程序列的第0个元素
			Course course=coursesToSelect.get(0);
			//打印输出coursesToSelected是否包含course.name
			System.out.println("取得课程"+course.name);
			System.out.println("备选课程中是否包含课程："+course.name+","+coursesToSelect.contains(course));//某个序列是否包含某个对象
			
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SetTest st=new SetTest();
		 st.testAdd();
		 st.testForEach();
		//创建一个学生对象
		 Student student=new Student("1", "小明");
		 System.out.println("欢迎学生"+student.name+"进行选课");
		 //创建一个scanner对象，用键盘来接受用户输入的课程id
		 Scanner sc=new Scanner(System.in);
		
		 for(int i=0;i<3;i++) {
			 String getid=sc.nextLine();
			 
			for (Course cr : st.coursesToSelect) {
				if(cr.id.equals(getid)) { //如果课程id的值等于学生输入的id值
				student.courses.add(cr);  //把课程信息添加到学生中
				}
			}
		 }
		  st.testForEachForSet(student);
	
	}
	
	public void testForEachForSet(Student student) {
		 //打印输出，学生所选的课程
			for (Course cr : student.courses) {
				System.out.println(cr.id+":"+cr.name);
			}
	}

}
