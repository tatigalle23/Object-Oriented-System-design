package Week13;

public interface ComplexNumberCalculator {
    ComplexNumber add(ComplexNumber c1, ComplexNumber c2);
    ComplexNumber sub(ComplexNumber c1, ComplexNumber c2);
    ComplexNumber mul(ComplexNumber c1, ComplexNumber c2);
    default void printResult(ComplexNumber c){
        System.out.println("Real: "+c.real.toString()+", Imaginary: "+c.imaginary.toString());
    }
}
