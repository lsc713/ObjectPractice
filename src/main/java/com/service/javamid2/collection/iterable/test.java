import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= 10; test_case++) {
            int answer = 0;
            sc.nextInt();  // 테스트 케이스 번호는 사용하지 않으므로 입력만 받고 버립니다.
            sc.nextLine(); // 다음 줄로 이동합니다.

            char[][] map = new char[100][100];
            for (int i = 0; i < 100; i++) {
                String input = sc.nextLine();
                for (int j = 0; j < 100; j++) {
                    map[i][j] = input.charAt(j);
                }
            }

            for (int l = 100; l > 0; l--) {
                if (answer >= l) break;
                // 가로 방향 탐색
                for (int i = 0; i < 100; i++) {
                    for (int j = 0; j <= 100 - l; j++) {
                        if (isPalindrome(map, i, j, l, true)) {
                            answer = l;
                            break;
                        }
                    }
                }
                // 세로 방향 탐색
                for (int j = 0; j < 100; j++) {
                    for (int i = 0; i <= 100 - l; i++) {
                        if (isPalindrome(map, i, j, l, false)) {
                            answer = l;
                            break;
                        }
                    }
                }
            }
            sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }

    static boolean isPalindrome(char[][] map, int x, int y, int length, boolean isRow) {
        for (int i = 0; i < length / 2; i++) {
            if (isRow) {
                if (map[x][y + i] != map[x][y + length - 1 - i]) {
                    return false;
                }
            } else {
                if (map[x + i][y] != map[x + length - 1 - i][y]) {
                    return false;
                }
            }
        }
        return true;
    }
}