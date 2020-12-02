import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        String[] arr_pages = br.readLine().split(" ");
        int[] pages = new int[k];
        for(int i_pages=0; i_pages<arr_pages.length; i_pages++)
        {
            pages[i_pages] = Integer.parseInt(arr_pages[i_pages]);
        }
        int out_ = getMaxScore(k, pages, n);
        System.out.println(out_);
        wr.close();
        br.close();
    }
    static int getMaxScore(int k, int[] pages, int n){ 
        long maxScore = 0;
        long mod = 1000000007;
        for(int i=0;i<k;i++) {
            long pageNumber = pages[i];
 
            long lastDigit = pageNumber % 10L;
            if(lastDigit < 2)
                maxScore += lastDigit;
            else {
                if(maxScore == 0)
                    maxScore = 1;
                maxScore *= lastDigit;
            }
            maxScore %= mod;
        }
        return (int)maxScore;
    }
}
