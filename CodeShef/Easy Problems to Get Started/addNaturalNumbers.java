//You are given a number N. Find the sum of all numbers from 1 to N.
import java.util.*;
class addNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//enter n 
        int a = 0;
        int i = 1;
        // for(int i = 1; i<=n;i++){
        //     a=a+i;//a will be keep on adding until loop ends
        // }
        // System.out.println(a);
        while (i<=n) {
            a =a +i;
            i = i+1;
        }
        System.out.println(a);
        sc.close();
    }    
}
//complete