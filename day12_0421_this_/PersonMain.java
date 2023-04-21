package day12_0421_this_;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person("홍길돟", 20);
		//System.out.println(p1);	// 주소값
		System.out.println(p1.info());
		Person p2 = new Person("이순신");
		//System.out.println(p2);	// 주소값
		System.out.println(p2.info());
		Person p3 = new Person();
		//System.out.println(p3);	// 주소값
		System.out.println(p3.info());
	}

}
