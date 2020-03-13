package stringproblems;

import java.util.*;

public class ValidAnagrams {
    public boolean isAnagram(String s, String t) {
//        Map<Character,Integer> map1 = createMap(s);
//        Map<Character,Integer> map2 = createMap(t);

//        return map2.entrySet().stream()
//                .allMatch(ele -> ele.getValue().equals(map1.get(ele.getKey())));

//        return map1.equals(map2);


        // using integer array

        int[] alphabet = new int[26];
        for(int i=0;i<s.toLowerCase().length();i++){
            alphabet[s.charAt(i)-'a']=alphabet[s.charAt(i)-'a']+1;
        }

        for(int i=0;i<t.toLowerCase().length();i++){
            int temp =t.charAt(i)-'a';
            if(alphabet[temp] >= 1){
                alphabet[temp] =alphabet[temp] -1;
            }else{
                alphabet[temp] =alphabet[temp] +1;
            }
        }

        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i] != 0)
                    return false;
        }


        return true;

    }

    public int firstuniqueCharacter(String s){
        if(s == null || s.isEmpty()){
           return -1;
        }
        char[] arr =s.toLowerCase().toCharArray();
        int[] alphabet = new int[26];
        for(int i=0;i<arr.length;i++){
            alphabet[arr[i]-'a']++;
        }

        for(int i=0;i<arr.length;i++){
           int temp = arr[i]-'a';
           if(alphabet[temp] == 1){
               return i;
           }
        }
        return -1;
    }

    private Map<Character,Integer> createMap(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else
                map.put(s.charAt(i),1);
        }
        return map;
    }
}
