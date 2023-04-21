package day12_0421_override;

public class PersonMain {

	public static void main(String[] args) {

		Student s = new Student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "123123";
		System.out.println(s.info());	// 오버라이딩
		
		Teacher t = new Teacher();
		t.age = 40;
		t.name = "박인욱";
		t.subject = "자바";
		System.out.println(t.info());	// 오버라이딩
		
		Employee e = new Employee();
		e.age = 80;
		e.name = "이기성";
		e.department = "소프트웨어학과";
		System.out.println(e.info());	// 오버라이딩
		
	}

}
