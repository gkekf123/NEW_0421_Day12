package day12_0421_Quiz02;

public class AccountMain {

	public static void main(String[] args) {

		MyAccount mc = new MyAccount("1234 - 1234", "1234", 1000);
		
		mc.deposit(1000);
		mc.withDraw(500);
		
		
	}

}
