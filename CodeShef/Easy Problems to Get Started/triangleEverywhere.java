//You're given the length of three sides a, b, and c respectively
//Now If these three sides can form an Equilateral Triangle then print 1,
// if these three sides can form an Isosceles Triangle then print 2,
// if these three sides can form a Scalene Triangle then print 3, otherwise print −1.
import java.util.*;
class triangleEverywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double s = (a+b+c)/2;
        double area = s*(s-a)*(s-b)*(s-c);
        area = Math.sqrt(area);
        if(area>0){
            if(a==b&&b==c){
                System.out.println("1");
            }else if(a==b&&b!=c){
                System.out.println("2");
            }else if(a==c&&c!=a){
                System.out.println("2");
            }else if(b==c&&a!=c){
                System.out.println("2");
            }else if(a!=b&&b!=c){
                System.out.println("3");
            }
        }
        else{
            System.out.println("-1");
        }
        sc.close();
    }
}
//complete