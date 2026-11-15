import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String str : args){ //loop trough args
        int value = (int) str.charAt(0); //int by default gives ascii value
        if (value%5 == 0){System.out.println(str.charAt(0));
        }; 
        }
    }
}
