package telran.interviews.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.*;
import telran.interviews.MyStackInt;

class MyStackIntTest {
	Integer[] numbers = { 30, -10, 20, 17, -25 };
	MyStackInt stack = new MyStackInt();

	@BeforeEach
	void setUp() {
	for(Integer i : numbers) {
		stack.push(i);
	}
	}

	@Test
	void pushTest() {
		stack.push(5);
		assertEquals(5, stack.pop());
	}

	@Test
	void popTest() {
		assertEquals(-25, stack.pop());
		stack = new MyStackInt();
		assertThrowsExactly(NoSuchElementException.class, () -> stack.pop());
	}

	@Test
	void peekTest() {
		assertEquals(-25, stack.peek());
		stack = new MyStackInt();
		assertThrowsExactly(NoSuchElementException.class, () -> stack.peek());
	}

	@Test
	void getMaxElementTest() {
		assertEquals(30, stack.getMaxElement());
		stack = new MyStackInt();
		assertThrowsExactly(NoSuchElementException.class, () -> stack.peek());
	}

}
