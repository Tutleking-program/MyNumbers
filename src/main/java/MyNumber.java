public abstract class MyNumber  {


    public abstract MyNumber add(MyNumber operand);
    public abstract MyNumber minus(MyNumber operand);
    public abstract MyNumber multipleBy(MyNumber operand);
    public abstract MyNumber divideBy(MyNumber operand);

    abstract int toInt();
    abstract double toDouble();

}
