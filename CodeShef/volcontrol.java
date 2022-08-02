// The first line contains a single integer T - the number of test cases. Then the test cases follow.
// The first and only line of each test case contains two integers X and Y - the initial volume and final volume of the TV.
// Output Format
// For each test case, output the minimum number of times Chef has to press a button to change the volume from X to Y.

import java.util.*;
public class volcontrol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i<=t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if((x-y) >= 0) {
                System.out.println(x-y);
            }else{
                System.out.println(y-x);
            }
        }
        sc.close();
    }
}
