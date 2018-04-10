package com.test7;

import java.util.ArrayList;
import java.util.List;  //util包下的

/*
 * 带有泛型的 List类型属性
 */
public class TestGeneric {
   public List<Course> courses;
   
   public TestGeneric() {
	   this.courses=new ArrayList<Course>();
   }
/*
 * 测试添加	   
 */
	public void testAdd() {
		Course cr1=new Course("1", "软件测试");
		courses.add(cr1);
		
		//泛型集合中，不能添加泛型规定的类型以外的对象，否则会报错！
	 //	courses.add("asfjasj");
		
		Course cr2=new Course("2", "软件工程");
		courses.add(cr2);
	}

	/*
	 * 通过foreach来遍历
	 */
	public void testForEach() {
		for(Course cr:courses) {
			System.out.println(cr.id+":"+cr.name);
		}
	}
   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestGeneric tg=new TestGeneric();
		tg.testAdd();
		tg.testForEach();
	}

}
