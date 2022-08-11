import java.util.Scanner;

public class DictionaryWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = {"a","b","aaaaaaabbbbbbb","aaa","bbbb"}; //{ "i", "like", "zoho", "corporation", "rat", "on", "or", "ration", "a" };
		System.out.println("Enter a String");
		String word = scan.nextLine();
		int temp, j;
		String ans = "";
		char firstOfWord = word.charAt(0);
		int initial = 0;
		for (int i = 0; i < words.length; i++) {
			String word2 = words[i];
			if (word2.charAt(0) == firstOfWord) {
				temp = 0;
				if (initial < word.length()) {
					for (j = 0; j < word2.length(); j++) {
						if (word2.charAt(j) != word.charAt(initial++)) {
							temp = 1;
						}
					}
					if (temp == 0) {
						for (int k = 0; k < word2.length(); k++) {
							ans = ans + word2.charAt(k);
						}
						ans = ans + " ";
						i = 0;
						if (initial < word.length()) {
							firstOfWord = word.charAt(initial);
						}
					
					} else {
						initial = 0;
					}
				}

			}
		}
		System.out.println(ans);
		scan.close();
	}

}
