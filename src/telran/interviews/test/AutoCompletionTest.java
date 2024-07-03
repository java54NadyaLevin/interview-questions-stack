package telran.interviews.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.interviews.AutoCompletion;

class AutoCompletionTest {
String [] words = {"ab", "ABC", "avfdr", "aV", "aVV", "aaA"};
String [] wordsAb = {"ab", "ABC"};
String [] wordsAv = {"aV", "aVV", "avfdr"}; 
String [] wordsAa = {"aaA"};
	@Test
	void test() {
		AutoCompletion autoCompletion = new AutoCompletion();
		for(String word: words) {
			autoCompletion.addWord(word);
		}
		Arrays.sort(wordsAv, String.CASE_INSENSITIVE_ORDER);
		Arrays.sort(wordsAb, String.CASE_INSENSITIVE_ORDER);
		Arrays.sort(wordsAa, String.CASE_INSENSITIVE_ORDER);
		assertArrayEquals(wordsAb, autoCompletion.getVariants("ab"));
		assertArrayEquals(wordsAv, autoCompletion.getVariants("av"));
		assertArrayEquals(wordsAa, autoCompletion.getVariants("aa"));
	}

}
