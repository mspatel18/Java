import java.util.*;

public class fairpass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            if(K>N){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");   
            }
        }
        sc.close();
    }
}
