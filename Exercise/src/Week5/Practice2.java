package Week5;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String optionPerson= keyboard.nextLine();
        String optionComputer="";
        Random rnd=new Random();
        int numComputer=rnd.nextInt(3);
        int numPerson=0;

        if(optionPerson.equals("scissors")){
            numPerson=0;
        }else if(optionPerson.equals("paper")){
            numPerson=1;
        }else if(optionPerson.equals("rock")){
            numPerson=2;
        }
        if(numComputer==0){
            optionComputer="scissors";
        }else if(numComputer==1){
            optionComputer="paper";
        }else if(numComputer==2){
            optionComputer="rock";
        }
        System.out.println("Computer's choice: "+optionComputer);

        if(numComputer==numPerson){
            System.out.println("Tie");
        }else if(numComputer==0&&numPerson==1){
            System.out.println("Computer win");
        }else if(numComputer==1&&numPerson==0){
            System.out.println("You win");
        }else if(numComputer==2&&numPerson==1){
            System.out.println("You win");
        }else if(numComputer==1&&numPerson==2) {
            System.out.println("Computer win");
        }else if(numComputer==2&&numPerson==0) {
            System.out.println("Computer win");
        }else if(numComputer==0&&numPerson==2) {
            System.out.println("You win");
        }





    }
}
