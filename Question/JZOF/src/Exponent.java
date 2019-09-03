package JZOffer;

public class Exponent {
    public double Power(double base, int exponent) {
        if(exponent == 0)
            return 1;

        double sum = 1.00;
        if(exponent > 0) {
            for (int i = 0; i < exponent; i++) sum *= base;
            return sum;
        }
        else {
            for(int i=0; i<-exponent;i++) sum *= base;
            return 1.0/sum;
        }
    }
    public static void main(String[] args){
        Exponent exponent = new Exponent();
        System.out.println(exponent.Power(2,-5));
    }
}
