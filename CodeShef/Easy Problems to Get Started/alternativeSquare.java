// You're given a number N. Print the first N lines of the below-given pattern.

// 1 2 3 4 5
// 10 9 8 7 6
// 11 12 13 14 15
// 20 19 18 17 16
// 21 22 23 24 25
// 30 29 28 27 26
import java.util.*;
class alternativeSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(i%2 != 0 ){
            for(int j = 1;j<=5; j++){
                count = count + 1;
                System.out.print(count + " ");
            }
        }else {
            int temp = count+1;
            for(int j = count+5; j>=temp; j--){
                count = count + 1;
                System.out.print(j +" ");
            }
        }
        System.out.println();
        }
        sc.close();
    }
}
//complete