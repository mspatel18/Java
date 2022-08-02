import java.util.*;
public class INTRDSGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int sum1 = x1+y1;
            int sum2 = x2+y2;
            if(sum1<=sum2){
                System.out.println(sum1);
            }else{
                System.out.println(sum2);
            }
        }
        sc.close();
    }
}
