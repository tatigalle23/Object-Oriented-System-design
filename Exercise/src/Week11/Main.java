package Week11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static boolean isCoprime(int a, int b) throws MyException{
            if(a<=1||b<=1){
                throw new MyException("integer can't be less or equal to 1; change to a bigger value");
            }
            if(a==b){
                throw new MyException("Both integers can't be equal; Change one of the values");
            }
            if(a>10000||b>10000){
                throw new MyException("integers can't be bigger than 10000; change to a smaller value");
            }
            int gcd = 1;
            int min, max;
            min = a;
            if (min > b) {
                min = b;
                max = a;
            } else {
                min = a;
                max = b;
            }
            while (max > min) {
                int r = max % min;
                if (r == 0) {
                    gcd = min;
                    break;
                } else {
                    max = min;
                    min = r;
                }
            }
            if (gcd == 1) {
                return true;
            }
            else{
                return false;
            }


    }
    public static void main(String[] args) {
        try{
            Scanner keyboard= new Scanner(System.in);
            int a= keyboard.nextInt();
            int b= keyboard.nextInt();
            boolean result= isCoprime(a,b);
            if(result){
                System.out.println("A and B are Coprime");
            }else{
                System.out.println("A and B are not Coprime");
            }

        }catch (InputMismatchException e){
            System.out.println("[InputMismatchException] Illegal Type; change to an integer");
        }catch (MyException e) {
            System.out.println(e.getMessage());
        }



    }
}
