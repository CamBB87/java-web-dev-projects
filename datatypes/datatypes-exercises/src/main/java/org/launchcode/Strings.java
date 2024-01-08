package org.launchcode;
import java.util.Scanner;
public class Strings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        System.out.println("please enter a word to search for: ");
        String term = input.nextLine();
        String searchTerm = term.toLowerCase();
        System.out.println(firstSentence.toLowerCase().contains(searchTerm));

        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);



    }


}
