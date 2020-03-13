import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommonElements {

    public int[] commonElements(int[] nums1,int[] nums2){

        // better optimized way of doing it is sort both arrays
        // create a list and loop using while. if both elements matches then increment indices of both arrays
        // else increment one at a time checking if the elements are greater or smaller

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map1 = convertMap(nums1);
        HashMap<Integer,Integer> map2 = convertMap(nums2);
        boolean size1 = false;

            for(Map.Entry<Integer,Integer> map: map1.entrySet()){
                if(map2.containsKey(map.getKey())){
                    int num = Math.min(map2.get(map.getKey()),map.getValue());
                    list = createList(list,map.getKey(),num);
                }
            }
        int[] res = new int[0];
        if(!list.isEmpty())
            res = list.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
    public HashMap<Integer,Integer> convertMap(int[] A){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+1);
            } else {
                map.put(A[i], 1);
            }
        }
        return map;
    }
    public ArrayList<Integer> createList(ArrayList list,int key, int val){

        for(int i=val;i>0;i--){
            list.add(key);
        }
        return list;
    }
}
