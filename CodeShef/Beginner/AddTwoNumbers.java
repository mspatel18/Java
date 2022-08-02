package Beginner;

// The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains two Integers A and B.
import java.util.*;
class AddTwoNumbers  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//Enter number of inputs
        int n1 = 0;
        int n2 = 0;
        
        int i = 1;
        int j =0;
        while (i<=a) {
            
            while (j<=2) {
                n1 = sc.nextInt();//enter first number
                n2 = sc.nextInt();//enter second number
                System.out.println(n1 + n2);
                j++;
            }
            i++;
        }
        sc.close();

        }
    }

// for(int i = 1; i<=a; i++){
        //     for(int j = 1; j<=2;j++){
        //         n1 = sc.nextInt();
        //         n2 = sc.nextInt();
        //         System.out.println(n1 + n2);

        //     }