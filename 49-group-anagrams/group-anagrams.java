class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hmap = new HashMap<>();
        for(String s : strs)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!hmap.containsKey(sorted))
            {
                hmap.put(sorted,new ArrayList<String>());
            }
            hmap.get(sorted).add(s);
        }
        return new ArrayList<>(hmap.values());
    }
}