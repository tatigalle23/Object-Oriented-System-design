package Week12;
import java.util.Scanner;
import java.io.*;

public class Practice {
    public static void main(String[] args) {
        Scanner object=null;
        try{
            object=new Scanner(new FileInputStream("C:\\Users\\tatig\\Desktop\\input.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("File \"input.txt\" was not found!");
            System.exit(0);
        }
        int[] target=new int[100];
        int[] array=new int[100000];
        int index;
        for(int i=0;i<100;i++){
            target[i]= object.nextInt();
        }
        object.nextLine();
        for(int i=0;i<100000;i++){
          array[i]= object.nextInt();
        }
        BinarySearch binarySearch=new BinarySearch();
        for(int i=0;i<100;i++){
            index=binarySearch.search(array,0,100000,target[i]);
            System.out.println("target: "+target[i]+"\t index: "+index);
        }

    }
}
