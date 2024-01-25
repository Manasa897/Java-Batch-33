package collections;
import java.util.ArrayList;
public class Removelastobject {
    public static void main(String[] args) {
        ArrayList<String> inp = new ArrayList();
        inp.add("adding 1st element");
        inp.add("adding 2nd element");
        inp.add("adding 3rd element");
        inp.add("adding 4th element");
        inp.add("adding 5th element");
        inp.add("adding 6th element");
        int l=inp.size();
        inp.remove(l-1);
        for (String s : inp) {
            System.out.println(s);
        }
    }
}