package com.bl.stack;

class PushAndPop {

	public static int SIZE = 3;
	public static int top = 0;

	public static int[] S = new int[SIZE + 1];

	public static boolean isEmpty() {
		if (top == 0)
			return true;
		return false;
	}

	public static void push(int x) {
		top = top + 1;
		if (top > SIZE)
			System.out.println("Stackoverflow");
		else
			S[top] = x;
	}

	public static int pop() {
		if (isEmpty()) {
			System.out.println("Stackunderflow");
			return -1000;
		} else {
			top = top - 1;
			return S[top + 1];
		}
	}

	public static void main(String[] args) {
		pop();
		push(70);
		push(30);
		push(56);
		

		int i;
		for( i = 1; i <=SIZE ; i++) {
			System.out.println(S[i]);	
		}
		
	}

	
}
