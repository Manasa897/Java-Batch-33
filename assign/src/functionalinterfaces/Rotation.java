package functionalinterfaces;
public class Rotation {
    public static String rotationstrings(String str) {
        char string[] = str.toCharArray();
        String str1;
        int temp = string.length;
        int temp1 = temp;
        char t;
        for (int i = 0; i < temp / 2; i++) {
            t = string[i];
            string[i] = string[temp1-1];
            string[temp-1] = t;
            temp1--;
        }
        str1=string.toString();
        System.out.println(str1);
        return str1;
    }
}