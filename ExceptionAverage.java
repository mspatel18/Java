import java.util.*;
class ExceptionAverage {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			try{
				if(arr[i]<0){
					throw new Exception("Value less than 0");
				}
				else if(arr[i]==0){
					throw new Exception("Value is 0");
				}
			}
			catch (Exception e){
				System.out.println("Caught Exception");
				System.out.println(e.getMessage());
				i--;
			}
			sum+=arr[i];
		}		
		System.out.println("Average: "+ sum/n);	
}
