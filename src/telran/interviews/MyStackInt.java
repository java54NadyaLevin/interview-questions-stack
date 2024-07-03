package telran.interviews;

import java.util.LinkedList;
import java.util.NoSuchElementException;

//All methods should have complexity O[1]
public class MyStackInt {
	LinkedList<Integer> stack = new LinkedList<>();
	int max;


	public void push(int num) {
		countMax(num);
		stack.addLast(num);
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
		return stack.removeLast();
	}

	public int peek() {
		
		return stack.getLast();
	}

	public boolean isEmpty() {
		
		return stack == null;
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
