package innerclass;

import java.util.ArrayList;
import java.util.*;

public class ThreadC implements Runnable {
    Vector<ClassC> classCList ;


    ClassC classC ;
    ThreadC( Vector<ClassC> classC){
        this.classCList = classC;
    }

    public void run(){

        synchronized(classCList) {

            //   System.out.println(MainClass.randomGen(MainClass.names) + " Num :" );
            ClassC cc = new ClassC(MainClass.names.get(MainClass.randomGen(MainClass.names)), MainClass.ids.get(MainClass.randomGen(MainClass.ids)), MainClass.branches.get(MainClass.randomGen(MainClass.branches)));
            System.out.println(Thread.currentThread().getName() + " " + cc.toString());
            classCList.add(cc);

        }


    }
}
