import java.util.Arrays;

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int[] fib = new int[x];
        int first = 1, second = 1;
        fib[0] = 1;
        fib[1] = 1;
        for (int idx = 2; idx <x; idx++){ // 0...x-1
        int next = first + second; // compute new item
        first = second; //move 2nd previous up 
        fib[idx] = next; // insert curr into the array 
        second = next; //move previous up
    }
    //System.out.println(Arrays.toString(fib));
    // fib = [1,1,2,3,5,8,13,21,34...]
        int numOdd = 0;
        for (int i = 0; i < x; i++) { // i in range(x)
            System.out.print(fib[i]);
            if (fib[i]% 2 != 0){
                numOdd++;
            }
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        ////////////////////////////////////////////////////////////////
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
