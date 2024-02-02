package functionalinterfaces;
public class LowerToUpperCase {
    public static String lowertoupper(String input){
        char[] ch = input.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (Character.isLowerCase(c)) {
                ch[i] = Character.toUpperCase(c);
            }
            else if (Character.isUpperCase(c))
            {
                ch[i] = Character.toLowerCase(c);
            }
        }
        return new String(ch);
    }
}