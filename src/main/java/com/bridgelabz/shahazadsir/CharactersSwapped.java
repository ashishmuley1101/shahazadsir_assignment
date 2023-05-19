package com.bridgelabz.shahazadsir;

/*Create a function that takes a string and returns a new string with its first and last characters swapped, except under two conditions:If the length of the string is less than two, return "Incompatible.".
If the first and last characters are the same, return "Two's a pair.".
ExamplesflipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"

flipEndChars("ada") ➞ "Two's a pair."

flipEndChars("Ada") ➞ "adA"

flipEndChars("z") ➞ "Incompatible."
* */

public class CharactersSwapped {


    public static String flipEndChars(String str) {
        String newString = null;

        if (str.length() < 2) {

            System.out.println("Incompatible");

        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            System.out.println("Two's a pair.");
        } else {
            char ch[] = new char[str.length()];

            for (int i = 0; i < str.length(); i++) {
                ch[i] = str.charAt(i);
            }
            char temp = ch[0];
            ch[0] = ch[ch.length - 1];
            ch[ch.length - 1] = temp;

            newString = new String(ch);

        }
        return newString;
    }

    public static void main(String[] args) {

        String str = "Cat, dog, and mouse.";

        System.out.println(flipEndChars(str));

    }

}
