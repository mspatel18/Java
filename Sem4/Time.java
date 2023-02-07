import java.util.Scanner;
public class Time{
	int hour;
	int min;
	int sec;
	Time(int h,int m,int s){
		hour = h;
		min = m;
		sec = s;
	}
	Time(){
	
	}
	void TimeSum(Time t1){
		Time t3 = new Time();
		t3.hour = t1.hour + hour;
		t3.min = t1.min + min;
		t3.sec = t1.sec + sec;
		if(t3.sec>60){
			t3.sec-=60;
			t3.min+=1;
		}
		if(t3.min>60){
			t3.min-=60;
			t3.hour+=1;
		}
		if(t3.hour>60){
			t3.hour-=60;	
		}
		System.out.println(t3.hour+":"+t3.min+":"+t3.sec);

	}
	void display(){
		System.out.println(hour+":"+min+":"+sec);
	}
}
class Main{
	public static void main(String[] args){
		Time t1 = new Time(10,43,5);
		Time t2 = new Time(11,10,59);
		t1.display();
		t2.display();
		t1.TimeSum(t2);
		
	}
}