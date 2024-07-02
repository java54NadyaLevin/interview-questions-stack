package telran.interviews;

import java.util.NoSuchElementException;
import java.util.Stack;

//All methods should have complexity O[1]
public class MyStackInt {
	Stack<Integer> stack = new Stack<>();
	int max;

	public MyStackInt(Integer[] numbers) {
		for (Integer i : numbers) {
			this.stack.push(i);
			countMax(i);
		}
	}

	public void push(int num) {
		countMax(num);
		stack.push(num);
	}

	private void countMax(int num) {
		if (isEmpty()) {
			max = num;
		} else {
			max = num > max ? num : max;
		}
	}

	public int pop() {
		checkIfEmpty();
		return stack.pop();
	}

	public int peek() {
		checkIfEmpty();
		return stack.peek();
	}

	public boolean isEmpty() {
		return stack.size() < 1;
	}

	public int getMaxElement() {
		checkIfEmpty();
		return max;
	}

	private void checkIfEmpty() {
		if (isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		}
		
	}
}
