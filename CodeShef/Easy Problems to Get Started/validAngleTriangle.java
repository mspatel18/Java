//You're given the three angles a, b, and c respectively.
// Now check if these three angles can form a valid triangle with an area greater than 0 or not.
// Print "YES"(without quotes) if it can form a valid triangle with an area greater than 0, otherwise print "NO" (without quotes).
import java.util.*;
class validAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        if(sum == 180){
            }else{
            System.out.println("NO");
        }
        sc.close();
    }
}
