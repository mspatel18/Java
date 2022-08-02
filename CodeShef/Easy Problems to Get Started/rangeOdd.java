// You're given two numbers L and R.
//  Print all odd numbers between L and R (both inclusive) in a single line separated by space, in ascending (increasing) order.
import java.util.*;
class rangeOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        for(int i = l; i<=r; i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}