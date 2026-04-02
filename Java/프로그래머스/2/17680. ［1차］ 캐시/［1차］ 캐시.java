import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int cnt = 0;
        // LinkedHashMap<Integer, String> q = new LinkedHashMap<>(3, 0.75f, true);
        
        Map<String, Integer> map = 
            new LinkedHashMap<String, Integer>(cacheSize, 0.75f, true) {
                protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                    return size() > cacheSize;
                }
        };
        
        for (String city : cities) {
            if (map.containsKey(city.toLowerCase())) {
                map.get(city.toLowerCase());
                answer += 1;
            } else {
                map.put(city.toLowerCase(), cnt ++);
                answer += 5;
            }
        }
        return answer;
    }
}