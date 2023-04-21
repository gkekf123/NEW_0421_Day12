package day12_0421_overload;

public class Basic {

	/* 
	 * 1. 이름은 똑같음
	 * 2. 매개변수를 다르게 해서 모형을 다르게 해야함
	 * 3. 반환유형은 오버로딩에 영향을 미치치 않습니다
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력 받음");
	}
	
//	 위 메서드와 모형이 같기 때문에 안됌
//	void input(int x) {
//		return 0;
//	}
	
	// 위 메서드의 모형은 같지만 맴버 변수의 타입이 다르기 때문에 가능
	void input(String a) {
		System.out.println("문자열 1개 입력받음");
	}
	
	void input(int a, double b){
		System.out.println("정수 1, 실수 1개 입력받음");
	}
	
	// 위 메서드와 비슷 하지만 멤버 변수 순서를 바꿔도 된다
	void input(double a, int b){
		System.out.println("실수 1, 정수 1개 입력받음");
	}
	
	void input(char a, char b, double c){
		System.out.println("정수 1, 문자 1개, 실수 1개 입력받음");
	}
	
	
	
	
}
