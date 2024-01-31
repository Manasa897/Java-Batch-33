package functionalinterfaces;

public class RepeatedStrings {
    public static void repeatedchars(String str){

        str = str.replaceAll("\\s", "");
        str.toLowerCase();
        char string[] = str.toCharArray();
        int count=0;
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';
                }
            }
            if(count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
    }
}