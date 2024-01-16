package oops;

abstract class Department {
    public abstract int getDepartmentSize();

}
class SubDepartment extends Department{
    private int DepartmentSize;
u
    public SubDepartment(int DepartmentSize){
        this.DepartmentSize=DepartmentSize;
    }
    @Override
    public int getDepartmentSize() {
        return DepartmentSize;
    }
}