package src;

import java.util.*;

public class PigLatin {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Please enter a word or sentence to translate into Pig Latin:");
    String phrase = in.nextLine();
    String translated = translator(phrase);
    System.out.println("Here's the Pig Latin: \n" + translated);

  }

  public static String translator(String input) {
    String[] vowels = new String[] { "a", "e", "i", "o", "u" };
    String[] words = input.split(" ");
    List<String> newWords = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      String temp = words[i].toLowerCase();
      if (Arrays.asList(vowels).contains(temp.substring(0, 1))) {
        newWords.add(temp + "way");
      } else {
        temp = temp.substring(1) + temp.substring(0, 1) + "ay";
        newWords.add(temp);
      }
    }
    return String.join(" ", newWords);
  }
}