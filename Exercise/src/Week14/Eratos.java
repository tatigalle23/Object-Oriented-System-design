package Week14;

import java.util.ArrayList;
import java.util.Arrays;

public class Eratos {
    public static ArrayList<Integer> sieve(int n){
        ArrayList<Integer> primos=new ArrayList<Integer>(n);
        boolean[] check=new boolean[n+1];

        for(int i=0;i<=n;i++){
            check[i]=true;
        }
        //DIFFICULT WAY WITH REMOVE (if we use this one the print
        //must be dine since i=2 until n)
        /*for(int i=0;i<=n;i++){
            primos.add(i);
        }
        for(int i=n;i>2;i--) {
            if (check[i] == false) {
                primos.remove(i);
            }
        }*/

        //EASY WAY JUST ADDING
        for(int i=2;i<=n/2;i++){
            if(check[i]==true) {
                for (int j = i; j * i <= n; j++) {
                    check[j*i] = false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(check[i]==true){
                primos.add(i);
            }
        }
        return primos;
    }
}
