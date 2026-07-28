class Solution {
    public boolean isAnagram(String s, String t) {
            int n = s.length();
            int m = t.length();

            if(n!=m){
                return false;
            }
            HashMap<Character, Integer> hm = new HashMap<>();

            for( char c: s.toCharArray()){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }

            for(char c: t.toCharArray()){
                hm.put(c,hm.getOrDefault(c,0)-1);
            }

            for(Map.Entry<Character, Integer> pair: hm.entrySet()){
                if(pair.getValue()!=0){
                    return false;
                }
            }

           
            return true;
            }
    
}
