public class powerx {
    public static double myPow(double x, int n) {
        double ans=1;
        if(n>=0){
            for (int i = 0; i < n; i++) {
                ans = ans*x;
            }
        }else{
            for (int i = 0; i < -n; i++) {
                ans = ans*(1/x);
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        double x=2;
        int n=-2;
        double sol = myPow(x, n);
        System.out.println(sol);
    }
}
