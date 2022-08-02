// You are given a list of N integers and you need to reverse it and print the reversed list in a new line
import java.util.*;
class reverseMe {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// enter size
        int integers[] = new int[n];
        for(int i = 0; i<n; i++){
            integers[i] = sc.nextInt();// enter data
        }
        for(int i = n-1; i>=0; i--){
            System.out.print(integers[i] + " ");
        }
        sc.close();
    }
}
// complete