// Chef went to a shop and buys a pens and b pencils. Each pen costs x units and each pencil costs y units. 
// Now find what is the total amount Chef will spend to buy a pens and b pencils.
import java.util.*;
class BuyPlease {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = a*x + b*y;
        System.out.println(sum);
        sc.close();
    }
}
