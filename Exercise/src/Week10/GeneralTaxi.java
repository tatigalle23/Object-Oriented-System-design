package Week10;

public class GeneralTaxi extends Taxi {
    private double farePerKilometer;
    private double baseDistance=3;
    private double baseFee=3;
    public GeneralTaxi(int carNum, double farePerKilometer){
        super(carNum);
        if(farePerKilometer>(baseFee/baseDistance)){
            this.farePerKilometer=farePerKilometer;
        }

    }

    @Override
    public String toString(){
        return "[General Taxi]  "+super.toString();
    }


    @Override
    public double getPaid(double distance) {
        if(distance<=baseDistance){
            return baseFee;
        }else{
            double extraDistance=distance-baseDistance;
            double pay=baseFee;
            pay+=extraDistance*farePerKilometer;
            return pay;
        }

    }

}
