import java.util.*;
public class divisorContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("T");
        int t = sc.nextInt();
        System.out.println("n");
        int n = sc.nextInt();
        System.out.println("m");
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=1;i<=t;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[j] = (int) sc.nextInt();
            }
            for(int j=0;j<m;j++)
            {
                b[j] = (int) sc.nextInt();
            }
            
        }
        //check with 1st
        // int cnt=0;
        for(int i =0;i<=m;i++)
        {
            for(int j= 0;j<=n;j++)
            {
                if(b[i]%a[j]==0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
