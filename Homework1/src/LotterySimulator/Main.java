package LotterySimulator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("<< ");
        int n = keyboard.nextInt();
        while (n != 0) {
            LotteryGenerator winningNumbers = new LotteryGenerator();
            int winningArr[] = winningNumbers.winning();
            System.out.print(">> Round Winning number: ");
            for (int i = 0; i < 6; i++) {
                System.out.print(winningArr[i] + " ");
            }
            System.out.print("+ " + winningArr[6]);
            int k = 0;
            System.out.println();
            LotteryChecker numbers = new LotteryChecker();
            while (k < n) {
                int ticketNum[] = winningNumbers.ticketNum();
                System.out.print(">> Lottery number: ");
                for (int i = 0; i < 6; i++) {
                    System.out.print(ticketNum[i] + " ");
                }
                int checkNum = numbers.rankTicket(winningArr, ticketNum);
                if (checkNum > 0) {
                    System.out.printf("Winner(%dth place)", checkNum);
                } else {
                    System.out.printf("Lose");
                }
                System.out.println();
                k++;
            }
            System.out.print("<< ");
            n = keyboard.nextInt();

        }
        System.out.println(">> End of program");
    }
}


