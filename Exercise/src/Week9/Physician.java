package Week9;

public class Physician extends Doctor{
    @Override
    void examination(Patient p) {
        //super.examination(p);
        if(p.getDepartment().equals("Internal")){
            System.out.println("I'll take care of you!");
        }
        else{
            System.out.println("Sorry, but it's not my major");
        }
    }
}
