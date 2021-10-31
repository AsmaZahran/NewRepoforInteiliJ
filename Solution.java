import java.io.*;

class Result {
    public static int numOfPairs(long n) {
        int count = 0;
        for(int x = 1 ; x < n; x++)
            for (int y = 1; y < n ; y++){
                if ((x * x + y * y) == n * n)
                    count++;
            }
        System.out.println(count);
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        int ans = Result.numOfPairs(n);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
