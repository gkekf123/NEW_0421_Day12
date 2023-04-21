package day12_0421_Quiz01;

public class Calculator {

	int result;
	double pi;
	
Calculator () {
	result = 0;
	pi = 3.14;
	
}
	
void add(int a) {
	result += a;
}

void sub(int b) {
	result -= b;
}

double circle(int c) {
	return c * c  * pi;
}
	
}
