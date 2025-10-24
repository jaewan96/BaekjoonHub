
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[20][20];

        for (int i = 1; i < 20; i++) {
            String[] input = reader.readLine().split(" ");
            for (int j = 1; j < 20; j++) {
                arr[i][j] = Integer.parseInt(input[j-1]);
            }
        }

        int [] result = check(arr);
        StringBuilder e = new StringBuilder();

        if (result[0] == 0) {
            System.out.println(0);
        } else {
            e.append(result[0]).append('\n');
            e.append(result[1]).append(" ").append(result[2]);
            System.out.println(e);
        }


    }

    public static int[] check(int[][] arr) {
        int[] dx = new int[]{1, 0, -1, 1};
        int[] dy = new int[]{0, 1, 1, 1};

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                if (arr[i][j] != 0) {
                    for (int k = 0; k < 4; k++) {
                        int x = dx[k] + i;
                        int y = dy[k] + j;
                        if (x > 0 && y > 0 && x < 20 && y < 20 && arr[x][y] == arr[i][j]) {
                            int beforeX = i - dx[k];
                            int beforeY = j - dy[k];
                            if (beforeX <= 0 || beforeY <= 0 || beforeX >= 20 || beforeY >= 20) {
                                boolean find = win(arr, dx[k], dy[k], x, y, arr[i][j]);
                                if (find) {
                                    int[] r = new int[]{arr[i][j], i, j};
                                    return r;
                                }
                            } else if (arr[beforeX][beforeY] != arr[i][j]) {
                                boolean find = win(arr, dx[k], dy[k], x, y, arr[i][j]);
                                if (find) {
                                    int[] r = new int[]{arr[i][j], i, j};
                                    return r;
                                }
                            }
                        }
                    }
                }
            }
        }
        int[] r = new int[]{0};
        return r;
    }

    public static boolean win(int[][] arr, int dx, int dy, int x, int y, int num) {
        int cnt = 2;
        boolean check = false;

        while (true) {
            if (cnt == 5) {
                check = true;
            } else if (cnt > 5) {
                check = false;
                break;
            }
            x += dx;
            y += dy;
            if (x >= 20 || y >= 20 || x <= 0 || y <= 0) {
                break;
            }

            if (arr[x][y] == num) {
                cnt++;
            } else {
                break;
            }

        }
        return check;
    }
}
