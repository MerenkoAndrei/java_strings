package practice.string;

import java.util.Scanner;

public class SequentialWordsNumbers {
    public static void main(String[] args) {
        System.out.println("Введите номер: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println(sequentialWordsNumbers(text));
    }

    public static String sequentialWordsNumbers(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        int num = 0;
        String word = "";
        String newText = text.trim() + " ";
        if (!text.equals("")) {
            for (int i = 0; i < newText.length(); i++) {
                if (newText.length() <= 2 && !Character.isLetter(newText.charAt(i))) {
                    word = "";
                }
                if (newText.charAt(i) != ' ' && newText.length() > 2) {
                    word = word + newText.charAt(i);
                } else {
                    num++;
                    stringBuilder.append(" (" + num + ") " + word);
                    word = "";
                }
            }
        }

        return stringBuilder.toString().trim();
    }
}
