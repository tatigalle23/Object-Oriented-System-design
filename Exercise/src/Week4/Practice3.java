package Week4;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int num=keyboard.nextInt();
        double percentage=num;
        double ans=  percentage/ 100  * 4;

        System.out.printf("( %d / 100 ) * 4 = %d \n", num,(int) ans);

    }
}
