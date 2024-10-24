class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};
        for (String word : babbling) {
            boolean check = false;
            for (String pos : possible) {
                if (word.contains(pos + pos)) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                String checkWord = word;
                for (String pos : possible) {
                    checkWord = checkWord.replaceAll(pos, " ");
                }
                checkWord = checkWord.replaceAll(" ", "");
                if (checkWord.isEmpty()) {
                    answer += 1;
                }
            }
        }
        return answer;
    }
}