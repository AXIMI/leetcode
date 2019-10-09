package leetcode200;
import java.util.*;
public class Leetcode208 {

	public static void main(String[] args) {
		Trie trie=new Trie();
		trie.insert("apple");
		System.out.println("search apple: "+trie.search("apple"));
		System.out.println("search apple: "+trie.search("app"));
		System.out.println("trie start with app: "+trie.startwith("app"));
		
	}

}

class Trie {
	
    /** Initialize your data structure here. */
    public Trie() {
        Map<Character> map=
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    }
}