import java.util.stream.IntStream;

public class String1 {

    public static void main(String[] args) throws InterruptedException {
    // int n = 100;
    // long startTime = System.currentTimeMillis();
    // String s = Integer.toString(n);
    // System.out.println("Integer.toString time -> " + (System.currentTimeMillis() - startTime));

    // for(int i=5 ; i>=0; i--) {
    //     System.out.println("*".repeat(i));  
    // }

    IntStream.range(1, 6).forEach(i -> System.out.println("*".repeat(i)));
}
}