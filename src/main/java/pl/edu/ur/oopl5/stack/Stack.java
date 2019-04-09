package pl.edu.ur.oopl5.stack;


public class Stack {
	private static int maxsize = 8;

	private static int[] stack = new int[8];

	private static int top = -1;

	public static boolean isempty() {
		if(top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isfull() {
		if(top == maxsize) {
			return true;
		} else {
			return false;
		}
	}

	public static int peek() {
		return stack[top];
	}

	public static int pop() {
		int data;

		if(!isempty()) {
			data = stack[top];
			top = top - 1;
			return data;
		} else {
			System.out.println("Could not retrieve data, Stack is empty.");
		}
		return 0;
	}

	public static int push(int data) {
		if(!isfull()) {
			top = top + 1;
			stack[top] = data;
		} else {
			System.out.println("Could not insert data, Stack is full.");
		}
		return 0;
	}

	public static void main(String[] args) {
		// push items on to the stack 
		push(3);
		push(5);
		push(9);
		push(1);
		push(12);
		push(15);

		System.out.println("Element at top of the stack: " + peek());
		System.out.println("Elements: ");

		// print stack data 
		while(!isempty()) {
			int data = pop();
			System.out.println(data);
		}

		System.out.println("Stack full: " + (isfull() ? "true" : "false"));
		System.out.println("Stack empty: " + (isempty() ? "true" : "false"));
	}
}