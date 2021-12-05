package com.navya;

public class DemoToString {
	public static void main(String[] args) {
		Student s1 = new Student(11, "Navya");
		// System.out.println(s1.rollno); //11
		// System.out.println(s1.aname); // navya

		// System.out.println(s1); //com.navya.student@15db9742

		System.out.println(s1.toString());
	}

}

class Student // extents Object
{
	int rollno;
	String aname;

	public Student(int rollno, String aname) {
		this.rollno = rollno;
		this.aname = aname;
	}

	@Override
	public String toString() {
		// return rollno + " : " + aname;

		return "Student{" + "rollno=" + rollno + ", aname=" + aname + '}';
	}

}
