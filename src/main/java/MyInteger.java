import org.jetbrains.annotations.NotNull;

public class MyInteger extends MyRationalNumber{

    public MyInteger(int number) {
        super(number,1);
    }

    public MyInteger(MyInteger myInteger) {
        super(myInteger.getNumerator(), 1);
    }

    int getValue(){
        return this.getNumerator();
    }

    public MyInteger(MyNaturalNumber myNaturalNumber) {
        super(myNaturalNumber);
    }

    @Override
    public MyInteger add(@NotNull MyNumber operand) {
        if(!(operand instanceof MyInteger)){
            throw new IllegalArgumentException("정수가 아닙니다");
        }
        return new MyInteger(this.getValue() + ((MyInteger)operand).getValue());
    }

    @Override
    public MyInteger minus(@NotNull MyNumber operand) {
        if(!(operand instanceof MyInteger)){
            throw new IllegalArgumentException("정수가 아닙니다");
        }
        return new MyInteger(this.getValue() - ((MyInteger)operand).getValue());
    }

    @Override
    public MyInteger multipleBy(@NotNull MyNumber operand) {
        if(!(operand instanceof MyInteger)){
            throw new IllegalArgumentException("정수가 아닙니다");
        }
        return new MyInteger(this.getValue() * ((MyInteger)operand).getValue());

    }

    @Override
    public MyInteger divideBy(@NotNull MyNumber operand) {
        if(!(operand instanceof MyInteger)){
            throw new IllegalArgumentException("정수가 아닙니다");
        }
        if(((MyInteger) operand).getValue() == 0){
            throw new ArithmeticException("분모가 0이 되면 안됩니다");
        }
        return new MyInteger(this.getValue() / ((MyInteger)operand).getValue());
    }
}
