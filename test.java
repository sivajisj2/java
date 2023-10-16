import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("enter num of iterations: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for ( int sj = 0; sj< number; sj++){
            System.out.println("Being SJ is not EASY");
            System.out.println();
        }

    }
    
}
