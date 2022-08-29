import org.jetbrains.annotations.NotNull;

public class MyRationalNumber extends MyNumber{

    private int numerator=0; //분자
    private int denominator=1; //분모

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public MyRationalNumber(int numerator, int denominator) {
        if(denominator == 0){
            throw new ArithmeticException("분모가 0이 되면 안됩니다");
        }

        if(denominator < 0){
            numerator = -numerator;
            denominator = -denominator;
        }

        int gcd = getGCD(Math.abs(numerator),Math.abs(denominator)); // 20

        this.numerator = numerator/gcd; //40 //2
        this.denominator = denominator/gcd; // 60 //3
    }

    public MyRationalNumber(MyRationalNumber myRationalNumber) {
        this(myRationalNumber.getNumerator(), myRationalNumber.getDenominator());
    }

    @Override
    public String toString() {

        if(denominator == 1){
            return String.valueOf(numerator);
        }else {
            return (numerator + " / " + denominator);
        }

    }

    @Override
    public MyRationalNumber add(@NotNull MyNumber operand) {
        if(!(operand instanceof MyRationalNumber)){
            throw new IllegalArgumentException("유리수가 아닙니다");
        }

        return new MyRationalNumber(this.denominator* ((MyRationalNumber) operand).getNumerator()
                + this.numerator * ((MyRationalNumber) operand).getDenominator() ,
                this.denominator * ((MyRationalNumber) operand).getDenominator());
    }

    @Override
    public MyRationalNumber minus(@NotNull MyNumber operand) {
        if(!(operand instanceof MyRationalNumber)){
            throw new IllegalArgumentException("유리수가 아닙니다");
        }

        return new MyRationalNumber(this.numerator * ((MyRationalNumber) operand).getDenominator() -
                this.denominator* ((MyRationalNumber) operand).getNumerator(),
                this.denominator * ((MyRationalNumber) operand).getDenominator());
    }

    @Override
    public MyRationalNumber multipleBy(@NotNull MyNumber operand) {
        if(!(operand instanceof MyRationalNumber)){
            throw new IllegalArgumentException("유리수가 아닙니다");
        }

        return new MyRationalNumber(this.numerator*((MyRationalNumber) operand).getNumerator(),
                this.denominator*((MyRationalNumber) operand).getDenominator());
    }

    @Override
    public MyRationalNumber divideBy(@NotNull MyNumber operand) {
        if(!(operand instanceof MyRationalNumber)){
            throw new IllegalArgumentException("유리수가 아닙니다");
        }

        if(((MyRationalNumber) operand).getDenominator() == 0){
            throw new ArithmeticException("분모가 0이 되면 안됩니다");
        }
        return new MyRationalNumber(this.numerator * ((MyRationalNumber) operand).getDenominator(),
                this.denominator * ((MyRationalNumber) operand).getNumerator());
    }

    private int getGCD(int a ,int b){ //최대 공약수
        if(b==0){
            return a;
        }else{
            return getGCD(b,a%b);
        }
    }


    @Override
    int toInt() {
        return (this.numerator/this.denominator);
    }

    @Override
    double toDouble() {
        return (this.numerator/(double)this.denominator);
    }
}
