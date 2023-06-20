package Week10;

public class DeluxeTaxi extends Taxi{
    double farePerKilometer;
    double baseDistance=3;
    double baseFee=5;
    public DeluxeTaxi(int carNum, double farePerKilometer){
        super(carNum);
        if(farePerKilometer>(baseFee/baseDistance)){
            this.farePerKilometer=farePerKilometer;
        }

    }
    @Override
    public String toString(){
        return "[Deluxe Taxi]  "+super.toString();
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
