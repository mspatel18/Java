import java.util.*;
public class nIsWierd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 !=0){
            System.out.println("Weird");
        }
        else if(n>20){
            System.out.println("Not Weird");
        } else if(n>=6){
            System.out.println("Weird");
        } else if(n>=2){
            System.out.println("Not Weird");
        } else if(n>=100){
            System.out.println("Print number less than 100");
        } else if(n<1){
            System.out.println("Print number greater or equal to 1");
        }
        sc.close();

    }
}
