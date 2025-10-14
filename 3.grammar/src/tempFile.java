import java.util.*;

public class tempFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caseCnt = 1;
        while ( in .hasNext()) {
            int n = in .nextInt();
            if (n == -1)
                break;
            long res = 1;
            for (int i = 1; i <= n; i++)
                res = res * (n + i) / i;
            res/=(n+1);
            res*=2;
            System.out.println(caseCnt + " " + n + " " + res);
            caseCnt++;
        } in .close();
    }
}