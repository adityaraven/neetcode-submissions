class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for(String s: strs){
            char [] chararray = s.toCharArray();
            Arrays.sort(chararray);
            String news = new String(chararray);
            hm.putIfAbsent(news , new ArrayList<>());
            hm.get(news).add(s);
        }

        return new ArrayList<>(hm.values());
    }
}
