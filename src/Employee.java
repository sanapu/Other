import java.util.Comparator;
import java.util.Objects;

public class Employee implements Person{

    private String id;
    private Department dept;
    private int salary;
    private String fullName;
    private EmployeeType type;

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
    }

    public Employee() {
    }

    public Employee(String id, Department dept, int salary, String fullName) {
        this.id = id;
        this.dept = dept;
        this.salary = salary;
        this.fullName = fullName;
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getFullName().compareTo(e2.getFullName());
    }

    public int compareTo(Employee e1, Comparator<Employee> comparator){
        return comparator.compare(this, e1);
    }

    @Override
    public boolean equals(Object o) {
        if(o==null) return false;
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getSalary() == employee.getSalary() &&
                getId().equals(employee.getId()) &&
                getDept() == employee.getDept();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDept(), getSalary());
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public Department getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @Override
    public String toString() {
        return "\nEmployee{" +
                "id='" + id + '\'' +
                ", dept=" + dept +
                ", salary=" + salary +
                ", fullName='" + fullName + '\'' +
                ", type=" + type +
                '}';
    }

}
