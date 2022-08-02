// You're given a number N. If N is divisible by 5 or 11 but not both then print "ONE"(without quotes). 
// If N is divisible by both 5 and 11 then print "BOTH"(without quotes). If N is not divisible by 5 or 11 then print "NONE"(without quotes).
import java.util.*;
class IsBothOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%5 == 0 && N%11 == 0){
            System.out.println("BOTH");
        }else if(N%5 == 0 || N % 11 == 0){
            System.out.println("ONE");
        }else{
            System.out.println("NONE");
        }
        sc.close();
    }
}
