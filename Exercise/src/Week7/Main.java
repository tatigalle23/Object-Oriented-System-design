package Week7;
import java.util.Date;
import Week7.util.AgeCalculator;

public class Main {
    public static void main(String[] args) {
        Date myDate1=new Date(1994,3,8);
        Date myDate2=new Date(2010,11,12);
        Date myDate3=new Date(2001,11,14);

        Person p1=new Person("Jonh",myDate1,myDate2);
        Person p2= new Person("Chris",myDate3, null);
        System.out.println(p1.toString());
        System.out.println(p2.toString());


        int age1=AgeCalculator.calAge(p1);
        int age2=AgeCalculator.calAge(p2);
        System.out.printf("Age of %s : %d \n",p1.getName(),age1);
        System.out.printf("Age of %s : %d \n",p2.getName(),age2);
        int compare=AgeCalculator.isOlder(p1,p2);
        if(compare==1){
            System.out.printf("%s is older than %s \n",p1.getName(),p2.getName());
        }else if(compare==-1){
            System.out.printf("%s is older than %s \n",p2.getName(),p1.getName());
        }else if(compare==0){
            System.out.println("Both person have the same age");
        }

    }
}
