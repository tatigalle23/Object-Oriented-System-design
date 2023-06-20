package Week13;

public class ComplexNumber {
    RealNumber real;
    RealNumber imaginary;

    public ComplexNumber(RealNumber realNumber, RealNumber imagiNumber) {
        this.real=realNumber;
        this.imaginary=imagiNumber;
    }

    public static class RealNumber{
        int dividend;
        int divisor;
        public RealNumber(int a, int b){
            this.dividend=a;
            this.divisor=b;
        }
        public String toString(){
            return this.dividend+"/"+this.divisor;
        }
    }

}
