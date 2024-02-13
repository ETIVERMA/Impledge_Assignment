import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

class TrieNode {
    Set<TrieNode> children;
    boolean isWord;
    TrieNode() {
     children = new HashSet<>();
     isWord = false;
    }
}

public class LongestCompounded {
    public static void main(String[] args) {
        String filename = "Input_02.txt";
        String longestCompoundWord = findLongestCompoundWord(filename);
        System.out.println("Longest Compound Word: " + longestCompoundWord);
    }

    private static String findLongestCompoundWord(String filename) {
        try (BufferedReader inputFile = new BufferedReader(new FileReader(filename))) {
            TrieCompressed trie = new TrieCompressed();
            String word;
            while ((word = inputFile.readLine()) != null) {
                trie.insert(word.trim());
            }
            return trie.getLongestCompoundWord();
        } catch (IOException e) {
            System.err.println("Error:not open the input file.");
            e.printStackTrace();
            return "";
        }
    }
}


