public class Manager extends Employee{

    Manager(String id, Department dept, int salary, String name){
        super(id,dept,salary,name);
    }
    public void setType(){
        super.setType(EmployeeType.MANAGER);
    }

}
