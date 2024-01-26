package hashmap;
import java.util.HashMap;
public class Distinctcharacters {
    public static void charcount(String inp) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        char[] chars=inp.toCharArray();
        for (int i=0;i<chars.length;i++) {
            char c=chars[i];
            Integer count =charCounts.get(c);
            if(count==null) {
                charCounts.put(c, 1);
            }
            else {
                count++;
                charCounts.put(c,count);
            }
        }
        for(char key : charCounts.keySet()) {
            System.out.printf("%s-%d ", key, charCounts.get(key));
        }
        System.out.println();
    }
}