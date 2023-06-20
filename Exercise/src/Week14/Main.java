package Week14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input max number: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> primos=Eratos.sieve(n);
        for(int i=0;i< primos.size();i++){
            System.out.print(primos.get(i) +" ");
        }
    }
}
