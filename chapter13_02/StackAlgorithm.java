package chapter13_02;

public class StackAlgorithm {

	// 샘이 만든 알고리즘
	private int[] stack = new int[10];
	private int top = 0;

	public void push(int num) {
		if (top == stack.length) {
			System.out.println("Stack Full");
		} else {
			stack[top] = num;
			top++;
		}
	}

	public int pop() {
		if (top == 0) {
			System.out.println("Stack Empty");
		} else {
			top--;
			System.out.println(stack[top]);
		}
		return 1;
	}

}
