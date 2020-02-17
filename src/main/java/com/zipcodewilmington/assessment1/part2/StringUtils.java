package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {

        String[] arrOfStr = sentence.split(" ");
   return arrOfStr; }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] arrOfStr = sentence.split(" ");
        return arrOfStr[0]; }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {

        String[] arrOfStr = sentence.split(" ");
        String firstWord = arrOfStr[0];
    String output = "";
        for (int i = firstWord.length() - 1; i >= 0; i--) {
        output = output + firstWord.charAt(i);
    }
        return output;
}

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {

        String[] arrOfStr = sentence.split(" ");
        String firstWord = arrOfStr[0];
        String reverse = "";
        for (int i = firstWord.length() - 1; i >= 0; i--) {
            reverse = reverse + firstWord.charAt(i);
        }
        String output = reverse.substring(0, 1).toUpperCase() + reverse.substring(1);

        return output;
    }



    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {

        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(index);
   return (sb.toString());}

}
