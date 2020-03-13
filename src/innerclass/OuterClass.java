package innerclass;

public class OuterClass {
    int outer = 89;
    static int staticOut = 43;

    String outerString = " Hello Outer ";
    static String staticOuterString = " Hello StaticOuterClass ";

    public static class StaticInnerClass{

        StaticInnerClass(String staticOuterString){
            OuterClass.staticOuterString = staticOuterString;
        }
        public void staticInnerMethod(){
            System.out.println(" Static inner class "+staticOut +" "+staticOuterString);
        }

    }
    public class InnerClass{
        InnerClass(String staticOuterString,String outerString){

            OuterClass.staticOuterString = staticOuterString;
            outerString = outerString;
        }
        public void innerMethod(){
            System.out.println(" Inner class static content "+staticOut +" "+staticOuterString);
            System.out.println(" Inner class "+staticOut +" "+staticOuterString);
        }

    }


}
