//You're given the length of three sides a, b, and c respectively. 
//Now check if these three sides can form a triangle or not.
//Print "YES"(without quotes) if it can form a valid triangle with an area greater than 0, otherwise print "NO" (without quotes).
import java.util.*;
class validTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double s = (a+b+c)/2;
        double area = (s*(s-a)*(s-b)*(s-c));
        area = Math.sqrt(area);
        if(area>0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    sc.close();
    }
}
//complete
