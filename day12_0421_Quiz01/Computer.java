package day12_0421_Quiz01;

public class Computer extends Calculator{

	
	
	// 원의 넓이
	double circle(int a) {
		return a * a * Math.PI;
	}
	
	// 정사각형의 넓이 리턴
	double rect(double a) {
		return a * 2;
	}
	
	// 직사각형의 넓이 리턴
	double rect(double a, double b) {
		return a * b;
	}
	
	// 직육면체의 넓이 리턴
	double rect(double a, double b, double c) {
		return a * b * c;
	}
	
}
