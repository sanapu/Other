package innerclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassATest {
    ClassA ca ;
    @BeforeEach
    void setUp() {
        ca = new ClassA();
    }

    @Test
    void generateHeader() {
        System.out.println("========== generateHeader ===========");
        ClassA.generateHeader("FD669FA7");
    }

    @Test
    void generateFooter() {
        System.out.println("========== generateFooter ===========");
        String[] a = {"1","200.00","57"};
        ClassA.generateFooter(a);
    }

    @Test
    void generateRecord() {
        System.out.println("========== generateRecord ===========");
        String[] a = {"IT","PaymentDesc","2019-07-13 17:54:37.000","Corine","FD669FA799633608","200.00","1282055954","Corine","000279793575","Passportno"};
        ClassA.generateRecord(a);
    }

    @Test
    void generatePaymentAdvice() {
        System.out.println("========== generatePaymentAdvice ===========");
        String[] a = {"FD669FA799633608","devqa@ilts.com","AdvDetail","200.00"};
        ClassA.generatePaymentAdvice(a);
    }
}