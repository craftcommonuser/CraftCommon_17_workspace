package com.day9;

public class box {
	int a;
	int b;
	int c;

	 box() {
		a = 5;
		b = 7;
		c= 4;
	}

	box(int A, int B, int C) {
		a = A;
		b = B;
		c = C;
	}

	double volume() {
		return a * c * b;
	}
}


