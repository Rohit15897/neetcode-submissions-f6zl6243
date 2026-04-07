class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
     for(String str : strs){
        char[] c = str.toCharArray();
        Arrays.sort(c);
        String temp = new String(c);
        if(map.containsKey(temp)){
            map.get(temp).add(str);
        }else{
            List<String> list = new ArrayList<>();
            list.add(str);
            map.put(temp, list);
        }

     }

     return new ArrayList<>(map.values());

    }
}
