import java.util.*;
class Solution {
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int row;
    static int col;
    
    public int solution(int[][] maps) {
        row = maps.length;
        col = maps[0].length;
        visited = new boolean[row][col];
        int answer = bfs(maps);
        return answer;
    }
    
    public static int bfs(int[][] arr) {
        Deque<Node> q = new LinkedList<>();
        q.add(new Node(0, 0, 1));
        visited[0][0] = true;
        while (!q.isEmpty()) {
            Node node = q.removeFirst();
            int x = node.row;
            int y = node.col;
            int count = node.cnt;
            if (x == row-1 && y == col-1) {
                return count;
            }
            for (int i = 0; i < 4; i ++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < row && nx >= 0 && ny >= 0 && ny < col && !visited[nx][ny] && arr[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    q.add(new Node(nx, ny, count + 1));
                }
            }
        }
        return -1;
    }
}

class Node {
    int row;
    int col;
    int cnt;
    
    public Node(int row, int col, int cnt) {
        this.row = row;
        this.col = col;
        this.cnt = cnt;
    }
}