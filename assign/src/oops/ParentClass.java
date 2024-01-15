package oops;

public class ParentClass {

    public int parentVariable;

    ParentClass(int parentVariable) {
        this.parentVariable = parentVariable;
    }
}


class Child extends ParentClass {
    public int childVariable;

    Child(int parentVariable, int childVariable) {
        super(parentVariable); // Initialize the parent class's variable
        this.childVariable = childVariable; // Initialize the child class's variable
    }

    // Overloaded constructor that takes only one parameter
    Child(int childVariable) {
        super(0); // Call the parent class's constructor with a default value for parentVariable
        this.childVariable = childVariable; // Initialize the child class's variable
    }
}
