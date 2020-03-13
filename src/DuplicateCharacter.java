import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

    public String duplicateChars(String s){
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();

        for(int i =0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
               sb.append(s.charAt(i)) ;
            }else{
                map.put(s.charAt(i),1);
            }
        }
       return sb.toString();
    }
}
