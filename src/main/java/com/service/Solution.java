
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            int n = Integer.parseInt(br.readLine());
            int check = (1<<n)-1;
            int result = n;
            int temp = 0;
            while(check != temp){
                char[] arr = String.valueOf(check).toCharArray();
                for(int j = 0 ; j <arr.length;j++){
                    temp = temp | (1<<(arr[i]-'0'));
                }
                result += n;

            }
            sb.append("#"+i+ " "+(result-n)).append("\n");
        }
        System.out.println(sb);
    }
}