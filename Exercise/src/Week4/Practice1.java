package Week4;
import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        keyboard.useDelimiter(",");
        String word=keyboard.nextLine();
        String[] arr= word.split(",",3);

        for(String a:arr){
            System.out.println(a);
        }


    }
}
