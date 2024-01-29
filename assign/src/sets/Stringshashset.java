package sets;
import java.util.HashSet;
import java.util.Iterator;
public class Stringshashset{
    public static void hashsetloops(HashSet<String> stringSet) {


        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }

        System.out.println("\nIterating using for loop:");
        Object[] stringArray = stringSet.toArray();
        for (int i = 0; i < stringArray.length; i++) {
            String fruit = (String) stringArray[i];
            System.out.println(fruit);
        }

        System.out.println("\nIterating using enhanced for loop:");
        for (String fruit : stringSet) {
            System.out.println(fruit);
        }
    }
}