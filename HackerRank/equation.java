import java.util.*;
public class equation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int q = sc.nextInt();
           
            for(int i=1;i<=q;i++)
            {
                int result = 0;
                int a=sc.nextInt();
                int b=sc.nextInt();
                int n=sc.nextInt();
                result = a+result;
                for(int j=n;j>=1;j--)
                {
                    int pow = (int) Math.pow(2, n-j);
                    result = result + pow*b;
                    System.out.print(result + " ");
                }
                System.out.println();
                
                
            }
            sc.close();
        }
}
