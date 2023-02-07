import java.util.Scanner;
public class BankAcc {
    private static int acc =1;
    private String name;
    private long acc_no;
    private String acc_type;
    private double acc_balance;
    public void CreateAcc(){
        Scanner sc = new Scanner(System.in);
        acc_no = acc;
        acc++;  
        System.out.println("Your acc no is: " + acc_no);
        System.out.println("Enter acc holder name: ");
        name = sc.nextLine();
	System.out.println("Enter acc type:");
	acc_type =sc.nextLine();
	//System.out.println("Enter acc balance:");
	//acc_balance = sc.nextDouble();

    }
    public void Deposit(){
	int deposit=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter amount you want to deposit: ");
	deposit = sc.nextInt();
	acc_balance += deposit;
    }
    public void Withdraw(){
	int withdraw=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter amount to be withdrawn:");
	withdraw = sc.nextInt();
	acc_balance -= withdraw;
    }
    public void BalaceInquiry(){
	System.out.println("Your balance is: "+acc_balance);
    }
}

class Main {
	public static void main(String[] args){
	BankAcc bankAcc1 = new BankAcc();
	bankAcc1.CreateAcc();
	bankAcc1.Deposit();
	bankAcc1.Withdraw();
	bankAcc1.BalaceInquiry();
	
	BankAcc bankAcc2 = new BankAcc();
	bankAcc2.CreateAcc();
	bankAcc2.BalaceInquiry();
}
	
}