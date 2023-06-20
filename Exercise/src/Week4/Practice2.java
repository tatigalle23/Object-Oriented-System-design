package Week4;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int num1=keyboard.nextInt();
        int num2= keyboard.nextInt();
        int quotient=num1/num2;
        int remainder=num1%num2;

        System.out.printf("%d / %d = %d R=%d \n",num1,num2,quotient,remainder);

    }
}
