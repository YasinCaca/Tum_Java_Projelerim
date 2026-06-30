package hafta4;
import java.util.HashMap;

public class ileri4_hafta {
    public static boolean Anagrammı(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }

            map.put(c, map.get(c) - 1);

            if (map.get(c) == 0) {
                map.remove(c);
            }
        }
        return map.isEmpty();
    }
    
    public static void main(String[] args) {
        System.out.println(Anagrammı("abcd", "abdc")); 
        System.out.println(Anagrammı("abcd", "abcz")); 
        System.out.println(Anagrammı("listen", "silent")); 
        System.out.println(Anagrammı("hello", "world"));   
        System.out.println(Anagrammı("race", "care"));     
        System.out.println(Anagrammı("java", "aavj"));     
        System.out.println(Anagrammı("apple", "pale"));
    }
    
}