package Week12;
import static java.lang.Math.floor;

public class BinarySearch {
    public int search(int A[],int start, int end, int x){
        int middle;
        if(start<=end){
            middle=(int)(floor(start+end))/2;
            if(A[middle]==x){
                return middle;
            }
            if(A[middle]>x){
                return search(A,start,middle-1,x);
            }
            if(A[middle]<x){
                return search(A,middle+1,end,x);
            }
        }
        return 0;
    }
}
