package Week8;

import java.util.Scanner;

public class Practice1 {
    public static int[][] drawSnail(int n){
        int[][] spiral=new int[n][n];
        int count = 1;
        int top = 0;
        int botoom = n-1;
        int left = 0;
        int right = n-1;

        while (count <= n*n)
        {
            for (int i = top; i <= botoom; i++)
            {
                spiral[left][i] = count;

                count++;
            }

            for (int i = left+1; i <= right; i++)
            {
                spiral[i][botoom] = count;

                count++;
            }

            for (int i = botoom-1; i >= top; i--)
            {
                spiral[right][i] = count;

                count++;
            }

            for (int i = right-1; i >= left+1; i--)
            {
                spiral[i][top] = count;

                count++;
            }
            top++;
            left++;
            botoom--;
            right--;
        }
        return spiral;

    }

    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int n= keyboard.nextInt();

        int[][] spiralOut=drawSnail(n);
        for (int i = 0; i < spiralOut.length; i++)
        {
            for (int j = 0; j < spiralOut.length; j++)
            {
                System.out.print(spiralOut[i][j]+ "\t");
            }

            System.out.println();
        }

    }
}
