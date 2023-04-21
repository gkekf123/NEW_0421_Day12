package day12_0421_overload;

public class MainClass {

	public static void main(String[] args) {

		Basic b = new Basic();
		
		b.input(1);
		b.input("가나다라");
		b.input(2, 2.5);
		b.input(4.4, 6);
		b.input('a', 'b', 2.5);
		
	}

}
