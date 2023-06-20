package Week8;
import Week7.*;
import Week7.util.AgeCalculator;
import java.util.*;

public class Practice2 {
    public static int getDay(){
        Random rnd=new Random();
        int day= rnd.nextInt(1,28);
        return day;
    }
    public static int getMonth(){
        Random rnd=new Random();
        int month=rnd.nextInt(1,12);
        return month;
    }
    public static int getYear(){
        Random rnd=new Random();
        int year=rnd.nextInt(1922,2020);
        return year;
    }

    public static void main(String[] args) {
        String[] names={"Kihyun","Shownu","Wonho","Minhyuk","Jooheon","Changkyun","Hyungwon","Jeonghan","Xiao zhan","Deng Lun"};
        Person[] arr=new Person[10];
        System.out.println("Array before sorting: ");
        for(int i=0;i<10;i++){
            Date born=new Date(getYear(),getMonth(),getDay());
            arr[i]=new Person(names[i],born,null);
            System.out.println(arr[i].getName()+" "+ AgeCalculator.calAge(arr[i]));
        }
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(AgeCalculator.calAge(arr[i])>AgeCalculator.calAge(arr[j])){
                    Person temp=new Person(arr[i].getName(),arr[i].getBorn(),arr[i].getDied());
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array after sorting: ");
        for(int i=0;i<10;i++){
            System.out.println(arr[i].getName()+" "+ AgeCalculator.calAge(arr[i]));
        }



    }


}
