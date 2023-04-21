package day12_0421_override;

public class Student extends Person{

	String studentId;
	String info() {
		return "이름 : " + name + ", 나이 : " + age + ", 학생 아이디 : " + studentId;
	}
}
