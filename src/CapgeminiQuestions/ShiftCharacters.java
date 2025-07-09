package CapgeminiQuestions;
import java.util.*;
public class ShiftCharacters {
    public static String ShifChar(String str) {
        StringBuilder special = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char ch : str.toCharArray()) {
            if(Character.isLetterOrDigit(ch)) {
                character.append(ch);
            }
            else {
                special.append(ch);
            }
        }
        return special.toString() + character.toString();
    }
    public static void main(String[] args) {
        String str = "Th#eL$earnPro$gra**mming";
        System.out.println(ShifChar(str));
    }
}
