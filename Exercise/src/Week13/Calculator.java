package Week13;

public class Calculator implements RealNumberCalculator, ComplexNumberCalculator{

    @Override
    public ComplexNumber.RealNumber add(ComplexNumber.RealNumber c1, ComplexNumber.RealNumber c2){
        ComplexNumber.RealNumber result= new ComplexNumber.RealNumber(0,0);
        result.dividend= c1.dividend+ c2.dividend;
        result.divisor=c1.divisor;
        return result;
    }

    @Override
    public ComplexNumber.RealNumber sub(ComplexNumber.RealNumber c1, ComplexNumber.RealNumber c2) {
        ComplexNumber.RealNumber result= new ComplexNumber.RealNumber(0,0);
        result.dividend= c1.dividend-c2.dividend;
        result.divisor=c1.divisor;
        return result;
    }

    @Override
    public ComplexNumber.RealNumber mul(ComplexNumber.RealNumber c1, ComplexNumber.RealNumber c2) {
        ComplexNumber.RealNumber result= new ComplexNumber.RealNumber(0,0);
        result.dividend= c1.dividend*c2.dividend;
        result.divisor=c1.divisor*c2.divisor;
        return result;
    }
    @Override
    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber result = new ComplexNumber(new ComplexNumber.RealNumber(0,0),new ComplexNumber.RealNumber(0,0));
        result.imaginary=add(c1.imaginary,c2.imaginary);
        result.real=add(c1.real,c2.real);
        return result;
    }
    @Override
    public ComplexNumber sub(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber result = new ComplexNumber(new ComplexNumber.RealNumber(0,0),new ComplexNumber.RealNumber(0,0));
        result.imaginary=sub(c1.imaginary,c2.imaginary);
        result.real=sub(c1.real,c2.real);
        return result;

    }
    @Override
    public ComplexNumber mul(ComplexNumber c1, ComplexNumber c2){
        ComplexNumber result = new ComplexNumber(new ComplexNumber.RealNumber(0,0),new ComplexNumber.RealNumber(0,0));
        result.imaginary=mul(c1.imaginary,c2.imaginary);
        result.real=mul(c1.real,c2.real);
        return result;

    }

    public static void main(String[] args) {
        Calculator calc= new Calculator();
        ComplexNumber c1= new ComplexNumber(new ComplexNumber.RealNumber(4,10), new ComplexNumber.RealNumber(3,2));
        ComplexNumber c2= new ComplexNumber(new ComplexNumber.RealNumber(3,10), new ComplexNumber.RealNumber(-4,2));
        calc.printResult(calc.sub(c1,c2));
        calc.printResult(calc.mul(c1,c2));

    }
}
