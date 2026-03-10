import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//나이트 투어는 체스판에서 나이트가 모든 칸을 정확히 한 번씩 방문하며, 마지막으로 방문하는 칸에서 시작점으로 돌아올 수 있는 경로이다.
// 다음 그림은 나이트 투어의 한 예이다.
//영식이는 6×6 체스판 위에서 또 다른 나이트 투어의 경로를 찾으려고 한다. 체스판의 한 칸은 A, B, C, D, E, F 중에서
// 하나와 1, 2, 3, 4, 5, 6 중에서 하나를 이어 붙인 것으로 나타낼 수 있다.
// 영식이의 나이트 투어 경로가 주어질 때, 이것이 올바른 것이면 Valid, 올바르지 않으면 Invalid를 출력하는 프로그램을 작성하시오.
//입력
//36개의 줄에 나이트가 방문한 순서대로 입력이 주어진다. 체스판에 존재하는 칸만 입력으로 주어진다.
//        출력
//첫째 줄에 문제의 정답을 출력한다.
public class Main {

    static boolean [][] array = new boolean[6][6];


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] start = reader.readLine().toCharArray();
        int[] s = new int[2];

        s[0] = start[0] - 'A';
        s[1] = start[1] - '1';

        array[s[0]][s[1]] = true;
        boolean result = true;

        int beforeX = s[0];
        int beforeY = s[1];

        for (int i = 0; i < 35; i++) {
            char[] input = reader.readLine().toCharArray();

            int[] move = new int[2];
            move[0] = input[0] - 'A';
            move[1] = input[1] - '1';

            if (result ) {
                if (array[move[0]][move[1]]) {
                    result = false;
                }else if (!knight(move[0], move[1], beforeX, beforeY)) {
                    result = false;
                }
            }
            beforeX = move[0];
            beforeY = move[1];
        }

        if (result && knight(beforeX, beforeY, s[0], s[1])) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean knight(int x, int y, int a, int b) {

        int[] dx = new int[]{1, 1, -1, -1, 2, 2, -2, -2};
        int[] dy = new int[]{2, -2, -2, 2, 1, -1, -1, 1};

        for (int i = 0; i < 8; i++) {
            if (a + dx[i] == x && b + dy[i] == y) {
                array[x][y] = true;
                return true;
            }
        }

        return  false;
    }
}
