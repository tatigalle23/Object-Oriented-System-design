package Week9;

import java.lang.annotation.Documented;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date myDate1=new Date(1994,3,8);
        Date myDate2=new Date(2010,11,12);
        Physician p3=new Physician();
        Patient p1=new Patient("Jonh",myDate1,null,"Surgery");
        Patient p2=new Patient("Chris",myDate2, null, "Internal");
        System.out.println(p1.toString());
        System.out.println("-Physician to "+p1.getName()+": ");
        p3.examination(p1);
        System.out.println(p2.toString());
        System.out.println("-Physician to  "+p2.getName()+": ");
        p3.examination(p2);
        System.out.println("-Doctor: ");
        Doctor doc=new Doctor();
        doc.examination(p1);




    }
}
