package Week5;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int num= keyboard.nextInt();
        int multi=0;
        for(int i=1;i>0;i++){
            multi=num*i;
            if(multi<100){
                System.out.print(multi+", ");
            }else{
                break;
            }
        }
    }
}
