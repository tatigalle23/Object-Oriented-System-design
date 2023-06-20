package Week7.util;
import Week7.Person;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class AgeCalculator {

    public static int calAge(Person p){
        LocalDate today=LocalDate.now();
        LocalDate birthday=LocalDate.of(p.getBorn().getYear(),p.getBorn().getMonth()+1,p.getBorn().getDate());

        return Period.between(birthday,today).getYears();
    }
    public static int isOlder(Person p1, Person p2){
        int check=1;
        int s1=calAge(p1);
        int s2=calAge(p2);
        if(s1>s2){
            check=1;
        }else if(s1<s2){
            check=-1;
        }else if(s1==s2){
            check=0;
        }
        return check;

    }
}
