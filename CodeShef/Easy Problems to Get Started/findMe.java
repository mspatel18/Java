//You are given a list of N integers and a value K. Print 1 if K exists in the given list of N integers, otherwise print −1.
import java.util.*;
class findMe {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// enter size
        int k = sc.nextInt();//enter number to find
        int integers[] = new int[n];
        String answer = "";
        String notanswer = "";
        for(int i = 0; i<n; i++){
            integers[i] = sc.nextInt();// enter data
            if(integers[i]==k){
                answer = "1";
            }else {
                notanswer = "-1";
            }
        }
        if(answer == "1"){
            System.out.println(answer);
        }
        if(answer !="1"){
            System.out.println(notanswer);
        }
        sc.close();
    }
}
// complete