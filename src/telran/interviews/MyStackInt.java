package telran.interviews;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

//All methods should have complexity O[1]
public class MyStackInt {
	LinkedList<Integer> stack;
	int max;

	public MyStackInt(Integer[] numbers) {
		stack = new LinkedList<>(List.of(numbers));
	}

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
		return stack.getFirst() == 0;
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
