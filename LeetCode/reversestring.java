public class reversestring {
    public static void reverseString(String s) {
        char temp ='a';
        int i = 0;
        int j=s.length()-1;
        while(i!=j && j!=i-1){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i += 1;
            j -= 1;
        }
        return;
    }
    public static void main(String[] args) {
        String s = "hello";
        s="hello";
        reverseString(s);
        System.out.println(s); 

    }
}
