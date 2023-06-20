package Week9;

import Week7.Person;

import java.util.Date;

public class Patient extends Person {
    private String department;
    public Patient(String _name, Date _born, Date _died, String department) {
        super(_name, _born, _died);
        this.department=department;
    }
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department=department;
    }

    @Override
    public String toString() {
        return "[Patient] " + super.toString()+", department: " + department;
    }
}
