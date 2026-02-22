package az.edu.ada.learningJava.week3.Math;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal(){
        return this.real;
    }

    public double getImag(){
        return this.imag;
    }

}
