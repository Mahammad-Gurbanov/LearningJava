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

    public boolean equals(ComplexNumber otherComplexNum){
        return this.real == otherComplexNum.getReal() &&
                this.imag == otherComplexNum.getImag();
    }

    public String toString(){
        String res;
        if (this.imag > 0) res = String.format("%.2f + %.2fi",
                this.real, this.imag);
        else if (this.imag == 0) res = Double.toString(this.real);
        else res = String.format("%.2f - %.2fi",
                    this.real, Math.abs(this.imag));

        return res;
    }

}
