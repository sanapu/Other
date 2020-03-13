import java.util.*;

public class SortCustomObject {

    public static void main(String[] args) {
        List<Employee> listOfEmp = new ArrayList<>();
        Employee emp1 = new Employee("EMP1",Department.IT,100000000,"Steve Jobs");
        emp1.setType(EmployeeType.DIRECTOR);
        listOfEmp.add(emp1);

        emp1 = new Employee("EMP3",Department.FINANCE,155000,"Adam Jobs");
        emp1.setType(EmployeeType.ASSOCIATE);
        listOfEmp.add(emp1);

        Manager man = new Manager("EMP4",Department.IT,155060,"Anand Jobs");
        man.setType();
        listOfEmp.add(man);

        emp1 = new Employee("EMP2",Department.HR,107000,"Allen Jobs");
        emp1.setType(EmployeeType.ASSOCIATE);
        listOfEmp.add(emp1);



        System.out.println(listOfEmp.toString());
        Collections.sort(listOfEmp,new CustomComparator());

        System.out.println(listOfEmp.toString());

        Collections.sort(listOfEmp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() > o2.getSalary() ? 0 : -1;
            }
        });

        System.out.println(listOfEmp.toString());
        Person.print();
        Person p = new Manager("EMP2",Department.HR,107000,"Allen Jobs");
        p.callDefault();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run()
            {
                System.out.println("Shutdown hook");
            }
        });




            try{
            System.out.println("Try block");
            throw new RuntimeException("BAD BAD");

        }
        catch(Exception e){

            System.out.println("Exception block");
          //  System.exit(0xBAD);

        }finally{
            System.out.println("finally block");
        }

    }
}
