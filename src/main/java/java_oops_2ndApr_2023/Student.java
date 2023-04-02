package java_oops_2ndApr_2023;
//Constructors:

//constructor is a block which looks like a method but it has the name of the Class
//constructor does not have a return type
//public, private, protected, default - applicable
//constructors are invoked the moment object is created

//Uses of constructor:-
//1. Initialize an object
//2. It is used to optimize the code

//Misconception and people confuse you in interview
//Constructors are used to create Object [not true at all]

//Types of Constructor
//1. Default constructor [compiler auto generates this when an Object is created]
//2. No Argument/Parameter Constructor [user-defined]
//3. Parameterized Constructor [user-defined]

public class Student {

	String name; // null
	int student_id; // 0
	int age; // 0

	public static void main(String[] args) {

		Student st1 = new Student("Tom", 101, 10);
		System.out.println(st1.name + " " + st1.student_id + " " + st1.age);

		Student st2 = new Student("Grey", 102, 11);
		System.out.println(st2.name + " " + st2.student_id + " " + st2.age);

		Student st3 = new Student("Jack");
		System.out.println(st3.name);

	}

	public Student(String name, int student_id, int age) {
		this.name = name;
		this.student_id = student_id;
		this.age = age;
	}

	public Student(String name) {
		this.name = name;
	}

}
