import org.jetbrains.annotations.NotNull;

public class MyNaturalNumber extends MyInteger {

    public MyNaturalNumber(int number) {
        super(number);
        if(number <= 0){
            throw new IllegalArgumentException("0 보다 큰 자연수를 입력하시오");
        }
    }

    public MyNaturalNumber(MyNaturalNumber myNaturalNumber){
        super(myNaturalNumber);
    }

    @Override
    int getValue() {
        return this.getNumerator();
    }

    @Override
    public MyNaturalNumber add(@NotNull MyNumber operand) {
        if(!(operand instanceof MyNaturalNumber)){
            throw new IllegalArgumentException("자연수가 아닙니다");
        }
        return new MyNaturalNumber(this.getValue() + ((MyNaturalNumber)operand).getValue());
    }

    @Override
    public MyNaturalNumber minus(@NotNull MyNumber operand) {
        if(!(operand instanceof MyNaturalNumber)){
            throw new IllegalArgumentException("자연수가 아닙니다");
        }
        return new MyNaturalNumber(this.getValue() - ((MyNaturalNumber)operand).getValue());
    }

    @Override
    public MyNaturalNumber multipleBy(@NotNull MyNumber operand) {
        if(!(operand instanceof MyNaturalNumber)){
            throw new IllegalArgumentException("자연수가 아닙니다");
        }
        return new MyNaturalNumber(this.getValue() * ((MyNaturalNumber)operand).getValue());

    }

    @Override
    public MyNaturalNumber divideBy(@NotNull MyNumber operand) {
        if(!(operand instanceof MyNaturalNumber)){
            throw new IllegalArgumentException("자연수가 아닙니다");
        }
        if(((MyNaturalNumber) operand).getValue() == 0){
            throw new ArithmeticException("분모가 0이 되면 안됩니다");
        }
        return new MyNaturalNumber(this.getValue() / ((MyNaturalNumber)operand).getValue());
    }
}