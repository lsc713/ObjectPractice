import java.io.*;
import java.util.StringTokenizer;

public class Solution {
    static int N;
    static char[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};  // 8방향
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());
            map = new char[N][N];
            visited = new boolean[N][N];
            int result = 0;

            // 입력 (한 줄씩 문자열로 받음)
            for(int i = 0; i < N; i++) {
                String line = br.readLine();
                for(int j = 0; j < N; j++) {
                    map[i][j] = line.charAt(j);
                }
            }

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(!visited[i][j] && map[i][j] == '.' && countMines(i, j) == 0) {
                        dfs(i, j);
                        result++;
                    }
                }
            }

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(!visited[i][j] && map[i][j] == '.') {
                        result++;
                    }
                }
            }

            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
    }

    static int countMines(int x, int y) {
        int count = 0;
        for(int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(isValid(nx, ny) && map[nx][ny] == '*') {
                count++;
            }
        }
        return count;
    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        if(countMines(x, y) == 0) {
            for(int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(isValid(nx, ny) && !visited[nx][ny] && map[nx][ny] == '.') {
                    dfs(nx, ny);
                }
            }
        }
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }
}
