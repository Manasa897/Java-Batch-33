package oops;

public class Main {
    public static void main(String[] args) {
        //Creating an object
        SubDepartment SubDepartment=new SubDepartment(25);
        int size = SubDepartment.getDepartmentSize();
        System.out.println("Department size" + " "+ size);
    }
}

