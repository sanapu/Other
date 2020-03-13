package innerclass;

public class HammingDistance {

    public int hammingDistance(int x, int y){

        String differences = Integer.toBinaryString(x ^ y);
System.out.println(x ^ y);
        int sum = 0;
        for(int index = 0; index < differences.length(); index++)
            if(differences.charAt(index) == '1')
                sum++;

        return sum;
    }
}
