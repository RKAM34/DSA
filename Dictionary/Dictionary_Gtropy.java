  //Time complexity : O(m), where m is the word length.
  //Space complexity : O(m) 
package Dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary_Gtropy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trie Data = new Trie();
		try {
			// ENTER CORRECT LOCATION OF list.txt FILE 
			Scanner scanner = new Scanner(new File("C:/Users/Rohil/eclipse-workspace/Crux/src/Dictionary/list.txt"));
			while (scanner.hasNextLine()) {
				String s = scanner.nextLine();
				
				Data.insert(s);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	

		Boolean Loop = true;
		String Input;

		while (Loop) {

			System.out.println("--> Pleae Enter a Word to Search from the Dictionary Database ");
			System.out.println("--> Enter 0 to Exit");
			Scanner scn = new Scanner(System.in);
			Input = scn.nextLine();

			if (Input.equals("0")) {
				Loop = false;
				scn.close();
				return;

			}
			if (Data.search(Input)) {
				System.out.println("Word Found\n");
			} else {
				System.out.println("Word NOT Found");
			}

		}

	}

	public static class TrieNode {
		public char val;
		public boolean isWord;
		public TrieNode[] children = new TrieNode[127];

		public TrieNode() {
		}

		TrieNode(char c) {
			TrieNode node = new TrieNode();
			node.val = c;
		}
	}

	public static class Trie {
		private TrieNode root;

		public Trie() {
			root = new TrieNode();
			root.val = ' ';
		}

		public void insert(String word) {
			if (word == null)
				return;
			TrieNode ws = root;
			for (int i = 0; i < word.length(); i++) {
				char c = word.charAt(i);
				int typeConv = (int) c;
				if (ws.children[typeConv] == null) {
					ws.children[typeConv] = new TrieNode(c);
				}
				ws = ws.children[typeConv];
			}
			ws.isWord = true;
		}
    
		public boolean search(String word) {
			TrieNode ws = root;
			for (int i = 0; i < word.length(); i++) {

				char c = word.charAt(i);
				int typeConv = (int) c;
				if (ws.children[typeConv] == null)
					return false;
				ws = ws.children[typeConv];
			}
			
			return ws.isWord;
		}

	}
}
