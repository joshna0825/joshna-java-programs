import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    // Function to convert Roman numeral to integer
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Traverse from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            if (currentValue >= prevValue) {
                total += currentValue;  // Add if current is greater or equal to previous
            } else {
                total -= currentValue;  // Subtract if current is less than previous
            }

            prevValue = currentValue;
        }
        return total;
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV";  // Example: 1994
        int result = romanToInt(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is " + result);
    }
}
