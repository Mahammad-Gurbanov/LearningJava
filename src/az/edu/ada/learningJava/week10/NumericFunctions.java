package az.edu.ada.learningJava.week10;

public class NumericFunctions <N extends Number> {
    private N number;

    public NumericFunctions(N number){
        this.number = number;
    }

    public static void main(String[] args) {
        NumericFunctions<Integer> intFunction = new NumericFunctions<>(3);
        NumericFunctions<Double> doubleFunction = new NumericFunctions<>(-3.9);
        NumericFunctions<Float> floatFunction = new NumericFunctions<>(3.21F);

        System.out.println(intFunction.isAbsEqual(-3));
        System.out.println(floatFunction.isAbsEqual(3.12F));
    }

    public double getReciprocal(){
        if (number.equals(0)){
            throw new IllegalArgumentException("Reciprocal of zero isn't defined");
        }
        double reciprocal = 1 / number.doubleValue() * 100;
        reciprocal = Math.round(reciprocal);
        return reciprocal / 100;
    }

    public double getFraction(){
        double fraction = (number.doubleValue() - number.intValue()) * 100;
        fraction = Math.round(fraction);
        return Math.abs(fraction / 100);
    }

    public boolean isAbsEqual(N other){
        double absNumber = Math.abs(number.doubleValue());
        double absOther = Math.abs(other.doubleValue());
        return Double.compare(absNumber, absOther) == 0;
    }
}
