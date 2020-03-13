package innerclass;

import org.junit.jupiter.api.Test;

class HammingDistanceTest {

    @Test
    void hammingDistance() {
        HammingDistance hd = new HammingDistance();
        int res = hd.hammingDistance(1,4);
        System.out.println(res);
    }
}