package list;

import java.util.ArrayList;
public class Traversal{
    public static void main(String[] args) {
        ArrayList<String> inp = new ArrayList<>();
        inp.add("adding 1st element");
        inp.add("adding 2nd element");
        inp.add("adding 3rd element");
        inp.add("adding 4th element");
        System.out.println(" Enhanced for loop");
        for (String s : inp) {
            System.out.print(" "+s);
        }
        System.out.println();
        System.out.println(" for loop");
        for (int i = 0; i < inp.size(); i++) {
            System.out.print(" "+inp.get(i));
        }
    }
}