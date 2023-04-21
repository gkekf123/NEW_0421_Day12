package day12_0421_this_;

public class Person {

	String name;
	int age;
	
	//Person 생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		//System.out.println(this.info());
		//System.out.println(this);	// 주소값 : 나 자신을 나타냄
	}
	
	//생성자 오버로드
	Person(String name){
		//this.name = name;
		//this.age = 1;
		//System.out.println(this);	// 주소값 : 나 자신을 나타냄
		this(name, 1);
	}
	
	//기본 생성자
	Person() {
		//this.name = "이름없음";
		//this.age = 1;
		//System.out.println(this);	// 주소값 : 나 자신을 나타냄
		this("이름없음", 1);
	}
	
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
}
