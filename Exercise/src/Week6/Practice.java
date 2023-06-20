package Week6;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        String studentData,stuName1,stuName2,temp;
        studentData= keyboard.nextLine();
        StringTokenizer stk=new StringTokenizer(studentData);
        stuName1=stk.nextToken();
        temp=stk.nextToken();
        StringTokenizer stkTemp=new StringTokenizer(temp,".");
        String[] date=new String[3];
        date[0]=stkTemp.nextToken();
        date[1]=stkTemp.nextToken();
        date[2]=stkTemp.nextToken();

        stuName2= keyboard.nextLine();

        Student s1 =new Student(stuName1,Integer.parseInt(date[0]),Integer.parseInt(date[1]),Integer.parseInt(date[2]));
        Student s2 = new Student(stuName2,Integer.parseInt(date[0]));

        if(s1.checkDate(s1.getYear(),s1.getMonth(),s1.getDay())==false){
            System.out.println("invalid input\n");
        }
        int age1= s1.calAge(s1.getYear(),s1.getMonth(),s1.getDay());
        int age2=s2.calAge(s2.getYear(),s2.getMonth(),s2.getDay());
        System.out.printf("%s %d/%d/%d age: %d\n", s1.getName(),s1.getYear(),s1.getMonth(),s1.getDay(),age1);
        System.out.printf("%s %d/%d/%d age: %d\n", s2.getName(),s2.getYear(),s2.getMonth(),s2.getDay(),age2);
        boolean check=s1.isOlder(s2);
        if(check==true){
            System.out.printf("%s is older than %s\n",s1.getName(),s2.getName());
        }else{
            System.out.printf("%s is older than %s\n",s2.getName(),s1.getName());
        }

    }
}
