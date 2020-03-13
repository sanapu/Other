import java.util.Comparator;

public interface Person extends Comparator<Employee> {
     static void print(){
        System.out.println("This is Person Interface");
    }

    default void callDefault() {
        System.out.println("This is default method in Person Interface");
    }
}
