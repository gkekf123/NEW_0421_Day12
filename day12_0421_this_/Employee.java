package day12_0421_this_;

public class Employee extends Person{
	
	String department;
	
	String info()	{
	return "이름 : " + name + ", 나이 : " + age + ", 학과 : " + department;
	}
	
	Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
}
