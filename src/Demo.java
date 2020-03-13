import java.util.Arrays;

public class Demo {

    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);
        int result = 1;
        for(int i=0;i<A.length;i++) {
            if(i==A.length-1){
                if(A[i] == result){
                    return (result+1);
                }
            }
            if (A[i] < result) {
                continue;
            }else if(A[i]==result && A[i]!=A[i+1]){
                result++;
            }
        }
        return result;
    }
}
