package collections;

import java.util.ArrayList;

public class ArrayListStrings {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");
        stringList.add("Element 5");

        System.out.println("Traversing ArrayList using for loop:");
        traverseArrayList(stringList);
    }

    public static void traverseArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}