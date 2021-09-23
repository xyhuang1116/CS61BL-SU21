import java.util.*;

public class CodingChallenges {

    /**
     * Return the missing number from an array of length N containing all the
     * values from 0 to N except for one missing number.
     */
    public static int missingNumber(int[] values) {
        /** Ex:
        List<Integer> list = Arrays.stream(values).boxed().toList();
        for(int i = 0; i < values.length; i++){
            if(!list.contains(i)){
                return i;
            }
        }
        return -1;
        */
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= values.length; i++){list.add(i);}
        for(int j : values){list.remove((Integer) j);}
        return list.get(0);
    }

    /**
     * Returns true if and only if two integers in the array sum up to n.
     * Assume all values in the array are unique.
     */
    public static boolean sumTo(int[] values, int n) {
        Set<Integer> set = new HashSet<>();
        for(int i : values){set.add(i);}
        for(int j : values){
            if(set.contains(n-j)&& n != 2*j){return true;}}
        return false;
    }

    /**
     * Returns true if and only if s1 is a permutation of s2. s1 is a
     * permutation of s2 if it has the same number of each character as s2.
     */
    public static boolean isPermutation(String s1, String s2) {
        Map<Character,Integer> map = new HashMap<>();
        // convert s1 to map
        for(char c: s1.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                Integer value = map.get(c);
                map.replace(c,value,value+1);
            }
        }
        for(char ch: s2.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }else{
                Integer value = map.get(ch);
                if(value == 1){map.remove(ch);}else{map.replace(ch,value,value-1);}
            }
        }
        if(map.isEmpty()){
            return true;
        }
        return false;
    }
}