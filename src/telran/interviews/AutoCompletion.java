package telran.interviews;

import java.util.TreeSet;

public class AutoCompletion {
TreeSet<String> set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

	public boolean addWord(String word) {
		return set.add(word);
	}
	public String [] getVariants(String prefix) {
		return set.subSet(prefix, prefix+Character.MAX_VALUE).toArray(String[]::new);
	}


}
