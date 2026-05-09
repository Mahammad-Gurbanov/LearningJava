package az.edu.ada.learningJava.week10;

public class NumericFunctions <N extends Number> {
    private N number;

    public NumericFunctions(N number){
        this.number = number;
    }

    public static void main(String[] args) {
        NumericFunctions<Integer> intFunction = new NumericFunctions<>(3);
        System.out.println(intFunction.getReciprocal());

        NumericFunctions<Double> doubleFunction = new NumericFunctions<>(3.9);
        System.out.println(doubleFunction.getReciprocal());

        NumericFunctions<Float> floatFunction = new NumericFunctions<>(3.2F);
        System.out.println(floatFunction.getReciprocal());
    }

    public double getReciprocal(){
        double reciprocal = 1 / number.doubleValue() * 100;
        reciprocal = Math.round(reciprocal);
        return reciprocal / 100;
    }
}
