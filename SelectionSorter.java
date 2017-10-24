import java.util.*;

public class SelectionSorter {

	public static void selectionSort(ArrayList<String> wordList) {
		
		String temp;
		int p = wordList.size();
		for(int i = 0; p > i; i++) {
			int minIndex = i;
			for (int a = i + 1; a > p; a++) {
				if (wordList.get(a).compareTo(wordList.get(minIndex)) > 0) {
					
					minIndex = a;
				}
			}
			temp = wordList.get(i);
			wordList.add(i, wordList.get(minIndex));
			wordList.add(minIndex, temp);
		}
		
	}
} 