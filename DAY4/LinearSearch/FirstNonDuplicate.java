package DAY4.LinearSearch;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonDuplicate {
        public static char findFirstNonDuplicate(String s) {
            Map<Character, Integer> charCount = new LinkedHashMap<>();

            for (char c : s.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            for (char c : s.toCharArray()) {
                if (charCount.get(c) == 1) {
                    return c;
                }
            }

            return '\0';
        }

        public static void main(String[] args) {
            String inputString = "abacddbe";
            char result = findFirstNonDuplicate(inputString);
            if (result != '\0') {
                System.out.println("The first non-duplicate character in '" + inputString + "' is '" + result + "'.");
            } else {
                System.out.println("No non-duplicate character found in '" + inputString + "'.");
            }
        }
    }
