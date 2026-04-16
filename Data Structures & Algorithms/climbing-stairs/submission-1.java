class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return climbStairs(n, map);
    }

    public int climbStairs(int n, Map<Integer, Integer> map){
        if(map.containsKey(n))
            return map.get(n);
        
        if(n == 1)
            return 1;
        
        if(n <= 2)
            return 2;

        map.put(n, climbStairs(n - 1, map) + climbStairs(n - 2, map));

        return map.get(n);
    }
}
