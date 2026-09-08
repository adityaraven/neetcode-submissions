class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> hm = new HashMap<>();

        for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){
            if(hm.containsKey(c)){
                hm.put(c, hm.getOrDefault(c,0)-1);
            }
        }

        for (Map.Entry<Character, Integer> hn : hm.entrySet()){
            if(hn.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}
