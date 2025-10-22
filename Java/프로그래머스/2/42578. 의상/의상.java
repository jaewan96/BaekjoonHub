import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, List<String>> cloth_kind = new HashMap<>();
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < clothes.length; i ++) {
            String kind = clothes[i][1];
            String cloth = clothes[i][0];
            
            set.add(kind);
            cloth_kind.computeIfAbsent(kind, x -> new ArrayList<>()).add(cloth);
        }
        
        if (set.size() == 1) {
            for (String s : set) {
                answer = cloth_kind.get(s).size();
            }
        } else {
            int cnt = 1;
            for (String s : set) {
                cnt *= (cloth_kind.get(s).size() + 1);
            }
            answer = cnt - 1;
        }
        return answer;
    }
}