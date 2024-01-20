package objectarrays;

public class Person {
    private int height;
    private int weight;
    private int ssn;
    private String phoneNumber;
    public Person(int height, int weight, int ssn, String phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.ssn = ssn;
        this.phoneNumber = phoneNumber;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Person)) {
            return false;
        }
        Person otherPerson = (Person) obj;

        return this.ssn == otherPerson.ssn;
    }
    public static void main(String[] args) {
        Person p1 = new Person(4, 140, 3942, "4567896545");
        Person p2 = new Person(5, 120, 2376 , "2987255678");

        boolean isequal = Integer.valueOf(p1.ssn).equals(Integer.valueOf(p2.ssn));
        System.out.println(isequal);
    }
}