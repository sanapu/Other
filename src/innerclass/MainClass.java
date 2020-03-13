package innerclass;

import javax.swing.text.MutableAttributeSet;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClass {
    static List<String> names;
    static List<String> ids;
    static List<String> branches;

    public static void main(String[] args) throws InterruptedException{
//        System.out.println("OuterClass: staticOuterString: "+OuterClass.staticOuterString+" staticOut "+OuterClass.staticOut);
//        OuterClass outerClass = new OuterClass();
//        System.out.println("OuterClass: outerString: "+outerClass.outerString + " outer: " + outerClass.outer);
//        OuterClass.InnerClass  innerClass = outerClass.new InnerClass("inner Class access to Static ","innser Class access to non static ");
//        System.out.println("InnerClass: outerString: "+outerClass.staticOuterString + " outer: " + outerClass.outerString);
//        innerClass.innerMethod();
//        OuterClass.StaticInnerClass outerStaticClass = new OuterClass.StaticInnerClass("Static InnerClass access to static");
//        System.out.println("Static InnerClass: outerString: "+outerClass.staticOuterString + " outer: " + outerClass.outer);
//        outerStaticClass.staticInnerMethod();
//
//        System.out.println("Static InnerClass: outerString: "+outerClass.staticOuterString + " outer: " + outerClass.outer);
//        System.out.println();
        names = new ArrayList<>();
        names.add("Kriti");names.add("Keerti");
        names.add("Shruti");names.add("Sankeerti");
        names.add("Preeti");names.add("Suravi");
        names.add("Riti");names.add("Sri");
        names.add("Rishi");


        ids = new ArrayList<>();
        ids.add("1");ids.add("2");ids.add("3");
        ids.add("4");ids.add("5");ids.add("6");
        ids.add("7");ids.add("8");ids.add("9");

        branches = new ArrayList<>();
        branches.add("Electrical");branches.add("History");
        branches.add("Electronics");
        branches.add("Maths");
        branches.add("Science");


        Vector<ClassC> list = new Vector<>();
        Vector<ClassC> other = new Vector<>();
      //  ExecutorService service= Executors.newFixedThreadPool(2);
        Runnable run = new ThreadC(list);
        Runnable run1 = new ThreadC(other);
        for(int i=0;i<100;i++){
            Thread t = new Thread(run);
            t.start();

          //  service.submit(new ThreadC(list));
          //  list.add((ClassC) obj);
        }
        for (int i = 0;i<50;i++){
            Thread t2 = new Thread(run1);
            t2.start();
        }

        System.out.println(list.toString());
      //  service.shutdown();
        System.out.println(list.size());

//        Thread t1 = new ThreadC("1",10,0,classCList);
//        t1.start();



    }
    static int randomGen(List list){
        int range = ((list.size()-1)-1)+1 ;
        return (int) (Math.random()*range) ;
    }


}
