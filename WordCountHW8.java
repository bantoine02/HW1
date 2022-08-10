import java.io.*;
import java.util.Scanner;

public class WordCountHW8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		final int size = 18;
		int[] WordCount = new int[size];
		String[] Words = new String[size];
		int count = 0;
		String[] word = new String[size];

		File myfiles = new File("WordCountInput.txt");
		Scanner inputFile = new Scanner(myfiles);
		// Scanner inputFile = new Scanner(System.in);
		

		String str = inputFile.nextLine();
		 word = str.split(" ");
			//for (String i : word)
			// System.out.println(i);

			for (int n = 0; n < word.length; n++) { // loop that allows for the java to loop through the input.
				int pos = findWord(word[n], Words, count); // changes findWord method into an index. 
				if (pos != -1) {
					WordCount[pos]++; // counts the number of words 
				} else {
					Words[count] = word[n]; // changes words[counts] to word[n] (which is String str)
					WordCount[count] = 1; // if there is only one word and no same words, this returns it as 1.
					count++; // counts all words that only have one in the sentence.

				}
			
			
			}
			for (int i = 0; i < count; i++) {
			System.out.println(Words[i] + " " + WordCount[i]);	// prints out the words and the number of words
			
			}
			// close input file
			inputFile.close();
			
			
					  }
		
	/* Method findWord
     * Input:
     * str - index for an array
     * Words- reference to the array
     * count = the count of the array
     * Process:
     * the  method searches the array and counts all the same words.
     * Output:
     * returns index or a -1
     */
public static int findWord(String str, String[] Words, int count) {
	
	for (int i = 0; i < count; i++) {
		if (str.equals(Words[i])) 
		return i;
	}
	return -1;
}

}

	

