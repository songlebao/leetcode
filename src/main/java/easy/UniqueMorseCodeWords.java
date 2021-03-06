package easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
	public int uniqueMorseRepresentations(String[] words) {
		String[] morseArr = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
				"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		Set<String> set = new HashSet<>();
		for (String word : words) {
			StringBuilder sb = new StringBuilder();
			for (char c : word.toCharArray()) {
				sb.append(morseArr[c - 'a']);
			}
			set.add(sb.toString());
		}
		return set.size();
	}
}
