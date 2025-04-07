import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(reader.readLine());
            int[] teamCount = new int[201];
            int[] severalScore = new int[N];

            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < N; j++) {
                int team = Integer.parseInt(st.nextToken());
                severalScore[j] = team;
                teamCount[team] ++;
            }

            Set<Integer> teamCan = new HashSet<>();
            for (int j = 0; j < 201; j++) {
                if (teamCount[j] == 6) {
                    teamCan.add(j);
                }
            }

            HashMap<Integer, Integer> teamScore = new HashMap<>();
            HashMap<Integer, Integer> scoreCount = new HashMap<>();
            int[] fifth = new int[201];
            int score = 1;
            for (int j = 0; j < N; j++) {
                if (teamCan.contains(severalScore[j])) {
                    if (scoreCount.getOrDefault(severalScore[j], 0) < 5) {
                        teamScore.put(severalScore[j], teamScore.getOrDefault(severalScore[j], 0) + score);
                        scoreCount.put(severalScore[j], scoreCount.getOrDefault(severalScore[j], 1) + 1);
                    } else if (scoreCount.get(severalScore[j]) == 5) {
                        fifth[severalScore[j]] = score;
                        scoreCount.put(severalScore[j], scoreCount.getOrDefault(severalScore[j], 1) + 1);
                    }
                    score++;
                }
            }

            int minScore = 6000;
            int idx = 0;
            for (int key : teamCan) {
                int value = teamScore.get(key);
                if (value < minScore) {
                    minScore = value;
                    idx = key;
                } else if (value == minScore && fifth[idx] > fifth[key] ) {
                    idx = key;
                }
            }
            result.append(idx).append("\n");
        }
        System.out.println(result);
    }
}
