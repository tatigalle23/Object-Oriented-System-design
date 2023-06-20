package Week10;

public abstract class Taxi {
    private int carNum;
    private double distance;
    private double income;

    public Taxi(int carNum) {
        if(carNum>=1000&&carNum<=9999){
            this.carNum=carNum;
        }
        this.distance=0;
        this.income=0;

    }

    public String toString(){
        return "[Car Num]= "+this.carNum+" [distance]= "+this.distance+" [income]= "+this.income;
    }
    public abstract double getPaid(double distance);
    public void doDrive(double dis){
      this.distance+=dis;
      this.income=getPaid(dis);
    }
    public boolean earnMore(Taxi t){
        double t1=this.income;
        double t2=t.income;
        if(t1>t2){
            return true;
        }else{
            return false;
        }
    }


}
