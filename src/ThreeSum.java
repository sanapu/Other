import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum
{
    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        ThreeSum ts = new ThreeSum();
        ts.tripleSum(list,6);

    }

    private void tripleSum(List<Integer> list, int tareget){

        Map<Integer,Integer> map1 = new HashMap<>();

        for(int i=0;i<list.size();i++){
//            List<Integer> localList = new ArrayList<>(1);
//            localList.add(list.get(i));
            map1.put((tareget-list.get(i)),list.get(i));
        }
        List< Map<Integer,Integer> > ablist = new ArrayList<>();
      //  Map<Integer,Integer> abmap = new HashMap<>();
        for(Map.Entry<Integer,Integer> o: map1.entrySet()){
            int keyTarget = o.getKey();
            Map<Integer,Integer> abmap = new HashMap<>();
            for(int i=0;i<list.size();i++){
//                if(o.getValue() != list.get(i)) {
                    if (!abmap.containsKey(list.get(i)))
                        abmap.put((keyTarget - list.get(i)), list.get(i));
//                }

            }
            ablist.add(abmap);
        }
//        for(Map.Entry<Integer,List<Integer>> o: map1.entrySet()) {
//            List<Integer> localList = o.getValue();
//            for (Map.Entry<Integer, Integer> o1 : abmap.entrySet()) {
//                if (list.contains(o1.getKey())) {
//                    localList.add(o1.getValue());
//                    localList.add(o1.getKey());
//                }
//            }
//        }

        System.out.println(map1);

    }

    private static List<List<Integer>> threeSum(List<Integer> numbers, int target)
    {
        Map<Integer, List<Integer>> aPlusBMap = new HashMap<Integer, List<Integer>>();

        ArrayList<Integer> currentPair;

        //Populate the aPlusB map
        for (int firstIndex = 0; firstIndex < numbers.size(); firstIndex++) {
            for(int secondIndex = firstIndex + 1; secondIndex < numbers.size(); secondIndex++)
            {
                currentPair = new ArrayList<>(2);
                currentPair.add(numbers.get(firstIndex));
                currentPair.add(numbers.get(secondIndex));
                aPlusBMap.put(numbers.get(firstIndex) + numbers.get(secondIndex), currentPair);
            }
        }

        //Find C

        List<Integer> currentTriplet;
        List<List<Integer>> allThreeSums = new ArrayList<>();

        List<Integer> aAndB;

        for(Integer c : numbers)
        {
            if(aPlusBMap.containsKey(target - c))
            {
                currentTriplet = new ArrayList<>(3);

                aAndB = aPlusBMap.get(target - c);

                currentTriplet.add(aAndB.get(0));
                currentTriplet.add(aAndB.get(1));
                currentTriplet.add(c);

                allThreeSums.add(currentTriplet);
            }

        }

        return allThreeSums;
    }
}
