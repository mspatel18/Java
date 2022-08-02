// You are given a number N and find all the distinct factors of N.
import java.util.*;
class FactorFinding {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Enter N
        int sum = 0;
        String factors = "";
        for(int i = 1; i<=N; i++){
            if(N%i == 0){
                sum++;
                //System.out.print(i +" ");
                factors +=(i + " ");
            }
        }
        // number of factor found
        System.out.println(sum);
        System.out.println(factors);
        sc.close();
    }
}
// completed