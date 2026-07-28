class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String news = new String(charArray);
            hm.putIfAbsent(news, new ArrayList<>());
            hm.get(news).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
