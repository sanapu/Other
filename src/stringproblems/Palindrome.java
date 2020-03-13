package stringproblems;

public class Palindrome {

    public boolean isPalindrome(String s) {

        char[] array = s.toLowerCase().toCharArray();

        int i=0; int j = array.length-1;
        while(i<j){
            if(!Character.isLetterOrDigit(array[i]))
                i++;
            else if(!Character.isLetterOrDigit(array[j]))
                j--;
            else if(array[i]!=array[j]){
                return false;
            }else{
                i++;
                j--;
            }
        }


        return true;
    }


    public int myAtoi(String str) {
        if(str == null || str.isEmpty()){
            return 0;
        }
        String[] split = str.trim().split(" ");
        String num = split[0].trim();

        String regex = "[!@#$%&*()_+=|<>?{}\\[\\]~]";
        if(num.matches(regex)){
            return 0;
        }
        for(int i=0;i<num.length();i++){
            if(Character.isLetter(num.charAt(i)) || Character.i){
                return  0;
            }
        }

        int res = 0;
        try{

            if(str.contains(".")){
            res = (int)Double.parseDouble(str);
            }else
                res = Integer.parseInt(num);

        }catch(Exception e){
            if(str.startsWith("-")){
                res = Integer.MIN_VALUE;
            }else
                res =Integer.MAX_VALUE;
        }

        return  res;
    }
}
