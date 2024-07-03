package telran.interviews;

import java.util.LinkedList;
import java.util.NoSuchElementException;

//All methods should have complexity O[1]
public class MyStackInt {
	LinkedList<Integer> stack = new LinkedList<>();
	LinkedList<Integer> maxList = new LinkedList<>();
	
	public void push(int num) {
		countMax(num);
		stack.addLast(num);
	}

	private void countMax(int num) {
		if (!isEmpty() && num > maxList.getLast()) {
			maxList.addLast(num);
		}else if(isEmpty()){
			maxList.addLast(num);
		}
	}

	public int pop() {
		checkIfEmpty();
		int removed = stack.removeLast();
		if(removed == maxList.getLast()) {
			maxList.removeLast();
		}
		return removed;
	}

	public int peek() {
		
		return stack.getLast();
	}

	public boolean isEmpty() {
		
		return stack.isEmpty();
	}

	public int getMaxElement() {
		checkIfEmpty();
		return maxList.getLast();
	}

	private void checkIfEmpty() {
		if (isEmpty()) {
			throw new NoSuchElementException("Stack is empty");
		}
		
	}
}
