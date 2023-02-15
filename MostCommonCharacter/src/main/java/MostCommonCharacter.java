import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> x = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character car = str.charAt(i);
            if (x.containsKey(car)) {
                int temp = x.get(car);
                x.put(car,temp+1);
            } else {
                x.put(car,1);
            }
        }
        int maxima = 0;
        char val = ' ';
        for (Character car : x.keySet()) {
            if (x.get(car) > maxima) {
                maxima = x.get(car);
                val = car;
            }
        }
        return val;
    }
}
