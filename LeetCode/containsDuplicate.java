/**
 * containsDuplicate
 */
//Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.

 
//import java.util.*;
public class containsDuplicate {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4};
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[i]!=arr[j+1]){
                    flag = 0;
                }
                else{
                    flag = 1;
                    break;
                }
            }
            
        }
        if (flag==1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}