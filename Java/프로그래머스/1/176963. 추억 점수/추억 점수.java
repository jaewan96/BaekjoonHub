import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> score = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            score.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i ++) {
            for (String person : photo[i]) {
                answer[i] += score.getOrDefault(person, 0);
            }
        }
        return answer;
    }
}