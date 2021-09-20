package org.student;

import org.department.Deparment;

public class Student extends Deparment{
	public void studentName() {
		System.out.println("Student Name is: Sahithya");
		
	}
	
public void studentDept() {
	System.out.println("Student Department is: Computerscience");

		
	}

public void studentId() {
	System.out.println("Student ID is: Reg001");
	
}
public static void main(String[] args) {
	Student stu=new Student();
	stu.studentName();
	stu.studentId();
	stu.departmentName();
	stu.collegeName();
	stu.collegeCode();
	stu.rank();
	
}

}
