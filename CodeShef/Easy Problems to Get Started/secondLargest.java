// Given three distinct integers A, B and C, print the second largest number among them.
import java.util.*;
class secondLargest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && b>c){// a=3 b=2 c=1
            System.out.println(b);
        }else if(c>b && b>a){ // a=1 b=2 c=3
            System.out.println(b);
        }else if(a>c && c>b){ // a= 3 b=1 c= 2
            System.out.println(c);
        }else if(b>c && c>a){ //a =1 b=3 c=2 
            System.out.println(c);
        }else if(c>a && a>b){// a =2 b=1 c= 3
            System.out.println(a);
        }else if(b>a && a>c){// a=2 b=3 c=1
            System.out.println(a);
        }
    sc.close();
    }
}
