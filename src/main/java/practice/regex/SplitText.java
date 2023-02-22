package practice.regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SplitText {

    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine();
        System.out.println(splitTextIntoWords(text));

    }

    public static String splitTextIntoWords(String text) {
        StringBuilder stb = new StringBuilder();
        Pattern pattern = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            stb.append(matcher.group()).append("\n");
        }
        return stb.toString().trim();
    }
}