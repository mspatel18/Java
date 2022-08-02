//Raju is planning to visit his favourite restaurant. He shall travel to it by bus. 
//Only the buses whose numbers are divisible by 5 or by 6 shall take him to his destination.
// You are given a bus number N. Find if Raju can take the bus or not. Print YES if he can take the bus, otherwise print NO
import java.util.*;
class rajuTrip {
    public static void main(String argsp[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%5 == 0 || n%6 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}
// complete