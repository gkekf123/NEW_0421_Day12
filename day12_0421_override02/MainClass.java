package day12_0421_override02;

public class MainClass {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.Method01();	// 본인의 메서드
		p.Method02();	// 본인의 메서드
		
		Child c = new Child();
		c.Method01();	// 상속받은 메서드
		c.Method02();	// 오버라이드 된 메서드
	}

}
