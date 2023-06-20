package Week7;

import java.util.Date;

public class Person {
    private String name;
    private Date born;
    private Date died;

    public Person(String _name, Date _born, Date _died){
        if(!consistent(_born, _died)){
            System.out.println("Inconsistent dates");
            System.exit(1);
        }else{
            this.name=_name;
            this.born=new Date(_born.getYear(),_born.getMonth(), _born.getDate());
            if(_died!=null){
                this.died= new Date(_died.getYear(),_died.getMonth(), _died.getDate());
            }else{
                this.died=null;
            }
        }
    }

    public String getName(){
        return this.name;
    }
    public Date getBorn(){
        return new Date(born.getYear(),born.getMonth(),born.getDate());
    }
    public Date getDied(){
        if(died==null) return null;
        return new Date(died.getYear(),died.getMonth(),died.getDate());
    }
    public void setName(String _name){
        this.name=_name;
    }
    public void setBorn(Date _born){
        if(_born==null){
            System.out.println("Invalid date");
            return ;
        }
        this.born=new Date(born.getYear(),born.getMonth(),born.getDate());
    }

    public void setDied(Date _died) {
        if(_died==null){
            this.died=null;
        }else{
            this.died=new Date(died.getYear(),died.getMonth(),died.getDate());
        }

    }

    private static boolean consistent(Date born, Date died){
        if(born==null) return false;
        else if(died==null) return true;
        else return(born.compareTo(died)<=0);

    }
    public String toString( ){
        String result="Name : "+this.name+", Born in "+(born.getMonth()+1)+"/"+born.getDate()+"/"+born.getYear();
        if(this.died!=null)
            result+=", died in "+(died.getMonth()+1)+"/"+died.getDate()+"/"+died.getYear();

        return result;
    }
    public boolean equals(Person other){
        if(other==null)
            return false;
        else
            return(name.equals(other.name)&&born.equals(other.born)&&datesMatch(died,other.died));
    }
    private static boolean datesMatch(Date date1, Date date2){
        if(date1==null)
            return (date2==null);
        else if(date2==null)
            return false;
        else
            return(date1.equals(date2));
    }

}
