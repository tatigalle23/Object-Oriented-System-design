package Week6;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Random;

public class Student {
    private String name;
    private int year;
    private int month;
    private int day;

    Student(String _name, int _year, int _month, int _day){
        name=_name;
        year=_year;
        month=_month;
        day=_day;
    }
    Student(String _name, int _year){
        Calendar calendar=Calendar.getInstance();
        name=_name;
        year=_year;
        Random rnd=new Random();
        month= rnd.nextInt(1,12);
        int maxDay=Calendar.getInstance().getActualMaximum(month);
        day= rnd.nextInt(1,maxDay);

    }
    public String getName(){
        return  name;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public boolean checkDate(int year,int month,int day){
        boolean check=true;
        if(year>=1000 && year<=9999){
            if((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&day<=31)
                check=true;
            else if((month==4||month==6||month==9||month==11)&&day<=30)
                check=true;
            else if(month==2&&day<=28)
                check=true;
            else
                check=false;
        }
        return check;
    }
    public int calAge(int year,int month,int day){
        LocalDate today=LocalDate.now();
        LocalDate birthday=LocalDate.of(year,month,day);

        return Period.between(birthday,today).getYears();

    }
    boolean isOlder(Student stu){
        boolean check=false;
        int s1=calAge(this.year,this.month,this.day);
        int s2=calAge(stu.getYear(), stu.getMonth(), stu.getDay());
        if(s1>s2){
            check=true;
        }else{
            check=false;
        }
        return check;
    }
}
