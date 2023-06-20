package LotterySimulator;

public class LotteryChecker {
    LotteryChecker(){}
    public int rankTicket(int[] winningNum, int[] ticketNum){
        int count=0;

        for(int i=0;i<6;i++){
            for(int s: ticketNum){
                if(s==winningNum[i]){
                    count++;
                }
            }
        }
        if(count==5){
            for(int s: ticketNum){
                if(s==winningNum[6]){
                    count=7;
                }else{
                    count=5;
                }
            }
        }


        switch (count){
            case 6:
                return 1;
            case 5:
                return 3;
            case 4:
                return 4;
            case 3:
                return 5;
            case 7:
                return 2;
            default:
                return 0;
        }

    }
}
