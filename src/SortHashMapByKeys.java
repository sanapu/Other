import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortHashMapByKeys {

    public List<Integer> sortByKeys(HashMap<Integer,Integer> map){
//        Set<Integer> set = map.keySet();
//        List<Integer> list=set.stream().collect(Collectors.toList());


        List<Integer> result = new ArrayList<>(map.size());
        result.addAll(map.keySet());
        //result.sort();
        Collections.sort(result);
        return result;

   //   return  list;
    }
}
