package LotterySimulator;
import java.util.Random;

public class LotteryGenerator {
    LotteryGenerator(){}
    public int[] winning(){
        int[] winningNum=new int[7];
        Random rnd=new Random();

        for(int i=0;i<7;i++){
            winningNum[i]= rnd.nextInt(1,10);
            for(int j=0;j<i;j++){
                if(winningNum[i]==winningNum[j]){
                    i--;
                    break;
                }
            }
        }
        return winningNum;

    }
    public int[] ticketNum(){
        int[] winningNum=new int[7];
        Random rnd=new Random();

        for(int i=0;i<6;i++){
            winningNum[i]= rnd.nextInt(1,10);
            for(int j=0;j<i;j++){
                if(winningNum[i]==winningNum[j]){
                    i--;
                    break;
                }
            }
        }
        return winningNum;
    }
}
