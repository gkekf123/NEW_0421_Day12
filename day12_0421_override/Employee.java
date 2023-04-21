package day12_0421_override;

public class Employee extends Person{
	
	String department;
	
	String info()	{
	return "이름 : " + name + ", 나이 : " + age + ", 학과 : " + department;
	}
}
